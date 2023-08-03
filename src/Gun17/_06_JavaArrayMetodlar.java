package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"Ahmet","Zeynep","Roman","Kaya","Cihan"};
//diziyi direk ekrana yazdırmak için
        System.out.println("isimler ="+ Arrays.toString(isimler));
       // System.out.println("isimler = " + Arrays.toString(isimler));

        int[] a={1,8,3,54};
        System.out.println("a = " + Arrays.toString(a) );

        // dizi sıralama
        Arrays.sort(a);
        System.out.println("isimler = " + Arrays.toString(a));

        // Diziler Eşit mi
        int[] b={1,8,3,54};
        int[] c={1,3,8,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false

        // contais gibi çalışır, var ise pozitif sayı veriri, yok ise negatif
        // **********sadece sıralı dizilerde çalışır
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3)); // - değer yok
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c,3)); // 1, var demek

        // Diziyi hızlıca doldurmak bir değer ile
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

    }
}
