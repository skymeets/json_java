package jsonic5;

import net.arnx.jsonic.JSON;

public class JsonicSample2 {
	public static void main(String[] args) {

		final String tweetStr = "{\"tweetList\":[{\"message\":\"hello everyone\"}," +
				"{\"message\":\"bye everyone\"}]}" ;

		TweetList tweetList = JSON.decode(tweetStr, TweetList.class);

		for ( Tweet tmp : tweetList.getTweetList()) {
			System.out.println("message:" + tmp.getMessage());
		}
	}
}
