package Gun19;

public class _04_JavaMethod {
    //metodların yazılacağı yer

    public static void main(String[] args) {// ana method, diger methodlardan buranın içinde çağırılacak
        int enb = Math.max(5, 6); //max metodu değer/ler almış
        double rndSayi = Math.random(); // hiçbirşey almıyor sadece veriyor

       // System.out.println("Merhaba Dünya"); // veri alıyor, götürüp ekrana yazıyor
       // System.out.println("Merhaba Dünya");
       // System.out.println("Merhaba Dünya");
//
        merhabaYaz(); // kullanımı kolay, çagırması kolay ,tekrar tekrar kullanabilirsin
        merhabaYaz(); // main daha kolay anlaşılabilir olur. temiz kod sistemi
        merhabaYaz(); // fonksiyonu çağırma şekli
        merhabaYaz();
    }
// methodlarız yazılacağı yer
     public static void merhabaYaz()
     {
        System.out.println("Merhaba Dünya : metoddan ");
    }
}