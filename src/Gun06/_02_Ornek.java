package Gun06;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde(s), Sokak(s) , PostaKodu(int) ve ülke(s)
        // evSahibi(b) şeklinde adres bilgisini alarak yazdırınız.
        Scanner okuStr= new Scanner(System.in);
        Scanner okuInt= new Scanner(System.in);
        Scanner okuBool= new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak=");
        String sokak=okuStr.nextLine();

        System.out.print("Posta Kodu=");
        int pk=okuInt.nextInt();

        System.out.print("Ülke=");
        String ulke=okuStr.nextLine();

        System.out.print("Ev Sahibi(t/f)=");
        boolean evSahibiMi=okuBool.nextBoolean();

        System.out.println("Adres="+cadde+" "+sokak+" "+pk+" "+ulke+" "+evSahibiMi);
    }
}
