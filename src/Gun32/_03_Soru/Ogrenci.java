package Gun32._03_Soru;

public class Ogrenci {
    private int okulNo;
    private String ad;
    private String soyAd;
    private int yas;

private static int sayacID=1;
    public Ogrenci(String ad, String soyAd, int yas) {
        setAd(ad);
        setSoyAd(soyAd);
        setYas(yas);
        this.okulNo=sayacID++;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +"okul no ="+this.okulNo+
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
       if (ad.length()<25)
           this.ad = ad;
       else
           System.out.println("hatalı isim girdiniz");
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        if (soyAd.length()<25)
        this.soyAd = soyAd;
        else
            System.out.println("hatali giirş");
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>0 && yas<16)
        this.yas = yas;
        else System.out.println("Hatalı yaş girdiniz başka bir ögrenci giriniz =");
    }
}
