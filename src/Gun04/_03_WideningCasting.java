package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // 1. küçük alanı -> büyüğe atılabiliyor (genişleme-Widening)
        // byte-> short-> int-> long-> float-> double
        // veri kaybı kesinlikle yok

        int sayi = 9;
        long toplam = 6700;
        double oran = 3.2;

        oran = sayi;  // int -> double  geniş hafızaya atılıyor
        System.out.println("oran = " + oran);  // veri kaybı yok  9.0

        toplam=sayi;  // int -> long
        System.out.println("toplam = " + toplam); // veri kaybı yok   9

        oran=toplam; // long -> double
        System.out.println("oran = " + oran);// veri kaybı yok  9.0
    }
}
