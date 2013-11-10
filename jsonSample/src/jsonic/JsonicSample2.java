package jsonic;

//JSONICをインポート
import net.arnx.jsonic.JSON;

public class JsonicSample2 {
	public static void main(String[] args) {
		final JsonicSample2 jsonicSample = new JsonicSample2();
		jsonicSample.go();
	}
	public void go() {

		// 配列を含むJSON形式のデータを用意
		final String hoges = "{\"id\":\"10\",\"hoges\":[{\"name\":\"test\",\"age\":1},{\"name\":\"sample2\",\"age\":2}]}";

		final HogeList hogeList = JSON.decode(hoges, HogeList.class);

		// hogesのようにHogeの形式の配列を持つJSONを、HogeクラスのListをもつクラスにデコードすることが出来ます
		System.out.println("hogeList.id:" + hogeList.getId());
		for (final Hoge tmp : hogeList.getHoges()) {
			System.out.println("tmp.name:" + tmp.getName());
			System.out.println("tmp.age:" + tmp.getAge());
		}
		// JSON形式にエンコード
		final String hogesAfter = JSON.encode(hogeList);
		System.out.println("hogesAfter:" + hogesAfter);
	}
}
