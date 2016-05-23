package mod14.ex01b;

public interface UserDAO {

	User findUserByLoginAndPassword(String login, String password);
}