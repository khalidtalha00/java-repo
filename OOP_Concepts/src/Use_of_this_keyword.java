class Car1{
    String name;   // instance variables
    int year;

    Car1(String name, int year){        // Constructor
        this.name=name;    // this keyword is used when both local and instance vaariable have same name
        this.year=year;   //
    }
    void details(){
        System.out.println("The car is "+name +" "+ year);
    }
}
public class Use_of_this_keyword {
    public static void main(String[] args) {
        Car1 mycar = new Car1("Porche",911);
        mycar.details();
    }
}