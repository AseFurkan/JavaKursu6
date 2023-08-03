package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    // Kullanıcıya öğrenci misiniz şeklinde sorunuz.
    // Evet ise True, değil ise False cevabını veriniz,
    // ve alınan cevabı yazdırınız.

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Öğrenci misiniz=");
        boolean cevap = oku.nextBoolean(); // True veya False

        System.out.println("cevabınız=" + cevap);
    }

}







