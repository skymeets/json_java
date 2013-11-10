package jsonic5;

import net.arnx.jsonic.JSON;

public class JsonicSample3 {
	public static void main(String[] args) {

		final String tweetStr = "{\"tweetList\":[{\"message\":\"hello everyone!\",\"user\":{\"name\":\"taro yamada\"}},{\"message\":\"bye everyone!\",\"user\":{\"name\":\"hanako yamada\"}}]}";

		TweetList tweetList = JSON.decode(tweetStr, TweetList.class);

		for ( Tweet tmp : tweetList.getTweetList()) {
			System.out.println("message:" + tmp.getMessage());
		}
	}
}
