package Gun32._01_Encapsulation;

import javax.crypto.spec.PSource;

public class Kisi {
    private String ad;
    private String soyad;
    private int yas;

    public void yasAta(int yas) {
        if (yas < 0)
            System.out.println("Hatalı Giriş");
        else
            this.yas = yas;
    }

    public void setAd(String ad)
    {
    if (ad.length()<25)
        this.ad=ad;
    else
        System.out.println("Hatalı İsim Girişi");
}
public void setSoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("Hatalı Soyad Girişi");
}
public int yasVer() {return this.yas;}
public String getSoyad() {return this.soyad;}
public String getAd(){return this.ad;}

}
