package Gun36._06_Interface;

public class Dikdörtgen implements  IGeometri{
    @Override
    public int alan(int kisakenar, int uzunKenar) {
        return kisakenar*uzunKenar;
    }

    @Override
    public int cevre(int kisakenar, int uzunKenar) {
        return (kisakenar+uzunKenar)*2;
    }
}
