package Gun15;

public class _01_forLoop {
    public static void main(String[] args) {
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)
        // ve döngüden çıksın
        int toplam = 0;
        for (int i = 0; i < 100; i= i + 2) {
            toplam = toplam + i;
            System.out.println("toplam = "+toplam);
            if (toplam > 50){
                System.out.println("toplam 50 yi geçti");
            break;}
        }

        /*
       int toplam=0;

        for (int i = 0; i <= 100; i=i+2) {
            toplam=toplam+i;
            System.out.println("i = " + i);

            if (toplam > 50) {
                System.out.println("toplam 50 yi geçti");
                break; // döngüyü kır, sonlandır, döngüden sonraki adıma geç
            }

        }

        System.out.println("toplam = " + toplam);

         */

    }
}
