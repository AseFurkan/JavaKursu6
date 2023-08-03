package Gun28._03_Ornek;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Kitap(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    public Kitap() {
    }

    public String toString() {
        return "Kitap{" + "name='" + this.name + '\'' + ", publishYear=" + this.publishYear + ", author='" + this.author + '\'' + '}';
    }
}
