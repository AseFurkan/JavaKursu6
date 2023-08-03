package Gun44;

public class S21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; //index: 0,1,2,3  :arr.length =
        int i = 0;
        do {
            System.out.print(arr[i] + " "); //i:0,1,,3,hata oluşacak
            i++;

        } while (i < arr.length + 1);//i<5
    }
}
