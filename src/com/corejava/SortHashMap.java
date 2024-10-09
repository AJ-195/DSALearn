import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

    public static void sortHashMapAscByKey(Map<Integer, String> ascMap) {
		Map<Integer, String> tmap = new TreeMap<>(ascMap);
//		ArrayList<Map.Entry<Integer,String>> arrayList = new ArrayList<>(ascMap.entrySet());
		//System.out.println(arrayList);	
//		arrayList.sort(Map.Entry.comparingByValue());
//		arrayList.sort((arg0, arg1) -> arg0.getKey() > arg1.getKey());
		System.out.println(tmap);
		
	}
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
		map.put(90, "Apple");
		map.put(42, "Banana");
		map.put(125, "Pears");
		map.put(10, "Cherry");
		map.put(2, "Mango");

		sortHashMapAscByKey(map);
    }
}
