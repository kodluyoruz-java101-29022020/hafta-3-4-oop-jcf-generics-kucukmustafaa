package Auth;


public class InvalidAuthenticationException extends Exception {

	private String message;
	
	public InvalidAuthenticationException(String message) {
		this.message = message;
	}
	
	
}
