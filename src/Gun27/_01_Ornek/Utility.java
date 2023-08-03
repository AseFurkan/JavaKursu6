package Gun27._01_Ornek;

public class Utility { // sınıfın, tipin adı

    public String getString(int sayi){
   return String.valueOf(sayi);
        // string e çevir ver
    }
    //Eğer bir metod nesnenin özelliklerini
    // kullanıyorsa nesne oluşturulmadan
    // kullanılamaz.Dolayısıyla STATİC olamaz
    // NEsne şart
public static String getString2(int sayi){
        return String.valueOf(sayi);

        // string e çevir ver
    }
    // Bağımsız metodlar yani STATİC metodlar
    // herhangi bir nesneye bağlı çalışması gerekmeyen
    // metodlardır.

}
