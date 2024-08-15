// we use an anonymous class when we know that we have to use a class only once
class demo{
    void show(){
        System.out.println("Showing A");
    }
}
public class Anonymous_class {
    public static void main(String[] args) {

    demo d = new demo(){
        void show(){
            System.out.println("Showing A using anonymous class");
        }
    };
    d.show();
    }
}
