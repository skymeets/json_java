package jsonic2;

//JSONICをインポート
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.arnx.jsonic.JSON;

public class JsonicSample2 {
	public static void main(String[] args) {

		Map<String, String> data1 = new HashMap<String, String>();
        data1.put("FirstName", "Taro");
        data1.put("LastName", "Tanaka");

        Map<String, String> data2 = new HashMap<String, String>();
        data2.put("FirstName", "Hanako");
        data2.put("LastName", "Yamada");

        List ary = new ArrayList();
        ary.add(data1);
        ary.add(data2);

        // JSON形式にエンコード
        String script = JSON.encode(ary);

		System.out.println("script : " + script);

	}
}
