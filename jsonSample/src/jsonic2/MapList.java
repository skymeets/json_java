package jsonic2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * HogeクラスのListを保持するクラス
 */
class MapList {

	private ArrayList<HashMap> mapList;

	public void setMapList(final ArrayList<HashMap> mapList) {
		this.mapList = mapList;
	}

	public ArrayList<HashMap> getMapList() {
		return mapList;
	}
}