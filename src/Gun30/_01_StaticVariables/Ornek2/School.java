package Gun30._01_StaticVariables.Ornek2;

public class School {

    public static void main(String[] args) {
        Student ogr1=new Student(1,"İsmet Temur");
        Student ogr2=new Student(2,"Mehmet Yılmaz");
        Student ogr3=new Student(3,"Beyza Demir");
        // Problem : hem id yi takip etmek zorundayım
        // hem de hata olasığığı yüksek

        Student ogr10=new Student("ismet");
        Student ogr11=new Student("mehmet");
        Student ogr12=new Student("Ayşe");

        System.out.println("ogr10 = " + ogr10);//1
        System.out.println("ogr11 = " + ogr11);//2
        System.out.println("ogr12 = " + ogr12);//3

        //ogr10.id=5005;
        //Student.sayac=5005;

    }

}
