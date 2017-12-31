
package dnb.atm.dao;

import java.net.ConnectException;

import dnb.atm.model.CustomerModel;

public interface LoginDao {

    /**
     * Check if user exits in database and return view page
     * 
     * @param: username String
     * @param: pass String
     * @return String
     * @author duybk.sp
     * @throws ConnectException
     **/
    public CustomerModel login(String username, String pass) throws ConnectException;

}
