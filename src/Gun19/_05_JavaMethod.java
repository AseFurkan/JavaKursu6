package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {
      //  merhabaYaz();
      //  merhabaYaz();
//
      // merhabaYazfrkn("Furkan ");
      //  merhabaYazfrkn("Asefler");
      //  cokMerhabaYaz(5);
        merhabaYazfrkn("Cem");
        cokMerhabaYaz(4);
    }


    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");

    }

    public static void merhabaYazfrkn(String ad) {
        System.out.println("Merhaba " + ad);
    }

    public static void cokMerhabaYaz(int sinir) {
        for (int i = 0; i < sinir; i++)
            System.out.println("Merhaba ");
    }


}