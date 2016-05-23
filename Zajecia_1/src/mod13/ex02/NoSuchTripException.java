package mod13.ex02;

public class NoSuchTripException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchTripException() {
	}

	public NoSuchTripException(String message) {
		super(message);
	}

	public NoSuchTripException(Throwable cause) {
		super(cause);
	}

	public NoSuchTripException(String message, Throwable cause) {
		super(message, cause);
	}
}
