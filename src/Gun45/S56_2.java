package Gun45;

public class S56_2 {
    public static void main(String[] args) {
        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;
        for (String n : names){

            // 3 kere döner
        try {
                pwd[idx]=n.substring(2,6); // omas // seph// 2 dahil 5 dahil
                System.out.println(pwd[idx]); // omas  // seph  yazıldı
                idx++;


        }catch (Exception e){
            System.out.println("Invalid name "); // invalid name
        }
    }
        for (String s:pwd)
            System.out.println("s= "+s);

}
}