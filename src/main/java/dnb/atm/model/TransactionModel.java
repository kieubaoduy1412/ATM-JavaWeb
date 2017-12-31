
package dnb.atm.model;

import java.io.Serializable;

/**
 * @author phuctd.lt
 **/
public class TransactionModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int amount;

    private String receiverID;

    private String receriverName;

    private String currentPage;

    private String messageTransaction;

    private String descriptionTransaction;

    private int type;

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getReceriverName() {
        return receriverName;
    }

    public void setReceriverName(String receriverName) {
        this.receriverName = receriverName;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getMessageTransaction() {
        return messageTransaction;
    }

    public void setMessageTransaction(String messageTransaction) {
        this.messageTransaction = messageTransaction;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescriptionTransaction() {
        return descriptionTransaction;
    }

    public void setDescriptionTransaction(String descriptionTransaction) {
        this.descriptionTransaction = descriptionTransaction;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
