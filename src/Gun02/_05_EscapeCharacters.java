package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        //    \n   -> yeni satır aç, alt satıra geçer
        //    \t   -> tab tusuna bas, 2,3 harflik boşul olşuturur
        //    \b   -> backspace etkisi oluşturur, yani 1 karakter geri siler
        //    \"   -> tırnak yazdırmak için kullanılır
        //    \\   -> ekrana bir tane \ yazar
        //    \r   -> satır başına git

        System.out.println("MerhabaDünya");    // MerhabaDünya
        System.out.println("Merhaba\nDünya");  // Merhaba  yazra , sonra alt satıra geçer Dünya yazar
        System.out.println("Merhaba\tDünya");  // Merhaba    Dünya   (tab tuşu kadar boşluk)
        System.out.println("Merhaba\bDünya");  //MerhabDünya
        System.out.println("Merhaba\b\bDünya"); //MerhaDünya
        System.out.println("Merhaba\"Dünya");   //Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");   //Merhaba\Dünya
        System.out.println("Merhaba\rDünya");   //Dünya

    }
}
