
package dnb.atm.utils;

/**
 * Constants for business
 * 
 * @author phuctd.lt
 */
public class Constants {

    /** The Constant ZERO. */
    public static final int ZERO = 0;

    /** The Constant ONE. */
    public static final int ONE = 1;

    /** The Constant EMPTY. */
    public static final String EMPTY = "";

    /** The Constant SUCCESS. */
    public static final String SUCCESS = "success";

    /** The Constant MESSAGE. */
    public static final String MESSAGE = "message";

    /** The Constant WELCOME. */
    public static final String WELCOME = "welcome";

    /** The Constant ERROR. */
    public static final String ERROR = "error";

    /** The Constant LOGIN. */
    public static final String LOGIN = "login";

    /** The Constant GO_TO_SEND_MONEY_PAGE */
    public static final String GO_TO_SEND_MONEY_PAGE = "/transferMoney";

    /** The Constant GO_TO_WELCOME_PAGE */
    public static final String GO_TO_WELCOME_PAGE = "/home";

    /** The Constant CANCEL_ACTION */
    public static final String CANCEL_ACTION = "/cancelAction";

    /** The Constant ADD_MONEY. */
    public static final String ADD_MONEY = "/addMoney";

    /** The Constant LINK_ADD_MONEY_PAGE. */
    public static final String LINK_ADD_MONEY_PAGE = "/payinMoney";

    /** The Constant LINK_ADD_MONEY_PAGE. */
    public static final String LINK_GET_MONEY_PAGE = "/withdrawMoney";

    /** The Constant LOGIN_PAGE. */
    public static final String LINK_LOGIN_PAGE = "/login";

    /** The Constant ADD_MONEY_PAGE. */
    public static final String ADD_MONEY_PAGE = "addMoney";

    /** The Constant SEND_MONEY_PAGE. */
    public static final String SEND_MONEY_PAGE = "sendMoney";

    /** The Constant SEND_MONEY_PAGE. */
    public static final String GET_MONEY_PAGE = "getMoney";

    /** The Constant SEND_MONEY. */
    public static final String SEND_MONEY = "/sendMoney";

    /** The Constant GET_MONEY. */
    public static final String GET_MONEY = "/getMoney";

    /** The Constant SESSION_ACOUNT_ID. */
    public static final String SESSION_ACOUNT_ID = "SESSION_ACID";

    /** The Constant RECEIVER_ID. */
    public static final String RECEIVER_ID = "receiverID";

    /** The Constant AMOUNT. */
    public static final String AMOUNT = "amount";

    /** The Constant NOT_ENOUGH_MONEY. */
    public static final String NOT_ENOUGH_MONEY = "You don't have enough money";

    /** The Constant NOT_FOUND_RECEIVER. */
    public static final String NOT_FOUND_RECEIVER = "Receiver does not exist";

    /** The Constant SYSTEM_FAIL. */
    public static final String SYSTEM_FAIL = "System fail";

    /** The Constant INPUT_FORMAT_EXCEPTION. */
    public static final String INPUT_FORMAT_EXCEPTION = "Input format exception";

    /** The Constant INF_CUST. */
    public static final String INF_CUST = "infCustomer";

    /** The constant MIN_AMOUNT */
    public static final int MIN_AMOUNT = 50000;

    /** The Constant LESS_THAN_MIN_AMOUNT */
    public static final String LESS_THAN_MIN_AMOUNT = "Amount at least 50,000 VND";

    /** The Constant TRANSACTION_MODEL */
    public static final String TRANSACTION_MODEL = "transactionModel";

    /** The Constant CUSTOMER_MODEL */
    public static final String CUSTOMER_MODEL = "customerModel";

    /** The Constant SUCCESS_MSG. */
    public static final String SUCCESS_MSG = "Your transaction was successful";

    public static final String FAIL_MSG = "Your transaction was fail";

    /** The Constant INF_MSG. */
    public static final String INF_MSG = "informMsg";

    /** The Constant JSON_EMPTY. */
    public static final String JSON_EMPTY = "[]";

    /** The Constant TIME_OUT. */
    public static final String TIME_OUT = "Connection time out";

    /** The Constant WRONG_USER. */
    public static final String WRONG_USER = "Wrong Account ID or password";

    /** The Constant CANT_SEND_FOR_YOURSELF. */
    public static final String CANT_SEND_FOR_YOURSELF = "Can not send for yourself";

    /** The Constant GO_TO_SUCCESS. */
    public static final String GO_TO_SUCCESS = "/transactionSuccess";

    /** The Constant SESSION_TRANSACTION_MODEL. */
    public static final String SESSION_TRANSACTION_MODEL = "SESSION_TRANSACTION_MODEL";

    /** The Constant RECEIVERNAME. */
    public static final String RECEIVERNAME = "receiverName";

    /** The Constant CONFIRM_SEND_MONEY. */
    public static final String CONFIRM_SEND_MONEY = "/confirmSendMoney";

    /** The Constant AMOUNT_TOO_LARGE. */
    public static final String AMOUNT_TOO_LARGE = "The amount is too large, please contact with teller at the bank";

    /** The Constant MAX_AMOUNT. */
    public static final int MAX_AMOUNT = 100000000;

    /** The Constant MUST_LOG_OUT. */
    public static final String MUST_LOG_OUT = "Please logout before login another Account";

    /** The Constant TYPE_SEND. */
    public static final int TYPE_TRANSFER = 3;

    /** The Constant TYPE_PAYIN. */
    public static final int TYPE_PAYIN = 1;

    /** The Constant TYPE_WITHDRAW. */
    public static final int TYPE_WITHDRAW = 2;

}