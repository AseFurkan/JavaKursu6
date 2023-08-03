package Gun37._01soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tsl=new TeslaCar(310,"model 5");
        ToyotaPrius tyt1=new ToyotaPrius(1200,"sedan");
        Bus bus1=new Bus(7000,"Iveco");

        ArrayList<Vehicle>arabalar=new ArrayList<>();
        arabalar.add(tsl);
        arabalar.add(tyt1);
        arabalar.add(bus1);

        for (Vehicle v:arabalar) {
            System.out.println("-------------------------");
            System.out.println(v.getClass().getSimpleName()); // classın adını verir
            v.getEngine();
            v.getModel();
            System.out.println("-------------------------");

            System.out.println(v.getEngine());
            System.out.println(v.getModel());
            if (v instanceof TeslaCar){
                System.out.println(((TeslaCar)v).drive());
                System.out.println(((TeslaCar)v).chanceBattery());
            }
            else if (v instanceof ToyotaPrius){
                System.out.println(((ToyotaPrius)v).drive());
                System.out.println(((ToyotaPrius)v).chanceBattery());
                System.out.println(((ToyotaPrius)v).chanceOil());
            } else {
                System.out.println(((Bus)v).drive());
                System.out.println(((Bus)v).changeDeisel());

            }


        }
    }
}
