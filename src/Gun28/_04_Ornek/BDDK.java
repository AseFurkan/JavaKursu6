package Gun28._04_Ornek;

public class BDDK {
    public static void main(String[] args) {
        Banka bnk1= new Banka();
        bnk1.adi="Ziraat";
        bnk1.kurulusYili=1899;
        bnk1.subeSayisi=1254;

        Banka bnk2=new Banka("garanti",1999,754);
        Banka bnk3=new Banka("Finans",85)  ;

        System.out.println("bnk1 = " + bnk1);
        System.out.println("bnk2 = " + bnk2);
        System.out.println("bnk3 = " + bnk3);  
    }

}