package Gun39.Soru2;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj); //A

        B b=new B(); //B classı , b nesneyi temsil eder
        //extends alınan classdan bagımsız olduğundan oradaki mesajı değiştirmez

        System.out.println("b.mesaj = " + b.mesaj); //B

          A a2=new A();
        System.out.println("a2 = " + a2); // A

        // çıktısı ne olur
    }
}
