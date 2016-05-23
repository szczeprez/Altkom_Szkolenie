package mod14.ex01c;

public interface UserDAO {

	User findUserByLoginAndPassword(String login, String password);
}