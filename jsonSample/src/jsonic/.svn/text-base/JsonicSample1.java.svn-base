package jsonic;

//JSONICをインポート
import net.arnx.jsonic.JSON;

public class JsonicSample1 {
	public static void main(String[] args) {
		final JsonicSample1 jsonicSample = new JsonicSample1();
		jsonicSample.go();
	}

	public void go() {
		// エンコード(Java → JSON)対象のクラス
		final Hoge hoge = new Hoge();
		hoge.setName("sample");
		hoge.setAge(10);

		// JSON形式にエンコード
		final String hogeJson = JSON.encode(hoge);

		// {"name":"sample","age":10} が出力されます
		System.out.println("エンコード結果:" + hogeJson);

		final String hogeJson2 = "{\"name\":\"sample2\",\"age\":20}";

		// JSON形式のデータをJavaのclassに変換(デコード)
		final Hoge hoge2 = JSON.decode(hogeJson2, Hoge.class);
		System.out.println("hoge2.name:" + hoge2.getName());
		System.out.println("hoge2.age:" + hoge2.getAge());

		// 配列を含むJSON形式のデータを用意
		final String hoges = "{\"id\":\"10\",\"hoges\":[{\"name\":\"test\",\"age\":1},{\"name\":\"sample2\",\"age\":2}]}";

		final HogeList hogeList = JSON.decode(hoges, HogeList.class);

		// hogesのようにHogeの形式の配列を持つJSONを、HogeクラスのListをもつクラスにデコードすることが出来ます
		System.out.println("hogeList.id:" + hogeList.getId());
		for (final Hoge tmp : hogeList.getHoges()) {
			System.out.println("tmp.name:" + tmp.getName());
			System.out.println("tmp.age:" + tmp.getAge());
		}
	}
}
