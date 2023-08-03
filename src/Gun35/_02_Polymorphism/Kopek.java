package Gun35._02_Polymorphism;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
      //  super.ses();
        System.out.println("havladı");

    }
    public void kokladı(){
        System.out.println(" kokladı");
    }
}
