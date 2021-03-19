
import java.util.Scanner;

public class zad10 
{
    public static void main(String args[]) 
    {
        System.out.println("Rozmiar macierzy a x b: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a < 0 || b < 0)
        {
            System.out.println("BLAD");
            System.exit(0);
        }
        int macierz[][] = new int[a][b];
        System.out.println("Wprowadz liczby: ");
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < b; j++) 
            {
                macierz[i][j] = scan.nextInt();
                if((macierz[i][j] == (float) macierz[i][j]))
                {
                    System.out.println("BLAD");
                    System.exit(0);
                }   
            }
        }
        
        System.out.println("Transpozycja: ");
        for (int i = 0; i < b; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                System.out.print(macierz[j][i] + " ");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}