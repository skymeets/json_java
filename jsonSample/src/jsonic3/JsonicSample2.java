package jsonic3;

//JSONICをインポート
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.arnx.jsonic.JSON;

public class JsonicSample2 {
	public static void main(String[] args) {

		Tweet t1 = new Tweet(new TwitterUser("taro yamada","http://taro.com"), "hello everyone!");
		Tweet t2 = new Tweet(new TwitterUser("hanako yamada","http://hanako.com"), "bye everyone!");

        List ary = new ArrayList();
        ary.add(t1);
        ary.add(t2);

        // JSON形式にエンコード
        String script = JSON.encode(ary);
		System.out.println("script : " + script);

	}
}
