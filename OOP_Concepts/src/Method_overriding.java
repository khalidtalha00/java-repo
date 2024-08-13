class Animal{
    void makesound(){
        System.out.println("This animal makes a sound");

    }
}
class Dog extends Animal{
    @Override
    void makesound() {
        System.out.println("The dog says woof");
    }
}


public class Method_overriding {
    public static void main(String[] args) {

    Animal mydog = new Dog();
    mydog.makesound();
    }

}
