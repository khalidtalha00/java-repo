// lambda expressions are used to reduce our length of code.
// it is used only with functional interface
@FunctionalInterface
interface B{
    void show();
}
public class Lambda_Expressions {
    public static void main(String[] args) {
        B obj = () -> System.out.println(("Now Showing"));
        obj.show();
    }
}
