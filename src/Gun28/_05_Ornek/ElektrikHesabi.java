package Gun28._05_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;

    double birimfiyat=20;
    public void tuketimEkle(int tuketim){
        toplamTuketim=toplamTuketim+tuketim;
    }
    public void faturaYaz(){
        double tuketmTl=toplamTuketim*birimfiyat;
        System.out.println("******************");
        System.out.println("faturanız ");
        System.out.println("******************");
        System.out.println("Toplam tüketim ="+toplamTuketim);
        System.out.println("Toplam Tutar = "+tuketmTl);
        System.out.println("******************");

    }
}
