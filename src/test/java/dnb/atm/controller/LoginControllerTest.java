package dnb.atm.controller;

import java.net.ConnectException;

import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.ModelMap;

import dnb.atm.model.CustomerModel;
import dnb.atm.service.LoginService;
import junit.framework.Assert;

/***
 * 
 * @author phuctd.lt
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
	@InjectMocks
	private LoginController loginController = new LoginController();
	@Mock
	private LoginService loginService;
	@Mock
	private HttpSession session;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void loginTest1() throws ConnectException {
		String username = "0107744763";
		String pass = "123456";
		CustomerModel customerModel = new CustomerModel();
		customerModel.setAccountID("");
		Mockito.when(loginService.login(username, pass)).thenReturn(customerModel);
		Assert.assertEquals("welcome", loginController.login(username, pass, session, new ModelMap()));
	}

	/*
	 * @Test public void loginTest2() throws ConnectException{ String user =
	 * "0107744763"; String pass = "123"; String result =
	 * "{\"infCustomer\":{\"userName\":null,\"accountID\":\"\",\"balance\":0,\"flagTransaction\":false,\"message\":\"Wrong Account ID or password\"}}"
	 * ; CustomerModel customerModel = new CustomerModel();
	 * customerModel.setAccountID(""); customerModel.setMessage(
	 * "Wrong Account ID or password"); Assert.assertEquals(
	 * "Wrong Account ID or password", customerModel.getMessage());
	 * Mockito.when(loginService.login(user, pass)).thenReturn(customerModel);
	 * Assert.assertEquals(result, loginController.login(user, pass, session,
	 * new ModelMap())); }
	 * 
	 * @Test public void loginTest3() throws ConnectException{ String user = "";
	 * String pass = ""; Mockito.when(loginService.login(user,
	 * pass)).thenReturn(new CustomerModel()); String result =
	 * "{\"infCustomer\":{\"userName\":null,\"accountID\":null,\"balance\":0,\"flagTransaction\":false,\"message\":null}}";
	 * Assert.assertEquals(result, loginController.login(user, pass, session,
	 * new ModelMap())); }
	 */

}
