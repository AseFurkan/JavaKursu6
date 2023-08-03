package gun18;

import java.util.Arrays;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        //bütün doldurma işlemleri bittikten sonra yazdırınız ve kaç tane tek sayı olduğunu bulnuz


        int [][] tablo= new int[2][3];
        int kacTekSayiVar=0;


        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random() * 100);
                System.out.print(tablo[i][j]+" ");
                if (tablo[i][j]%2==1)
                    kacTekSayiVar++;
            }
            System.out.println();
        }
        System.out.println("kacTekSayiVar = "+kacTekSayiVar);


        
/*
        int[][] tablo = new int[2][3]; // 2*3 lük bir tablo
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun] = (int) (Math.random() * 100);
        }
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun]+" " );
            System.out.println();
        }
        int tekSayiMik=0;
        for (int satir = 0; satir < tablo.length ; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                if(tablo[satir][sutun]%2==1)
                    tekSayiMik++;
                    
        }
        System.out.println("tekSayiMik = " + tekSayiMik);

 */
        }

}