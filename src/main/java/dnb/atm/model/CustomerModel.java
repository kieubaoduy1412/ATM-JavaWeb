
package dnb.atm.model;

import java.io.Serializable;

/**
 * @author phuctd.lt
 **/
public class CustomerModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userName;

    private String accountID;

    private int balance;

    private boolean flagTransaction;

    private String message;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountIDVal) {
        this.accountID = accountIDVal;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isFlagTransaction() {
        return flagTransaction;
    }

    public void setFlagTransaction(boolean flagTransaction) {
        this.flagTransaction = flagTransaction;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
