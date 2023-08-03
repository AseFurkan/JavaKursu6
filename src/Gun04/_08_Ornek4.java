package Gun04;

public class _08_Ornek4 {
    public static void main(String[] args) {
        // int to String, rakamları yazıya çevrilmesi


        String ad="İsmet Temur";
        int sinifNo=5;
        char subesi='A';
        boolean gectiMi=true;

        System.out.println(ad+" "+sinifNo+" "+subesi+" "+gectiMi);
        // + nın herhangi bir tarafında String var ise , diğer değişken otomatik String e dönüşür.

        System.out.println("merhaba"+1+2);  // merhaba12
        System.out.println(1+2+"merhaba");  // 3Merhaba
        // birleştirme işlemi soldan sağa doğru gider.
    }
}
