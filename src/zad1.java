import java.util.Scanner;

public class zad1 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("a * b =  " + a * b);
        scanner.close();
    }   
}