package Gun38._02Abstract;

public class dikdörtgen extends Sekil{
    private double kisaKenar;
    private double uzunKenar;


    @Override
    double alan() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    double cevre() {
        return (this.kisaKenar+this.uzunKenar)*2;
    }
    public dikdörtgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

}
