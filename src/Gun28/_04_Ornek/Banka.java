package Gun28._04_Ornek;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this(adi,0,0);
    }

    public Banka() {
        this("",0,0);
    }

    public String toString() {
        return "Banka adi=" + this.adi +
                ", subeSayisi=" + this.subeSayisi +
                ", kurulusYili=" + this.kurulusYili ;
    }
}

