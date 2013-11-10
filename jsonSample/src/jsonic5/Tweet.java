package jsonic5;

public class Tweet {

	private String message;
	private TwitterUser user;

	public Tweet(String message, TwitterUser user) {
		this.message = message;
		this.user = user;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public TwitterUser getUser() {
		return user;
	}

	public void setUser(TwitterUser user) {
		this.user = user;
	}

}
