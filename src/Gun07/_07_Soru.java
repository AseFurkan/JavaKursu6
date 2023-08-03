package Gun07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner oku = new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız=");
        String adSoyad = oku.nextLine(); // İsmet Temur, Ali Koç

        // 0-boşluğun indexine kadar desem : adı
        // boşluğun indexi+1  den sonuna kadar desem : soyadı verir
        int boslukIndex = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0, boslukIndex);  // Ali
        String soyad = adSoyad.substring(boslukIndex+1);  // Koç

        System.out.println("ad=" + ad);  //İsmet
        System.out.println("soyad=" + soyad); //Temur
    }
}
