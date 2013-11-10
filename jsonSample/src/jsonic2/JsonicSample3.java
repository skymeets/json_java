package jsonic2;

//JSONICをインポート
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.arnx.jsonic.JSON;

public class JsonicSample3 {
	public static void main(String[] args) {

		final String mapListStr = "{\"mapList\":[{\"FirstName\":\"Taro\",\"LastName\":\"Tanaka\"}]}";   //," +
		
		MapList mapList = JSON.decode(mapListStr, MapList.class);

		for ( Map tmp : mapList.getMapList()) {
			System.out.println("tmp.name:" + tmp.get("FirstName"));
			System.out.println("tmp.age:" + tmp.get("LastName"));
		}

	}
}
