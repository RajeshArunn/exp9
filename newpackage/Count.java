package newpackage;
import java.io.*;
import java.util.Scanner;
public class Count{
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the path of file:");
        //Path should be entered as shown here C:\\Users\\kensov\\OneDrive\\Desktop\\new.txt
        s=sc.next();
        File file = new File(s);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int lineCount = 0;  
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                String sentence[] = line.split("[!?.:]+");
                lineCount += sentence.length;
            }
        }
        if (lineCount >= 1) {
            paraCount++;
        }
        System.out.println("Total number of words = "+ wordCount);
        System.out.println("Total number of lines = "+ lineCount);
        System.out.println("Total number of characters = "+ characterCount);
    }
}
