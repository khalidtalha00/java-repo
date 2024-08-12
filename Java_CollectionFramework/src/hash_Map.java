import java.util.HashMap;
import java.util.Map;

public class hash_Map {
    public static void main(String[] args) {
        // a hashmap has key value pairs
        // a hashmap does not allow duplicates
        // a hashmap is unordered

        Map<String,Integer>hmap= new HashMap<>();
        hmap.put("one",1);   // add items
        hmap.put("two",2);
        hmap.put("three",3);
        hmap.put("four",4);
        hmap.put("four",5);  // 4 replaced with 5
        System.out.println(hmap);

        hmap.remove("four");  // remove key value four
        System.out.println(hmap);

        System.out.println(hmap.containsKey("two")); // check if key is present
        System.out.println(hmap.containsValue(56)); // check if value is present

        hmap.clear();  // clear the hashmap
        System.out.println(hmap.isEmpty()); // check if hashmap is empty or not
    }
}
