package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi(büyük veya küçük) geçiyorsa ekrana evet
        // yazdırın değilse  hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

//        Eğer cumle 10 karakterden uzunsa VE study içeriyorsa
//                 EVET yaz
//        değilse
//                 HAYIR yaz

          if (cumle.length() > 10 && cumle.toLowerCase().contains("study"))
              System.out.println("EVET");
          else
              System.out.println("HAYIR");


    }
}
