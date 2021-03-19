import java.util.Scanner;

public class zad4 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        if((a + b > c) && (a + c > b) && (b + c > a))
        {
            System.out.println("TAK");
        }
        else if((a < 0) || (b < 0) || (c < 0))
        {
            System.out.println("BLAD");
        }
        else
        {
            System.out.println("NIE");
        }
        scanner.close();
    }   
}