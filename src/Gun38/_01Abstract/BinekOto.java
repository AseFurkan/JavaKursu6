package Gun38._01Abstract;

public abstract class BinekOto {
   private String marka;
   private int uretimYili;
   private int VitesAdedi;

  abstract int hizlanmaSuresi();

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
       setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return VitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        VitesAdedi = vitesAdedi;
    }
}
