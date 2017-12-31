package dnb.atm.service.impl;

import java.net.ConnectException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import dnb.atm.dao.LoginDao;
import dnb.atm.model.CustomerModel;
import junit.framework.Assert;

/**
 * 
 * @author phuctd.lt
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceImplTest {
	@InjectMocks
	private LoginServiceImpl loginService = new LoginServiceImpl();
	@Mock
	private LoginDao loginDao;
	
	@Test
	public void loginServiceTest1() throws ConnectException{
		CustomerModel obj = new CustomerModel();
		obj.setAccountID("0107744763");
		String username = "0107744763";
		String pass = "123456";
		Mockito.when(loginDao.login(username, pass)).thenReturn(obj);
		Assert.assertEquals(obj, loginService.login(username, pass));
	}
	
	@Test
	public void loginServiceTest2() throws ConnectException{
		String user = "123";
		String pass = "456";
		Assert.assertEquals(null, loginService.login(user, pass));
	}

}
