// throw is used to throw a custom exception
public class throw_keyword {
    public static void validate(int age){
        if (age<18){
            throw new  ArithmeticException("Cannot Vote");
        }
    }
    public static void main(String[] args) {
        validate(16);

    }
}
