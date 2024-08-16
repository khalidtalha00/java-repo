import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_hashset {
    public static void main(String[] args) {

        // a linked hashset is just like a hashset the only difference is that
        // in a linked hashset the order in which the element is printed will not be random
        // it will be fixed.

        // just like in a hashset in  Linked hashset duplicate element cannot be added

        Set<Integer> Lhst = new LinkedHashSet<>();
        Lhst.add(34); // add elements to Hashset
        Lhst.add(56);
        Lhst.add(67);
        Lhst.add(78);
        Lhst.add(78);// 78 is already added,so it won't add another 78
        System.out.println(Lhst);  // the order will be as it is added in the hashset
        // Output will be [34,56,67,78]

        Lhst.remove(67);// remove 67
        System.out.println(Lhst);

        System.out.println( Lhst.contains(100)); // checks if 100 is present in the linked hashset or not
        System.out.println(Lhst.contains(56));

        System.out.println(Lhst.isEmpty()); // checks if the linked Hashset is empty or not


//      check the size of the hashset
        System.out.println(Lhst);
        System.out.println(Lhst.size()); // prints no. of elements in the linked hashset

        Lhst.clear();  // clears the entire set
        System.out.println(Lhst.isEmpty());
    }
}
