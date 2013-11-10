package jsonic4;

import net.arnx.jsonic.JSON;

public class JsonicSample {
	public static void main(String[] args) {

		final String tweetStr = "{\"tweetList\":[{\"message\":\"hello everyone\"}," +
				"{\"message\":\"bye everyone\"}]}" ;

		TweetList tweetList = JSON.decode(tweetStr, TweetList.class);

		for ( Tweet tmp : tweetList.getTweetList()) {
			System.out.println("message:" + tmp.getMessage());
		}
	}
}
