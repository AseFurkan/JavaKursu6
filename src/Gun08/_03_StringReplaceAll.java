package Gun08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak
        String text="Merhaba1 Dünya234";

        System.out.println("text = " + text);
        System.out.println("abn -> _ " + text.replaceAll("[abn]","_"));
        //a,b,n leri _ yap -> Merh___1 Dü_y_234

        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]","_"));
        // A Z ye kadar harfleri _ yap -> _erhaba1 _ünya234

        System.out.println("0-9 arasını sil = " + text.replaceAll("[0-9]",""));
        // 0-9 arasını sil -> Merhaba Dünya

        System.out.println("0-9 dışındakileri sil = " + text.replaceAll("[^0-9]",""));
        //0-9 un ^ dışındakileri sil -> 1234
        // $500  -> "500" -> parseInt

        System.out.println("harfleri sil -> = " + text.replaceAll("[A-Z]","").replaceAll("[a-z]",""));
    }
}
