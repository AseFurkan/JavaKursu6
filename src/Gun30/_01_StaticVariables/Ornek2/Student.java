package Gun30._01_StaticVariables.Ornek2;

public class Student {
    private int id=1; // nesne
    String fullname; //nesneye

    private static int sayac=1; // kime ait:class
    //sen bitanesin.
    // static olmadan herzaman 1 le başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.


    public Student(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public Student(String fullname) {
        this.fullname = fullname;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
