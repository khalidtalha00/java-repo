// a functional interface is an interface having only one abstract method
@FunctionalInterface
interface A{
    void show();
}
//class B implements A{
//    public void show(){
//        System.out.println("Now Showing");
//    }
//}

public class Functional_Interface {
    public static void main(String[] args) {
        A obj = new A() {    //Anonymous class
            @Override
            public void show() {
                System.out.println("Now Showing");
            }
        };
        obj.show();
    }
}
