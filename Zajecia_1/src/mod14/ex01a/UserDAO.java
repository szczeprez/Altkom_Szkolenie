package mod14.ex01a;

public interface UserDAO {

	User findUserByLoginAndPassword(String login, String password);
}