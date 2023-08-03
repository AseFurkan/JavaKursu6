package Gun45;

public class S114 {
    public static void main(String[] args) {

        int numbars[];// 0,0,0,0
        numbars= new int[2];// 10,20,0,0
        numbars[0]=10;
        numbars[1]=20;

        numbars=new int[4]; //0,0,0,0
        numbars[2]=30;// 0,0,30,0
        numbars[3]=40; //0,0,30,40

        for (int x:numbars) {
            System.out.println(" "+x);

        }
    }
}
