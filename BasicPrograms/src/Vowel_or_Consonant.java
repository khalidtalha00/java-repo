import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check:");
        char c=sc.next().charAt(0);   // to check the character at index 0

        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
