//uppercase to lowercase and vice versa

import java.util.Scanner;

public class case_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        char c1 = sc.next().charAt(0);
        char result;

        if (c1>='A'&&c1<='Z'){
             result = Character.toLowerCase(c1);
        }
        else{

            result = Character.toUpperCase(c1);
        }

        System.out.println("Result:"+result);

    }

}
