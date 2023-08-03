package Gun10;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);

        System.out.print("Şifreniz = ");
        String sifre=oku.nextLine(); // merhaba  bu hafıza 78.odada

        System.out.print("Şifreniz tekrar = ");
        String sifreTekrar=oku.nextLine();  // merhaba  bu hafızada 88.oda da olsun

        //String karşılaştırmalarda  ===  kullanılmaz
        if (sifre == sifreTekrar)  // String lerde hafızadaki yerlerini kontrol eder
            System.out.println("AYNI == ");

        // olması gereken String ifadelerde bu iş için yapılmış olan
        // içerik karşılaştırıcı olan EQUALS kullanılmalı.

        if (sifre.equals(sifreTekrar) == true)
            System.out.println("AYNI");

        if (sifre.equals(sifreTekrar) == false)
            System.out.println("DEGIL");

       // en doğrusu
        if (sifre.equals(sifreTekrar))
            System.out.println("AYNI");

        if (!sifre.equals(sifreTekrar))
            System.out.println("DEGIL");





    }
}
