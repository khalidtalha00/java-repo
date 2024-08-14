import java.util.Scanner;

public class Sum_of_n_natural_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=n ; i++) {
            sum =sum+i;
        }

        System.out.println("Sum of "+n+" natural numbers is:");
        System.out.println(sum);



    }
}
