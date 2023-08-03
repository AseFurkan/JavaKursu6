package Gun15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        Scanner read=new Scanner(System.in);
        System.out.print("cümle giriniz = ");
        String cumle=read.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            System.out.println(cumle.charAt(i));
            if (cumle.charAt(i)== ' ')
                continue;
        }
/*
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle=oku.nextLine();

        // Bu gün hava çok güzel  -> index=0, kaça <cumle.length, 1 er

        for (int i = 0; i < cumle.length() ; i++) {

            if (cumle.charAt(i) == ' ')
                continue;

           System.out.println(cumle.charAt(i));
        }


 */
    }
}
