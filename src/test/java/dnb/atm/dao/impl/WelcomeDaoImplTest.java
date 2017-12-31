package dnb.atm.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

import dnb.atm.dao.WelcomeDao;
import dnb.atm.model.CustomerModel;
import dnb.atm.model.TransactionModel;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = { "file:src/test/resources/unittest-config-context.xml" })
public class WelcomeDaoImplTest {
@Mock
private WelcomeDaoImpl welcomeDaoImpl;// = new WelcomeDaoImpl();
@Mock
private WelcomeDao welcomeDao;

@Test
public void getMoneyTest1(){
	String accountID="";
	int amount = 50000;
	Assert.assertEquals(null, welcomeDao.getMoney(accountID, amount));
}
@Test
public void addMoneyTest1(){
	String accountID="4562";
	int amount = 50000;
	Assert.assertEquals(null, welcomeDao.addMoney(accountID, amount));
}
@Test
public void sendMoneyTest1(){
	CustomerModel obj = new CustomerModel();
	obj.setAccountID("0107744763");
	String receiverID = "";
	int amount = 50000;
	Assert.assertEquals(null, welcomeDao.sendMoney(obj.getAccountID(), amount, receiverID));
}
}
