package gson1;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JsonSample2 {

	public static void main(String[] args) {

		String jsonStr = "[{\"name\":\"taro\",\"score\":\"90\"},{\"name\":\"hanako\",\"score\":\"80\"}]";

         Type type = new TypeToken<List<Data>>(){}.getType();

         GsonBuilder gsonBuilder = new GsonBuilder();

         Gson gson = gsonBuilder.create();

         List<Data> list = gson.fromJson(jsonStr, type);

         for(Data d : list){
        	 System.out.println(d.getName());
        	 System.out.println(d.getScore());
         }

	}

}




/*
//Gsonクラスのインスタンスを作成する


以下のようなJSON形式のデータもデータ構造に対応するクラスを作成することでJavaオブジェクトに変換できるので一般的な利用であれば特に問題なさそう。




--- Main.java ---
String json = "{\"nodes\":[{\"item1\":\"value1a\", \"item2\":\"value2a\"}]}";
Gson gson = new GsonBuilder().registerTypeAdapter(Container.class, new ContainerInstanceCreator()).create();
Container container = gson.fromJson(json, Container.class);

for (int i = 0; i < container.nodes.size(); i++) {
System.out.println(container.nodes.get(i).item1);
System.out.println(container.nodes.get(i).item2);
}

--- Node.java ---
public class Node {
public String item1;
public String item2;
}

--- Container.java ---
import java.util.ArrayList;
import java.util.List;

public class Container {
public List<Node> nodes;
Container() {
 nodes = new ArrayList<Node>();
}
}

--- ContainerInstanceCreator.java ---
import java.lang.reflect.Type;
import com.google.gson.InstanceCreator;

public class ContainerInstanceCreator implements InstanceCreator<Container> {
public Container createInstance(Type type) {
 return new Container();
}
}
*/