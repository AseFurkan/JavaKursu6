package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {
     // Kullanıcının gireceği 6 sayıdan tek olanlarının toplamını bulunuz
        Scanner read=new Scanner(System.in);
        int toplam =0;
        int sayac=1;

        while (sayac<=6) {
            System.out.print(sayac + ". sayıyı giriniz ");
            int sayi = read.nextInt();
            sayac++;
            if (sayi % 2 == 1)
                toplam = toplam + sayi;

        }
        System.out.println("toplam = " + toplam);

    }
}
