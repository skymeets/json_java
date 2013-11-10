package jsonic2;

//JSONICをインポート
import java.util.HashMap;
import java.util.Map;

import net.arnx.jsonic.JSON;

public class JsonicSample1 {
	public static void main(String[] args) {

		Map<String, String> data = new HashMap<String, String>();
        data.put("FirstName", "Taro");
        data.put("LastName", "Yamada");

        // JSON形式にエンコード
        String script = JSON.encode(data);

		System.out.println("script : " + script);

	}
}
