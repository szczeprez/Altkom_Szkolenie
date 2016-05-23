package mod14.ex01d;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class LoginServiceTest {
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();
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
