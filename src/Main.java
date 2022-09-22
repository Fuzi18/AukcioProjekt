import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("festmenyek.csv"));

        while (sc.hasNext())
        {
            System.out.print(sc.nextLine());
        }
        sc.close();
    }
}