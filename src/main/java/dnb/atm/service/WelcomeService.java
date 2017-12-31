
package dnb.atm.service;

import dnb.atm.model.TransactionModel;

public interface WelcomeService {

    /**
     * get Money
     * 
     * @param: accountId String
     * @param: amount int
     * @return TransactionModel
     * @author duybk.sp
     **/
    public TransactionModel getMoney(String accountId, int amount);

    /**
     * sendMoney
     * 
     * @param receiverId String
     * @param amount int
     * @param receiver String
     * @return int
     * @author lochl.cz
     **/
    public TransactionModel sendMoney(String senderId, int amount, String receiver);

    /**
     * Add money to account with specified amount
     * 
     * @param accountId
     * @param amount
     * @return integer
     * @author duybk.sp
     */
    public TransactionModel addMoney(String sender, String accountId, int amount);

    /**
     * Get Receiver Name by Account ID
     * 
     * @param receiverId String
     * @return String
     * @author lochl.cz
     */
    public String getReceiverName(String receiverId);
}
