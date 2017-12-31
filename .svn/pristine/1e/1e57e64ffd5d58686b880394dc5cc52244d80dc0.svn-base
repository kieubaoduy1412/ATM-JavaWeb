
package dnb.atm.dao;

import dnb.atm.model.TransactionModel;

public interface WelcomeDao {

    /**
     * getMoney
     * 
     * @param obj CustomerModel
     * @param amount int
     * @return TransactionModel
     * @author duybk.sp
     **/
    public TransactionModel getMoney(String accountID, int amount);

    /**
     * send money from sender to receiver
     * 
     * @param senderID String
     * @param amount int
     * @param receiver String
     * @return int
     * @author lochl.cz
     **/
    public TransactionModel sendMoney(String senderId, int amount, String receiver);

    /**
     * check is money enough
     * 
     * @param accountId String
     * @param amount int
     * @return boolean
     * @author lochl.cz
     **/
    public boolean isEnoughMoney(String accountId, int amount);

    /**
     * check is receiver account exist
     * 
     * @param receiverID String
     * @return boolean
     * @author lochl.cz
     **/
    public boolean isAccountExist(String receiver);

    /**
     * Add money to account with specified amount
     * 
     * @param accountId
     * @param amount
     * @return String
     */
    public TransactionModel addMoney(String accountId, int amount);

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
    public void storeTransactionDetail(String senderId, String receiver, int type, int amount,
            String description);

    /**
     * get UserName by AccountID
     * 
     * @param receiverID String
     * @return String
     * @author lochl.cz
     **/
    public String getNameUser(String receiverID);
}
