package mod14.ex01c;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {
	@InjectMocks
	private LoginServiceImpl service;
	@Mock
	private UserDAO dao;
	
	@Test
	public void testScenario() {
		// konfiguracja mock'a
		User user1 = new User();
		final String LOGIN1 = "testLogin";
		final String PASSWORD1 = "testPassword";
		when(dao.findUserByLoginAndPassword(LOGIN1, PASSWORD1)).thenReturn(user1);

		Assert.assertTrue(service.isValid(LOGIN1, PASSWORD1));
		verify(dao, times(1)).findUserByLoginAndPassword(anyString(), anyString());
		// same as:
		// verify(dao).findUserByNameAndPassword(anyString(), anyString());
	}
}
