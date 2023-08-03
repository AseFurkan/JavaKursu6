package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int number= read.nextInt();

        System.out.println((number%2==0)?" çift sayıdır " : "tek sayıdır ");


        /*
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        // normal yöntem
        if (sayi % 2  == 0)
            System.out.println("çift");
        else
            System.out.println("tek");

        // 1. kısa yöntem
        String sonuc= (sayi % 2  == 0) ? "çift" : "tek"; // ? -> if    , : -> else
        System.out.println(sonuc);

        //2. kısa yöntem
        System.out.println( (sayi % 2  == 0) ? "çift" : "tek" );


         */

    }
}
