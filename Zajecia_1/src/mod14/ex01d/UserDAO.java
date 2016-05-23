package mod14.ex01d;

public interface UserDAO {

	User findUserByLoginAndPassword(String login, String password);
}