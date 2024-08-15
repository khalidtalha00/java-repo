// Using sealed class we can allow access to only the permitted classes
// if you want to allow any class to extend your class you can use the non sealed method

sealed class one permits two,four{  // only two and four can extend class one
}
sealed class two extends one permits three{  // only class three can extend class two
}
final class three extends two {
}
final class four extends one{
}
public class Sealed_Class_concept {
    public static void main(String[] args) {

    }
}
