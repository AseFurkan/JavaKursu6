package Gun33._03_Soru;

public class GenelMudur extends Calisan{
private double Tazminat;

    public GenelMudur(String isim, double maas, double maasKatsayisi,double tazminat) {
        super(isim, maas, maasKatsayisi);
setTazminat(tazminat);
}

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    @Override
    public String toString() {
        return super.toString()+"\ntazminat= "+getTazminat();
       //return "GenelMudur{" +
       //      "tTazminat=" + Tazminat +
       //       '}';
    }

    public double getTazminat() {
        return Tazminat;
    }

    public void setTazminat(double Tazminat) {
        //eger kademesi ise tazmintın yarısını alır.
        this.Tazminat = Tazminat;
    }
}
