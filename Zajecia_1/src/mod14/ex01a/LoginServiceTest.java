package mod14.ex01a;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
	private LoginServiceImpl service;
	private UserDAO dao;

	@Before
	public void setup() {
		dao = mock(UserDAO.class);
		service = new LoginServiceImpl();
		service.setUserDAO(dao);
	}

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
