package newpackage;
import java.io.*;
public class STREAMCB{
    public static void main(String[] args)throws IOException
    {
        FileReader source= null;
        try {
            source= new FileReader("C:\\Users\\pranav\\OneDrive\\Desktop\\source.txt");
            int temp;
            System.out.println("Character Stream");
            while ((temp = source.read()) != -1)
            {
            System.out.println((char)temp);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally {
            if (source!= null)
                source.close();
            System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        }
        FileInputStream source1 = null;
        FileOutputStream target1 = null;
        try {
            System.out.println("Byte Stream");
            source1 = new FileInputStream("C:\\Users\\pranav\\OneDrive\\Desktop\\source.txt");
            target1 = new FileOutputStream("C:\\Users\\pranav\\OneDrive\\Desktop\\target.txt");
            int temp;
            while ((temp = source1.read()) != -1)
                target1.write((byte)temp);
            System.out.println("Written to target file");
        }
        finally {
            if (source1 != null)
                source1.close();
 
            if (target1 != null)
                target1.close();
            System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        }
    } 
}

