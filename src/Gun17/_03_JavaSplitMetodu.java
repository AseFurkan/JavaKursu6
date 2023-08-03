package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle=oku.nextLine();

        String[] kelimeler=cumle.split(" "); // String metodu

        System.out.println("kelimeler.length = " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }


    }
}

//    iklimler çok  değişti
//
//        String[] kelimeler=cumle.split(" ");
//
//        kelimeler[0] -> "iklimler"
//        kelimeler[1] -> "çok"
//        kelimeler[2] -> "değişti"
//
//        kelime.length -> 3
