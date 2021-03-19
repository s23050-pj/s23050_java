import java.util.Scanner;

public class zad3 
{
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Napisz dwa slowa: ");
        String[] words = scan.nextLine().split("\\s+");
        System.out.println(words[1] + " " + words [0]);
        scan.close(); 
    }    
}
