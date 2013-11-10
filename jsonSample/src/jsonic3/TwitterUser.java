package jsonic3;

public class TwitterUser {

	private String name;
	private String profile_image_url;

	public TwitterUser(String name, String profile_image_url) {
		this.name = name;
		this.profile_image_url = profile_image_url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getProfile_image_url() {
		return profile_image_url;
	}

	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}

}
