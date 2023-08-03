package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();
//interface lerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // çember çizildi
        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişebiirsin


        cizdir(c);// cember çizildi
        cizdir(d);//dikdörtgen çizildi
    }
    public static void cizdir(ICizdirir g){
        g.ciz();
    }

}
