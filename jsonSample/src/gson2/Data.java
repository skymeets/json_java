package gson2;

public class Data {
	int id;
	private String message;
	private String URL;

	public Data() {
	}

	public Data(int id, String message, String URL) {
		this.id = id;
		this.message = message;
		this.URL = URL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}
}
