import java.util.Scanner;

public class Sum_Of_Odd_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms:");
        int n = sc.nextInt();

        int sum =0;
        for (int i = 1; i <=n ; i++) {
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of "+n+" odd terms:"+sum);

    }
}
