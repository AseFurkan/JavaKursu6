package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi = new int[10]; // 10 tane değer boş halde, default 0
        int[] dizi2 = {2, 3, 45, 67, 8, 8, 99, 0, 44, 2}; // 10 tane hem tanımlandı hem değer atandı

        int[][] tablo = new int[2][3];  // 2 satır, 3 sütun, hepsi default 0 değerine sahip

        int[][] tablo2 = {   // 2 satır, 3 sütun
                {2, 3, 44}, // 1.satır  3 elemanlı
                {45, 66, 5}  // 2.satir  3elemanlı

        };

        for (int i = 0; i < tablo2.length; i++) {
            for (int j = 0; j < tablo2[i].length; j++) {
                System.out.println("tablo2["+i+"]["+j+"] = "+tablo2[i][j]);
            }
        }
/*
        for (int satir = 0; satir < 2; satir++) {  // 0,1

            System.out.println(tablo2[satir][0]); // her bir satırın 0. elemanı
            System.out.println(tablo2[satir][1]); // her bir satırın 1. elemanı
            System.out.println(tablo2[satir][2]); // her bir satırın 2. elemanı

        }
        // 2 forlu yöntem kesin vey hatasız
        for(int satir=0; satir<2; satir++) {  // 0,1

            for (int sutun=0;sutun<3;sutun++)  // her bir satırın sütunlarını yazdıran for
                System.out.print( tablo2[satir][sutun]+" " );

            System.out.println();
        }

 */
    }
}
