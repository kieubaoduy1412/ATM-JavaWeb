
package dnb.atm.service;

import java.net.ConnectException;

import dnb.atm.model.CustomerModel;

public interface LoginService {
    /**
     * Check if account is exits and return Customer Object
     * 
     * @param username String
     * @param pass String
     * @return CustomerModel
     * @author duybk.sp
     **/
    public CustomerModel login(String username, String pass) throws ConnectException;
}
