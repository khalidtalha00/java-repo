import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

// throws: Declares exceptions that a method might throw.
public class throws_keyword {
    public static void main(String[] args) throws IOException // might throw an io exception
     {
        File myfile = new File("C:\\Users\\khali\\Desktop\\new.txt");

        if (myfile.createNewFile()){
            System.out.println("Successfully created a file");
        }
        else {
            System.out.println("Error");
        }
    }
}
