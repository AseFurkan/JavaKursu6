package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.
        int [] dizi=new int[10];

        for (int i = 0; i < 10; i++) {
            dizi[i]=(int)(Math.random()*11);
        }
        System.out.println(Arrays.toString(dizi));

        Scanner read=new Scanner(System.in);
        System.out.println("tahmininizi giriniz =");
        int tahmin= read.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==tahmin)
                System.out.println("index =" +i);
else
                System.out.println("bullunmamaktadır ");
        }

/*


        int[] dizi=new int[10]; //10 elemanlı bir diziyi tanımladım

        for (int i = 0; i < 10; i++) //diziyi random(10 dahil sayılarla) doldurduk
            dizi[i]= (int)(Math.random()*11);

        System.out.println("dizi = " + Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)= ");
        int arananRakam=oku.nextInt(); // kullanıcının  gireceği bir rakamı


        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] == arananRakam)
                System.out.println("Var, oda numarası(indexi) " + i);

        }

    // TODO : sadece ilk rakamın yerini versin
    // TODO : bulamadığında bulamadım desin.


 */
    }
}
