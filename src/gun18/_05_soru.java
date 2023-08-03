package gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_soru {
    public static void main(String[] args) {
        //2*3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz
        // daha sonra kullanıcıdan bir sayı alınız
        //bu sayı tabloda var ise satır sutun yazdırınız
       Scanner read=new Scanner(System.in);
int sayi=0;

        int tablo[][]=new int[2][3];
        System.out.print("tahmin ettiğiniz tam sayıyı giriniz =  ");
        sayi=read.nextInt();
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++){
                tablo[i][j] = (int) (Math.random() * 10);
                System.out.print(tablo[i][j]+" ");
        }
            System.out.println();
    }
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++)
                if ( tablo[i][j] == sayi)
                    System.out.println("tablo ["+i+"]["+j+"]");

        }


      /*

        int[][] tablo = new int[2][3]; // 2*3 lük bir tablo

        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun] = (int) (Math.random() * 10);
        }
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun] + " ");
            System.out.println();
        }
        Scanner read=new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int aranaSayi= read.nextInt();
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                if (tablo[satir][sutun]==aranaSayi){
                    System.out.println("satir= "+ satir + " \nsutun = " + sutun);
                    
                }
        }



       */
    }
    }
