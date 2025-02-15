package Gun37._01soru;

public class Vehicle {
    private double engine;
    private String model;

    public Vehicle(double engine, String model) {
       setEngine(engine);

        setModel(model);
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }
}
