//A year is a leap year if:
//        It is divisible by 400, or
//        It is divisible by 4 and not divisible by 100.


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year that you want to check:");
        int year = sc.nextInt();

        if (year%400 ==0){
            System.out.println("Leap year");
        }
        else if (year%4==0&&year%100!=0) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not a leap year");
        }

    }
}
