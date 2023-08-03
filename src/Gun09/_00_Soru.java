package Gun09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        // true veya false

        // 0 2 4 6 8 10 12 : çift sayılar
        // 1 3 5 7 9 11 13 : tek sayılar

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        int kalan =  sayi%2;  // 1 ise tektir
        boolean tekMi= (kalan==1);

        System.out.println("tekMi = " + tekMi);
    }
}
