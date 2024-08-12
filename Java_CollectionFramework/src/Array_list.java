import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {

    // the drawback of array is that we cannot change the size of the array dynamically.
    // to solve this issue we use Array List in Java

    ArrayList<Integer> myArraylist = new ArrayList<>();
    myArraylist.add(100);   // adding 100 to the array list at the beginning of the list
    myArraylist.add(9);
    myArraylist.add(5);

    System.out.println(myArraylist);

    myArraylist.add(1,17);
    System.out.println(myArraylist);

     myArraylist.remove(1); // removing the element at index 1
    System.out.println(myArraylist);

    ArrayList<Integer> myArraylist1=new ArrayList<>();
    myArraylist1.add(3);
    myArraylist1.add(67);
    myArraylist1.add(6);
    System.out.println(myArraylist1);

    System.out.println(myArraylist1.get(2)); // get the element in the arraylist at index 1

        System.out.println(myArraylist1.contains(6)); // checks if 6 is present in the araylist or not

    myArraylist.addAll(myArraylist1); // combining  arraylist 1 nd 2 in a single arraylist
    System.out.println(myArraylist);

        for (int i = 0; i < myArraylist1.size(); i++) { // traversing through the list
            System.out.println("element at index:" +i+ " is "+myArraylist1.get(i));

        }

    }
}
