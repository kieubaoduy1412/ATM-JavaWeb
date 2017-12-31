package dnb.atm.dao.impl;

import java.net.ConnectException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import dnb.atm.dao.LoginDao;
import dnb.atm.model.CustomerModel;
import junit.framework.Assert;

/***
 * 
 * @author phuctd.lt
 *
 */

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = { "file:src/test/resources/unittest-config-context.xml" })
public class LoginDaoImplTest {
	@Mock
	private LoginDaoImpl loginDaoImpl;
	@Mock
	private LoginDao loginDao;
	@Test
	public void loginDaoTest() throws ConnectException{
		CustomerModel obj = new CustomerModel();
		obj.setAccountID("0107744763");
		String user = "0107744763";
		String pass = "123456" ;
		Mockito.when(loginDao.login(user, pass)).thenReturn(obj);
		Assert.assertEquals(null, loginDaoImpl.login(user, pass));
	}

}
