package Gun46;

public class S18 {
    public static void main(String[] args) {
        String[][] chs=new String[5][2];
        chs[0]=new String[2];
        chs[1]=new String[5];
        int i=97;

        System.out.println("chs.lenght = " + chs.length); //5
        System.out.println("chs[0].lenght = " + chs[0].length);//4
        System.out.println("chs[1].lenght = " + chs[1].length);//5
        System.out.println("chs[2].lenght = " + chs[2].length);//2
        System.out.println("chs[3].lenght = " + chs[3].length);//2
        System.out.println("chs[4].lenght = " + chs[4].length);//2


        for (int j = 0; j < chs.length; j++) {
            for (int k = 0; k < chs.length; k++) {
                chs[j][k]=""+i;
                i++;
            }
        }
        for (String[] ca:chs) {
            for (String c:ca) {
                System.out.print(c+"");

            }
            System.out.println();
        }
    }
}
