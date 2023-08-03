package Gun32._03_Soru;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int Kontenjan;

    private ArrayList<Ogrenci>Ogrencileri=new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        setKontenjan(kontenjan);
        setOkulAd(okulAd);
    }


    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", Kontenjan=" + Kontenjan +
                ", Ogrencileri=" + Ogrencileri +
                '}';
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return Kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        Kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return Ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        Ogrencileri = ogrencileri;
    }
}
