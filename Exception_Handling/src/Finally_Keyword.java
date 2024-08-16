//finally: Executes code after try/catch, regardless of outcome.
public class Finally_Keyword {
    public static void main(String[] args) {
            int a=10,b=0;
            try {
                int result = a/b; //arithmetic exception
            }
            finally {
                System.out.println("The finally block will be executed even if there is an error");
            }
        }
    }


