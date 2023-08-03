package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {

        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map -> Anahtar + Set -> Anahtarlı Set  (Tekrar eden anahtarlar yok)

        //anahtarın tipi Integer, değerin tipi String
        HashMap<Integer, String> hm=new HashMap<>();

        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Yusuf Yılmaz");
        hm.put(2001, "Buğrahan Yıldız");
        hm.put(5001, "Elife Sözen");
        hm.put(1002, "Seda Parça");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(1001) = " + hm.get(1001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet());// keyleri toplu verir
        System.out.println("hm.values() = " + hm.values());// değerler toplu veriri

        hm.remove(5001);
        System.out.println("hm = " + hm);
    }
}
