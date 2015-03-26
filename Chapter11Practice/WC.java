import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WC
{

    public WC()
    {
        
    }

    public static void main() throws FileNotFoundException
    {
        File inputFile = new File("input.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("");
        while (in.hasNext())
        {
            String value = in.next();
            System.out.println(value);
        }
        in.close();
    }
}

    