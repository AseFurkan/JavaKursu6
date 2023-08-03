package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_java2DArrays {
    public static void main(String[] args) {
        //günün sorusu : 3x2 lik bir diziyi kullanıcıdan sayı olarak
        // doldurduktan sonra sadece tek elemanlarını
        // tek boyutlu bir diziye atınız
        int dizi[][] = new int[3][2];
        int tekler=0;
        int tekSayMik=0;
        Scanner read=new Scanner(System.in);
// diziyi doldurma
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print("dizi["+i+"]["+j+"] = " );
                dizi[i][j]=read.nextInt();
                if (dizi[i][j]%2==1)
                 tekSayMik++;
            }
        }
        int [] diziteksayi=new int[tekSayMik];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+" ");
                if (dizi[i][j]%2==1){
                   diziteksayi[tekler] = dizi[i][j];
                    tekler++;
                }
            }
            System.out.println();
        }

         System.out.println(Arrays.toString(diziteksayi));


        /*
        int array[][] = new int[3][2];
        Scanner read = new Scanner(System.in);
        int tekMik = 0;

        // okuma işlemi yapıldı , tablonun tüm hücreleri sayı ile dolduruldu
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print("sayi giriniz ");
                array[i][j]= read.nextInt();
                if (array[i][j]%2==1)
                    tekMik++;
            }
        }
        int[]tekler = new int [tekMik]; // tek miktarı kadar bir dizi tanımlandı.

        int teklerIndex=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                if (array[i][j]%2==1) {
                    tekler[teklerIndex]=array[i][j];
                    teklerIndex++;
                }


            }

        }
        System.out.println(Arrays.toString(tekler));

         */
    }
}
