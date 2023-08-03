package Gun10;

import java.util.Scanner;

public class _02_IfElse_2 {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        int kalan= sayi%2;
        System.out.println("kalan = " + kalan);
        // 4 veya -4  :  çiftlerde herzaman 0 geldi
        // 5 ise 1   ,   -5 ise -1 teklrde

         // negatif teklerde çalışmayanı
        if (kalan == 1)   //  1 durumnda yani pozitif teklerde
            System.out.println("tek");
        else
            System.out.println("çift");  // 0, -1

        // doğrusu tam çalışanı
        if (kalan == 0)   // 0 durumunda
            System.out.println("çift");
        else
            System.out.println("tek");  // 1,-1 veya başka

    }
}
