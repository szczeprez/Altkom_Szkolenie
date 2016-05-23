package mod14.ex01a;

public class LoginServiceImpl implements LoginService {
	private UserDAO dao;

	public void setUserDAO(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean isValid(String login, String password) {
		User userFound = dao.findUserByLoginAndPassword(login, password);
		return userFound != null;
	}
}