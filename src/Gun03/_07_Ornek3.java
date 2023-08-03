package Gun03;

public class _07_Ornek3 {
    public static void main(String[] args) {
        // kişinin kilosunu(kg) ve boyunu(m) kendiniz veriniz.
        // ekrana kilonuz : ....  ve boyunuz= .... yazdıktan sonra
        // vücut kitle indeksini bulunuz : kilo/ (boy*boy)

        double kilo = 65.4;
        double boy = 1.65;

        double kitleIndex = kilo / (boy * boy); // işleme 1 tane ondalıklı girdiğinde sonuç double dır

        System.out.println("kilonuz="+ kilo + " , boyunuz=" + boy);
        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("arkadaş durumun normal ama üzüm yemeye devam");
    }
}
