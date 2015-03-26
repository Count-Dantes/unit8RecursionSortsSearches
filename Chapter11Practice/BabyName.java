import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BabyName
{

    public BabyName()
    {
        
    }

    public static void main() throws FileNotFoundException
    {
        File inputFile = new File("80sBabyName.txt");
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

    