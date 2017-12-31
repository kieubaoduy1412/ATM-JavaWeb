
package dnb.atm.service.impl;

import java.net.ConnectException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dnb.atm.dao.LoginDao;
import dnb.atm.model.CustomerModel;
import dnb.atm.service.LoginService;

@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    /**
     * Check if account is exits and return Customer Object
     * 
     * @param username String
     * @param pass String
     * @return CustomerModel
     * @author duybk.sp
     **/
    @Override
    public CustomerModel login(String username, String pass) throws ConnectException {
        return loginDao.login(username, pass);
    }

}
