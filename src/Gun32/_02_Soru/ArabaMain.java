package Gun32._02_Soru;

public class ArabaMain {
    public static void main(String[] args) {
       Araba a1=new Araba();
       a1.setRenk("Mavi");
       a1.setModel("SUV");
       a1.setKapiSayisi(a1.getKapiSayisi());
       a1.setMotorHacmi(5000);
        System.out.println(a1);

       Araba a2 = new Araba("siyah","suv",2500,5);

        System.out.println(a2);

    }
}

// KURAL: genel yazılım kuralıdır.
// bütün değişkenler private yapılır.
// yani Kapsulleme ile kullanılır.
// Eğer gerekiyorsa private kaldırılır.