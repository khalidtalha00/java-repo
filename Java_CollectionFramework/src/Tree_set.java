import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        // in a treeset the elements are present in sorted manner.
        // treeset implement bonary search tree
        // just like in a set in a Treeset duplicate element cannot be added

        Set<Integer> Tst = new TreeSet<>();
        Tst.add(34); // add elements to Treeset
        Tst.add(7);
        Tst.add(67);
        Tst.add(5);
        Tst.add(50);
        Tst.add(78);// 78 is already added,so it won't add another 78
        System.out.println(Tst);

        Tst.remove(67);// remove 67
        System.out.println(Tst);

        System.out.println( Tst.contains(100)); // checks if 100 is present  or not
        System.out.println(Tst.contains(78));

        System.out.println(Tst.isEmpty()); // checks if treeset is empty or not


//      check the size of the tree set
        System.out.println(Tst);
        System.out.println(Tst.size()); // prints no. of elements

        Tst.clear();  // clears the entire tree set
        System.out.println(Tst.isEmpty());
    }
}
