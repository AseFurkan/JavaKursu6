package Gun38._02Abstract;

import Gun36._06_Interface.Dikdörtgen;

public class GeometriMain {
    public static void main(String[] args) {
        dikdörtgen dik=new dikdörtgen(5,4);
        dik.setName("yeni dikdörtgen ");
        dik.ciz();
        System.out.println("dik = "+dik);

        Daire dr=new Daire(4);
        dr.setName("Yeni daire ");
        dr.ciz();
        System.out.println(dr);
    }
}
