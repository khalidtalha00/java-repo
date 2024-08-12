import java.util.HashSet;
import java.util.Set;

public class Hash_set {
    public static void main(String[] args) {
        // in a hashset duplicate element cannot be added
        // int a hashset the order in which the element is printed will be random.

        Set<Integer> Hst = new HashSet<>();
        Hst.add(34); // add elements to Hashset
        Hst.add(56);
        Hst.add(67);
        Hst.add(78);
        Hst.add(78);// 78 is already added,so it won't add another 78
        System.out.println(Hst);

        Hst.remove(67);// remove 67
        System.out.println(Hst);

        System.out.println( Hst.contains(100)); // checks if 100 is present in the hashset or not
        System.out.println(Hst.contains(56));

        System.out.println(Hst.isEmpty()); // checks if Hashset is empty or not


//      check the size of the hashset
        System.out.println(Hst);
        System.out.println(Hst.size()); // prints no. of elements in the hashset

        Hst.clear();  // clears the entire set
        System.out.println(Hst.isEmpty());
    }
}
