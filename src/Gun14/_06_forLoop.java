package Gun14;

public class _06_forLoop {
    public static void main(String[] args) {
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde , mesaj yazınız.(50 geçildi şeklinde)

        // başlagıcı :0,  sonu belli 100, artışı 2 şer : for döngüsü

        int toplam=0;
        boolean sinirAsildi=false;

        for (int i = 0; i <= 100; i=i+2) {
            toplam=toplam+i;
            System.out.println("i = " + i);
            System.out.println("sinirAsildi = " + sinirAsildi);

            if (toplam > 50 && sinirAsildi==false) {
                System.out.println("toplam 50 yi geçti");
                sinirAsildi=true;
            }

        }

        System.out.println("toplam = " + toplam);

    }
}
