package Gun06;

public class _06_StringIndexOf {
    public static void main(String[] args) {
        // IndexOf : verilen karakter(lerin) indexini veriri
        // 01234  : harflerin oda numarası
        // Bugün

        String cumle="Merhaba Dünya";
        // h nin oda numarası kaç : 3
        // a nın oda numarası kaç : 4 tür
        // Dü nin indexi kaç : 8

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));//0
        System.out.println("cumle.indexOf(h) = " + cumle.indexOf("h"));//3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));//4
        System.out.println("cumle.indexOf(Dü) = " + cumle.indexOf("Dü"));//8
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" "));//7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A"));// -1 yok
        System.out.println("cumle.indexOf(z) = " + cumle.indexOf("z"));//-1

        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5));//6
                        // 5 nolu indexten sonra a hangi oda da
        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a",7));//12
                       // 7 nolu indexten sonra a yı ara
    }
}
