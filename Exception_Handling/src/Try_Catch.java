//try: Block to test code that may throw an exception.
//catch: Handles the exception thrown by try.

public class Try_Catch {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            int result = a/b;  // arithmetic exception
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            System.out.println(e);
        }
    }
}
