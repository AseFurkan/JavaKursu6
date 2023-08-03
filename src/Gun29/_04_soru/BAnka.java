package Gun29._04_soru;

public class BAnka {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.MusteriNo=1;
        mus1.ad="Zeynep";
        mus1.soyad="baglars";

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("mus1 ="+mus1.musteriHesap);



    }
}
