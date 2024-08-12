import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        // items in a treemap is ordered in alphabetical order
        // a treemap has key value pairs
        // a treemap does not allow duplicates
        // a treemap is

        Map<String,Integer>tmap= new TreeMap<>();
        tmap.put("one",1);   // add items
        tmap.put("two",2);
        tmap.put("three",3);
        tmap.put("four",4);
        tmap.put("four",5);  // 4 replaced with 5
        System.out.println(tmap);

        tmap.remove("four");  // remove key value four
        System.out.println(tmap);

        System.out.println(tmap.containsKey("two")); // check if key is present
        System.out.println(tmap.containsValue(56)); // check if value is present

        tmap.clear();  // clear the treemap
        System.out.println(tmap.isEmpty()); // check if treemap is empty or not
    }
}
