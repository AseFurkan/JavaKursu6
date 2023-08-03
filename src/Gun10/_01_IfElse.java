package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int ogrNot = oku.nextInt();

        // 1.yöntem bilgisayar boş yere yoruluyor
        if (ogrNot >= 50)
            System.out.println("Geçtiniz");

        if (ogrNot < 50)
            System.out.println("Kaldınız");

        // 2.yöntem olması gereken
        if (ogrNot >= 50)
            System.out.println("Geçtiniz");
        else // !(ogrNot >= 50)  değilse
            System.out.println("Kaldınız");


    }
}
