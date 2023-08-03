package Gun03;

public class _05_Ornek2 {

    public static void main(String[] args) {
        // Örnek soru : yaricapi 4.2 olan bir dairenin çevresini ve alanını bulunuz.
        // cevre = 2*yaricap*3.14;       alan= 3.14*yaricap*yaricap

        //double yaricap, cevre, alan;

//        double yaricap;
//        double cevre;
//        double alan;

        double yaricap = 4.2;

        double cevre = 2 * yaricap * 3.14;   //  2*4*3.2  -> 5.0   -> double
        double alan = 3.14*yaricap*yaricap;

        System.out.println("cevre = " + cevre+ " cm");
        System.out.println("alan = " + alan+ " cm2");
    }

}
