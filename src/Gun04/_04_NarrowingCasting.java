package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        int toplam=6700;
        byte sayi=5;

        sayi=(byte)toplam;  // veri kaybı olmasa bile dikkatli yapılmalı
        System.out.println("sayi = " + sayi); // veri kaybı var

        double oran=3.7;  // ben tam sayı kısmını almak istiyorum
        toplam=(int)oran;  // bilerek sadece tam sayı kısmını aldım
        sayi=(byte)oran;
        System.out.println("toplam = " + toplam);
        // veri kaybı var , fakat bilerek yaptığım için sorun yok
    }
}
