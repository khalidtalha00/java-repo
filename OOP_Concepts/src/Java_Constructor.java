class Car{
    String name;
    int year;

    Car(String n, int y){        // Constructor
    name = n;
    year = y;
    }
    void details(){
        System.out.println("The car is "+name +" "+ year);
    }
}
public class Java_Constructor {
    public static void main(String[] args) {
        Car mycar = new Car("Porche",911);
        mycar.details();
    }
}