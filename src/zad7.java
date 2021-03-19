import java.util.Scanner;

public class zad7 
{
    public static void main(String args[]) 
    {
        int skalar = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        System.out.println("Podaj m: ");
        int m = scan.nextInt();
        int [] tab1 = new int[n];
        int [] tab2 = new int[m];
        
        if (n > m || m > n || n <= 0) 
        {
            System.out.println("BLAD");
            System.exit(0);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("Podaj liczbe do tablicy pierwszej: ");
            tab1[i] = scan.nextInt();
        }
        for(int j = 0; j < m; j++)
        {
            System.out.println("Podaj liczbe do tablicy drugiej: ");
            tab2[j] = scan.nextInt();
        }
        for (int k = 0; k < n; k++)
        {
            skalar += tab1[k] * tab2[k];
        }
        System.out.println("Iloczyn skalarny twoich tablic = " +skalar);
        scan.close();
    }
}
