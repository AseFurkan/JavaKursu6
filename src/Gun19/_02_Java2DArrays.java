package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {


    int [][] tablo=new int [3][3];
    int [][] tablo2= {
            {4, 55},
            {3, 56, 77},
            {23, 2, 3, 1, 4, 55, 66, 7},
            {13, 44, 55},
            {43}
    };
        for (int i = 0; i < tablo2.length ; i++) {

            for (int j = 0; j < tablo2[i].length; j++) {
                System.out.print(tablo2[i][j]+" ");

            }
            System.out.println();
        }




    }

}