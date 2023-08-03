package Gun38._02Abstract;

public abstract class Sekil {
   private String name;


   abstract double alan ();
   abstract double cevre();

    public void ciz() {

        System.out.println(name+"şekil çizildi");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil" +
                "\n name=" + name +" alan="+alan()+
                "\n cevre ="+cevre();
    }
}
