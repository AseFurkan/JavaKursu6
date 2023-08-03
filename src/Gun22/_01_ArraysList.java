package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArraysList {
    public static void main(String[] args) {

        // Array      ->  Arrays metodları, sort
        // ArrayList  ->  Collection Metodları

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Bütün elemanları tek bir değerle set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        //replace : verilen değeri verilen değerle değiştir
        Collections.replaceAll(sayilar, 0, 5); // 0 ları 5 e çevir
        System.out.println("sayilar = " + sayilar);

        //tanılarken değer atama
        int[] dizi= {2,3,45,56};
        ArrayList<Integer> liste=new ArrayList<>( Arrays.asList(3,4,56,78,89)  );
        ArrayList<String> strList=new ArrayList<>( Arrays.asList("ahmet", "ayşe","kaya")  );

        System.out.println("liste = " + liste);
        System.out.println("strList = " + strList);

        // AddAll : bir veya fazla değerleri liste ekler
        Collections.addAll(sayilar, 56,77,88,99,77,7,4);
        System.out.println("sayilar = " + sayilar);

        // bir diziyi nasıl ArrayListe atarım
        Integer[] dizi2= {2,3,45,56};
        ArrayList<Integer> liste3=new ArrayList<>(  Arrays.asList(dizi2)  );
        System.out.println("liste3 = " + liste3);

    }
}
