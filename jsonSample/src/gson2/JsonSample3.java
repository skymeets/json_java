package gson2;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonSample3 {

	public static void main(String[] args) {

		//JSON文字列準備
		String jsonStr =
			"[" +
			"{\"id\":150,\"num\":1,\"name\":\"taro\",\"message\":\"Hello Hanako\",\"URL\":\"http://www.google.co.jp\"}" + "," +
			"{\"id\":250,\"num\":2,\"name\":\"hanako\",\"message\":\"Hello Taro\",\"URL\":\"http://www.yahoo.co.jp\"}" +
			"]";

		//DataオブジェクトのリストのType準備
		Type type = new TypeToken<List<Data>>(){}.getType();

		//Gsonオブジェクト準備
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();

		//JSON文字列をTypeで指定したList<Data>コレクションに変換
		List<Data> DataList = gson.fromJson(jsonStr, type);

		//中身の確認
         for(Data d : DataList){
        	 System.out.println(d.getId());
        	 System.out.println(d.getMessage());
        	 System.out.println(d.getURL());
         }
	}

}
