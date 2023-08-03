package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays { // 2 dimensions Arrays : 2 boyutlu diziler
    public static void main(String[] args) {
        int sayi=0;  // 1 tane sayı
        int[] dizi=new int[100]; // 100 sayı


        int[] ders1Not=new int[50]; // 50 kişilik ders1 in notları
        int[] ders2Not=new int[50]; // 50 kişilik ders2 in notları
        int[] ders3Not=new int[50]; // 50 kişilik ders3 in notları

        int[][] tumDersNotlari=new int[3][50]; // 3 tane 50 lik sayı tutabiliyor

        ders1Not[0]=80; //tek boyulu dizinin ilk elemanı

        tumDersNotlari[0][0]=80;  // 2 indexle gösterilir, tablonun ilk elemanı

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]=oku.nextInt();

    }
}
