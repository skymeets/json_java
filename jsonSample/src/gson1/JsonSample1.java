package gson1;

import com.google.gson.Gson;


public class JsonSample1 {

	public static void main(String[] args) {

		String[] strings = {"abc","def","ghi"};

		Gson gson = new Gson();

		//JavaオブジェクトをJSON形式に変換する
		String str = gson.toJson(strings);
		System.out.println(str);


		//fromJsonメソッドを使用してJSON形式からJavaオブジェクトに変換する
		String[] strings2 = gson.fromJson("[\"abc\",\"def\",\"ghi\"]", String[].class);

		for(int i = 0; i < strings2.length; i++){
			System.out.println(strings2[i]);
		}

	}

}
