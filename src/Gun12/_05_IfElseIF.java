package Gun12;

import java.util.Scanner;

public class _05_IfElseIF {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Dersi ve notunu giriniz=");
        String dersVeNotu = oku.nextLine(); //Fizik:90

        //1.yöntem substring
        int ind = dersVeNotu.indexOf(":");
        int ogrNot = Integer.parseInt(dersVeNotu.substring(ind + 1)); // 90
        System.out.println("ogrNot 1 = " + ogrNot);

        //2.yöntem regex : 0-9 un dışındakileri(^) sil
        ogrNot = Integer.parseInt(dersVeNotu.replaceAll("[^0-9]", ""));
        System.out.println("ogrNot 2 = " + ogrNot);

        // else if görünüm
        if (ogrNot >= 90)
            System.out.println("A");
        else if (ogrNot >= 80)
            System.out.println("B");
        else if (ogrNot >= 70)
            System.out.println("C");
        else if (ogrNot >= 60)
            System.out.println("D");
        else if (ogrNot >= 40)
            System.out.println("E");
        else // <40
            System.out.println("F");

    }
}
