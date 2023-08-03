package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel tip, Private tip  : short, byte,long,double, boolean
        int sayi1= 5;
        int sayi2=12;

        sayi1=sayi2; // sayi 1= sayi2 nin değeri alındı ve sayi bire verildi
        sayi1=34;
        sayi2=45;
        System.out.println("sayi21 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Rederans tipleri : class, diziler , Arrayler, nesneler
        // ismi ayrı değeri ayrı tutulr

        int [] dizi1={1,2,3,4};
        int [] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 1,2,3,4
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//5,6

         dizi1=dizi2; // referanslar eşitlendi
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//5,6

        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//67,6

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//55,5
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//55,6

        // Nesne tipler : Null alabilen, ilkel tip
        // String, Double ,Long ,Integer
        String ad1="mehmet";
        String ad2="ismet";

        ad1=ad2; // İsmet : degeri kopyalandı verildi
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad1="ali";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad2="Zeynep";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

    }
}
