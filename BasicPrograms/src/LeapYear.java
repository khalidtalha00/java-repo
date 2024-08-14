// An year is a leap year if it satisfies the following conditions
// the year is a multiple of 4
// the year is a multiple of 400
// the year is not  a multiple of 100


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year that you want to check:");
        int year = sc.nextInt();

        if((year%4==0||year%400==0)&&year%100!=0){
            System.out.println("Leap year");

        }
        else {
            System.out.println("Not a leap year");
        }

    }
}
