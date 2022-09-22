import java.io.*;
import java.util.Scanner;
public class Festmeny
{
public static void main(String[] args) throws Exception
        {
        Scanner sc = new Scanner(new File("D:\\Programok\\Projekt\\09 13\\AukcioProjekt\\src\\festmenyek.txt"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
        System.out.print(sc.next());
        }
        sc.close();
        }
        }

