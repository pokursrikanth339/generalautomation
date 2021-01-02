package exception;

public class ValueInTheListBoxException extends Exception {

	private String strmessage;

	public ValueInTheListBoxException(String message) {
		strmessage = message;
	}

	public String get_Message() {
		return this.strmessage;
	}
}
