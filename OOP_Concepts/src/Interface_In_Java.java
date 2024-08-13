// interface is a blueprint for creating classes. The methods do not  contain actual
// codes.just to make the blueprint of the methods we might be using in our classes.

 interface Pet{
    void makesound();   // these methods are by default public and abstract
    void sleep();
}
class Cat implements Pet{
    public void makesound(){
        System.out.println("Cat says meow");
    }
    public void sleep(){
        System.out.println("The cat is sleeping");
    }
}

public class Interface_In_Java {
    public static void main(String[] args) {
        Pet mycat = new Cat();
        mycat.sleep();mycat.makesound();

    }
}
