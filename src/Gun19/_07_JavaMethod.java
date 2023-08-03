package Gun19;

import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {

// mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int  dizi2 []=new int[20];
        diziDoldurYaz(dizi2);
    }
    public static void diziDoldurYaz(int[] dizi2){
        for (int i = 0; i <dizi2.length ; i++) {
            dizi2[i]=(int) (Math.random()*100);

        }
        //System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(dizi2));
    }
}
