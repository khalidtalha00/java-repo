import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();

        System.out.println("Before Swapping numbers are: "+num1 +" "+num2);

        temp=num1;
        num1=num2;
        num2 = temp;
        System.out.println("After Swapping numbers are: "+num1 +" "+num2);

    }
}
