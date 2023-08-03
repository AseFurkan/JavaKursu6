package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınızı giriniz=");
        String ad = oku.nextLine(); // ismet

        System.out.print("Soyadınızı giriniz=");
        String soyad=oku.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Adınız ve soyadınız = "+ ad+" "+soyad);
    }
}
