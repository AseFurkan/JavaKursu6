package Gun43;

import Tools.Myfunc;

public class _09_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String kelime="";

        char ilkharf=kelime.charAt(0);
         //zorunlu değil, UnChecked Exception




        Myfunc.bekle(100);



        try {
            Thread.sleep(1000); // 1 saniye bekle  try-catch mecbur : Checked Exeption

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
