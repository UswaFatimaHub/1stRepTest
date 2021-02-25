import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello
{
    static void reverseReadFile()
    {
        try
        {
            File myFile=new File("D:\\news.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine())
            {
                String data[]=myReader.nextLine().split(" ");
                String reversed = "";
                for (int i = data.length - 1; i >= 0; i--)
                {
                    reversed += data[i] + "\n";
                }
                System.out.println("Reversed String:");
                System.out.println(reversed.substring(0, reversed.length() - 1));
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error in reading the file.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        reverseReadFile();
    }
}
