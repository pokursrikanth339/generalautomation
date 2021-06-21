package exception;

public class ValueInTheListBoxNotFoundException extends Exception {
	private String strmessage;

	public ValueInTheListBoxNotFoundException(String message) {
		strmessage = message;
	}

	public String get_message() {
		return this.strmessage;
	}
}
