package Gun15;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner oku=new Scanner(System.in);

        int toplam=0;

        for (int i = 1; i <6 ; i++) {

            System.out.print("Sayı giriniz=");
            int sayi=oku.nextInt();

            if (sayi > 6 && sayi<10)  // 7 8 9
                 continue; // pas geç : kendinden sonra gelen komutları pas geçer
                           // döngünün sonraki adımına geçer

            toplam=toplam+sayi;
            System.out.println("continue çalışMADI");
        }

        System.out.println("toplam = " + toplam);




    }
}
