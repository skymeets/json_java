package jsonic5;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonSample {

	public static void main(String[] args) {

		final String tweetStr = "[{\"message\":\"hello everyone!\",\"user\":{\"name\":\"taro yamada\"}},{\"message\":\"bye everyone!\",\"user\":{\"name\":\"hanako yamada\"}}]";

		Type type = new TypeToken<List<Tweet>>(){}.getType();

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        List<Tweet> tweetList = gson.fromJson(tweetStr, type);

		for ( Tweet tmp : tweetList) {
			System.out.print("message:" + tmp.getMessage() +"\t");
			System.out.println("name:" + tmp.getUser().getName());
		}
	}

}
