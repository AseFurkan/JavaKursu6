package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        cumle = cumle + "Bugün";
        cumle = cumle + " hava ";
        cumle = cumle + " çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle+\" değil mi \" = " + cumle + " değil mi ");
        System.out.println(cumle);
        /**************************************/

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 30000; i++) {
            test1 = test1 + " merhaba";
        }
        System.out.println("+ için geçen süre = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 30000; i++) {
            test2 = test2.concat(" merhaba");
        }
        System.out.println("cancat geçen süre = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        StringBuilder test3 =new StringBuilder();
        for (int i = 0; i < 30000; i++) {
            test3.append("Merhaba");
        }
        System.out.println("StringBuilder geçen süre = " +( System.currentTimeMillis() - startTime));

        System.out.println("\n\n******************StringBuilder**********************");
        /*                           StringBuilder 1 Yakından tanıyalım            */
        
        StringBuilder sb=new StringBuilder();
        sb.append("bugün ");
        sb.append("hava ");
        sb.append("biraz soguk");
        System.out.println("sb  = " + sb );

        System.out.println("sb.length() = " + sb.length());

        sb.append(4);
        System.out.println("sb = "+ sb);
        
        sb.reverse();
        System.out.println("sb = " + sb);
        
        sb.reverse();
        System.out.println("sb = " + sb);
        
        sb.delete(0,5); // inbdex:0 dahil 5 hariç siler 
        System.out.println("sb = " + sb);
        
        sb.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler 
        System.out.println("sb = " + sb);


        sb.insert(5,"kelime"); // 5 nolu indexe kelimeyi ekle, araya  ekleme 
        System.out.println("sb = " + sb);
        
        String parca=sb.substring(5,8); // 5 dahil 8 değil 
        System.out.println("parca = " + parca);

        // String fonksiyonları kullanmak için toString demek yeterli
        sb.toString().endsWith("de");

        sb.replace(5,8,"saç");
        System.out.println("sb = " + sb);

        sb=new StringBuilder(); // tammaen sıfırlamak yenilemek
        sb=new StringBuilder("bugün hava soğuk"); // ilk atama yapılabilir 
        System.out.println("sb = " + sb);

        StringBuffer sBuffer =new StringBuffer(); // tamamen StringBuilder aynı
        // tek farkı paralel çalışan yaılımlar için kullanılır





    }
}