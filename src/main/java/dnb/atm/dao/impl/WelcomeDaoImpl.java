/*
 * 
 * */

package dnb.atm.dao.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dnb.atm.dao.WelcomeDao;
import dnb.atm.model.TransactionModel;
import dnb.atm.service.impl.WelcomeServiceImpl;
import dnb.atm.utils.CommonFuntion;
import dnb.atm.utils.Constants;

@Component
public class WelcomeDaoImpl implements WelcomeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${dnb.gcs.sql.updateAccountTbl}")
    private String updateAccount;

    @Value("${dnb.gcs.sql.updateBalanceWithMinus}")
    private String updateBalanceWithMinus;

    @Value("${dnb.gcs.sql.updateBalanceWithSum}")
    private String updateBalanceWithSum;

    @Value("${dnb.gcs.sql.getAccountIDWithCondition}")
    private String getAccountID;

    @Value("${dnb.gcs.sql.getAccountID}")
    private String getAccID;

    @Value("${dnb.gcs.sql.getUserName}")
    private String getUserName;

    @Value("${dnb.gcs.sql.updateTranSactionDetail}")
    private String updateTranSactionDetail;

    private static final Logger logger = LogManager.getLogger(WelcomeServiceImpl.class);

    /**
     * getMoney
     * 
     * @param obj CustomerModel
     * @param amount int
     * @return TransactionModel
     * @author duybk.sp
     **/
    @Override
    public TransactionModel getMoney(String accountId, int amount) {
        TransactionModel obj = new TransactionModel();
        int result = this.jdbcTemplate.update(this.updateAccount, new Object[] {
                amount, accountId
        });
        if (result == 1) {
            obj.setMessageTransaction(Constants.SUCCESS_MSG);
            obj.setDescriptionTransaction(
                    "You got " + CommonFuntion.formatNumber(amount) + " VND from your account ");
        } else {
            obj.setMessageTransaction(Constants.FAIL_MSG);
        }
        return obj;
    }

    /**
     * send money from sender to receiver
     * 
     * @param senderID String
     * @param amount int
     * @param receiver String
     * @return String
     * @author lochl.cz
     **/
    @Override
    @Transactional
    public TransactionModel sendMoney(String senderID, int amount, String receiver) {
        TransactionModel obj = new TransactionModel();
        int result_minus = this.jdbcTemplate.update(this.updateBalanceWithMinus, new Object[] {
                amount, senderID
        });
        int result_add = this.jdbcTemplate.update(this.updateBalanceWithSum, new Object[] {
                amount, receiver
        });
        if (result_minus == Constants.ONE && result_add == Constants.ONE) {
            obj.setMessageTransaction(Constants.SUCCESS_MSG);
            obj.setDescriptionTransaction("You sent to " + receiver + " with amount "
                    + CommonFuntion.formatNumber(amount) + " VND");
        } else {
            obj.setMessageTransaction(Constants.FAIL_MSG);
        }
        obj.setCurrentPage("sendMoneyPage");
        return obj;
    }

    /**
     * check is money enough
     * 
     * @param accountId String
     * @param amount int
     * @return boolean
     * @author lochl.cz
     **/
    @Override
    public boolean isEnoughMoney(String accountId, int amount) {
        String accountID = Constants.EMPTY;
        boolean isEnough = false;
        try {
            accountID = this.jdbcTemplate.queryForObject(this.getAccountID, new Object[] {
                    accountId, amount
            }, String.class);
            if (accountID.length() > 0) {
                isEnough = true;
            }
        } catch (EmptyResultDataAccessException e) {
            logger.info(e);
        }
        return isEnough;
    }

    /**
     * check is receiver account exist
     * 
     * @param receiverID String
     * @return boolean
     * @author lochl.cz
     **/
    @Override
    public boolean isAccountExist(String receiverID) {
        String receiver = Constants.EMPTY;
        boolean isExist = false;
        try {
            receiver = this.jdbcTemplate.queryForObject(this.getAccID, new Object[] {
                    receiverID
            }, String.class);
            if (receiver.length() > Constants.ZERO) {
                isExist = true;
            }
        } catch (EmptyResultDataAccessException e) {
            logger.info(e);
        }
        return isExist;
    }

    /**
     * Add money to account with specified amount
     * 
     * @param accountId
     * @param amount
     * @return String
     */
    @Override
    public TransactionModel addMoney(String accountId, int amount) {
        TransactionModel obj = new TransactionModel();
        int result = Constants.ZERO;
        result = this.jdbcTemplate.update(this.updateBalanceWithSum, new Integer(amount),
                accountId);
        if (result == Constants.ONE) {
            obj.setMessageTransaction(Constants.SUCCESS_MSG);
            obj.setDescriptionTransaction("You added into account " + accountId + " with amount "
                    + CommonFuntion.formatNumber(amount) + "VND");
        } else {
            obj.setMessageTransaction(Constants.FAIL_MSG);
        }
        obj.setCurrentPage(Constants.LINK_ADD_MONEY_PAGE);
        return obj;
    }

    /**
     * store the detail of transaction into database
     * 
     * @param senderId String
     * @param receiver String
     * @param type int
     * @param amount int
     * @param description String
     * @author lochl.cz
     **/
    @Override
    public void storeTransactionDetail(String senderId, String receiver, int type, int amount,
            String description) {
        String sql = updateTranSactionDetail;
        this.jdbcTemplate.update(sql, new Object[] {
                senderId, receiver, type, amount, description
        });
    }

    /**
     * storeTransactionDetail
     * 
     * @param senderId String
     * @param amount int
     * @param receiver String
     * @author duybk.sp
     **/
    public void addInfToTransactionTbl(String accountID, int amount) {
        String sql = "INSERT INTO transactiondetail (Time, AccountId, Description) VALUES (now(),?,?)";
        String description = accountID + " has get " + amount;
        jdbcTemplate.update(sql, new Object[] {
                accountID, description
        });
    }

    /**
     * get UserName by AccountID
     * 
     * @param receiverID String
     * @return String
     * @author lochl.cz
     **/
    @Override
    public String getNameUser(String receiverID) {
        String username = Constants.EMPTY;
        try {
            username = this.jdbcTemplate.queryForObject(this.getUserName, new Object[] {
                    receiverID
            }, String.class);
        } catch (EmptyResultDataAccessException e) {
            logger.info(e);
        }
        return username;
    }

    /**
     * store Add Money Transaction Detail
     * 
     * @param accountID String
     * @param amount int
     * @author duybk.sp
     **/
    public void storeAddMoneyTransactionDetail(String accountID, int amount) {
        String sql = "INSERT INTO transactiondetail (Time, AccountId, Description) VALUES (now(),?,?)";
        String description = accountID + " has add " + amount;
        jdbcTemplate.update(sql, new Object[] {
                accountID, description
        });
    }

}
