package Gun03;

public class _04_DataTypesMinMax {
    public static void main(String[] args) {
        // değişken tiplerinin
        // sınırlarını sistemden  öğrenmek istersek bu şekilde yazıp run yapabiliriz
        byte gunNo=127; // -128 +127

        System.out.println("byte Min değer = " + Byte.MIN_VALUE); // -128
        System.out.println("byte Max değer = " + Byte.MAX_VALUE); // +127
        System.out.println("short Min değer = " + Short.MIN_VALUE);
        System.out.println("short Max değer = " + Short.MAX_VALUE);
        System.out.println("int Min değer = " + Integer.MIN_VALUE);
        System.out.println("int Max değer = " + Integer.MAX_VALUE);
        System.out.println("long Min değer = " + Long.MIN_VALUE);
        System.out.println("long Max değer = " + Long.MAX_VALUE);

        System.out.println("float Min değer = " + Float.MIN_VALUE);
        System.out.println("float Max değer = " + Float.MAX_VALUE);
        System.out.println("double Min değer = " + Double.MIN_VALUE);
        System.out.println("double Max değer = " + Double.MAX_VALUE);
    }
}
