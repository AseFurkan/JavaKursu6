package Gun28._02_Ornek;

public class Kitapci {
    public static void main(String[] args) {
        Kitap kit1=new Kitap();
        kit1.name="Harry poter";
        kit1.publishYear=1997;
        kit1.author="JK Rowling";

        Kitap kit2=new Kitap("yüzükler",1954,"JJR Tolkien");
        Kitap kit3=new Kitap("Üzüm ve çay", 2023);

        System.out.println("kit3 = " + kit3);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit1 = " + kit1);

    }
}
