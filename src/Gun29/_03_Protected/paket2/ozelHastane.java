package Gun29._03_Protected.paket2;

import Gun29._03_Protected.paket1.Doktor;

public class ozelHastane {
    public static void main(String[] args) {
        Doktor dr1= new Doktor("ayşe");
        dr1.hastaneAdi="özel istanbul hastanesi";

       // Doktor dr2=new Doktor();
        //default sadece kadi paketinde ulaşılabilir


    }
}
