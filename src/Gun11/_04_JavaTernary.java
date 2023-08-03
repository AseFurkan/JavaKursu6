package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini
        // ekrana yazdırınız. Ternary operatör ile yapınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int number= read.nextInt();

        System.out.println((number>50)? 1 : 0);


        /*
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi= oku.nextInt();

        //1.yöntem
        int sonuc= (sayi>50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);

        //2.yöntem
        System.out.println(   (sayi>50) ? 1 : 0   );

 */
    }
}
