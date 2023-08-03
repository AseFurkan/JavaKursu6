package Gun34.Protected.Pak1;

public class P1Hayvan {
    public String ad; // heryerden bütün paketlerden erişim
    int yas;//sadece aynı paketten erişim
    protected String cinsi; //default gibi sadece bir yöntem var
    private String renk; // sadece kendi clasında
}
