package Gun26._02_Ornek;


public class Person {
    String name;
    String surname;
    int age;
    //field, properties, özellik

    public void bilgiYazdir()
    {
        System.out.println("Adı:"+this.name);
        System.out.println("Soyadı"+this.surname);
        System.out.println("Yaşı:"+this.age);
    }



    public void getBirthYear()
    {
        System.out.println("Doğum Yılı="+
                (2023-this.age));
    }

    public int getBirthYear2()
    {
        int dogumYili=2023-this.age;
        return dogumYili;
    }



}


