package Gun31._01_Enum;

enum Aylar { Tanimsiz, OCAK, ŞUBAT , MART , NİSAN ,MAYIS , HAZİRAN,
    TEMMUZ, AGUSTOS , EYLUL , EKIM, KASIM,ARALIK

}

public class Ornek1Cozum {
    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;

        switch (ay) {
            case ŞUBAT:
                System.out.println(28);
                break;
            case OCAK:
            case EYLUL:
                System.out.println(30);
                break;
            case KASIM:
            case ARALIK:
                System.out.println(31);
                break;
            case MART:
            case MAYIS:
            case NİSAN:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case HAZİRAN:
            case Tanimsiz:
        }
        if (ay == Aylar.MAYIS)
            System.out.println("Zam ayı");

        System.out.println("ay =" + ay); // toString SIMGE MAYIS
        System.out.println("ay.name() = " + ay.name());//SIMGE MAYIS
        System.out.println("ay.ordinal() = " + ay.ordinal()); //SIMGE NIN indexi 5

        for (Aylar a : Aylar.values())
            System.out.println(a.name() + " - " + a.ordinal());

    }
}

// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

