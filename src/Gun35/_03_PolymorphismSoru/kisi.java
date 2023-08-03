package Gun35._03_PolymorphismSoru;

public class kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
    public static void  kimlikBelgesiYazdir(kisi gelenKisi){
        System.out.println("\n*******Kimlik Belgesi********* " );
        System.out.println("Adı = " + gelenKisi.getAd());
        System.out.println("Soyadı = " + gelenKisi.getSoyad());
        System.out.println("Görevi = " + gelenKisi.getGorevi());

        if (gelenKisi instanceof Calisan)
            System.out.println("Görevi ="+ ((Calisan)gelenKisi).getDepartman());
else
            System.out.println("şubesi ="+
                    ((Ogrenci)gelenKisi).getSubesi());

    }
}
