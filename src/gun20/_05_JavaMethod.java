package gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {

        int s1=5;
        int s2=4;
        double d1=1.2;
        double d2=2.5;
        int sonuc1=topla(s1,s2);
        double sonuc2=topla(d1,d2);

        // methodlara aynı isim verebilirim yeterki parametrelerden ayırt edilebilsin

    }
    public static int topla (int s1 ,int s2)
    {
        return s1+s2;
    }
    public static double topla (double d1 ,double d2)
    {
        return d1+d2;
    }
}
