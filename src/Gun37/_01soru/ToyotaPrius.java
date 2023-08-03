package Gun37._01soru;

public class ToyotaPrius extends Vehicle implements IElectric,IGas {
    public ToyotaPrius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String chanceBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String chanceOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return" ilk 3 km lektrikle gider ";
    }
}
