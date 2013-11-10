package jsonic5;

import java.util.ArrayList;
import java.util.List;

import net.arnx.jsonic.JSON;

public class JsonicSample {
	public static void main(String[] args) {

		Tweet t1 = new Tweet("hello everyone!",new TwitterUser("taro yamada"));
		Tweet t2 = new Tweet("bye everyone!", new TwitterUser("hanako yamada"));

		List<Tweet> ary = new ArrayList<Tweet>();
		ary.add(t1);
		ary.add(t2);
//        TweetList tl = new TweetList();
//        tl.setTweetList(ary);

        // JSON形式にエンコード
        String script = JSON.encode(ary);
		System.out.println(script);
	}
}
