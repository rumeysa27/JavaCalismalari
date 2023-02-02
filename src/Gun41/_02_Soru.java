package Gun41;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        //Canlı digital saat yapınız

        DateTimeFormatter f= DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true){
            LocalTime saat= LocalTime.now();//şimdiki saat
            System.out.print("\r"+saat.format(f));
            MyFunc.Bekle(1);//1 sn aralıklarla yazsın diye myFunc bekleyi çağırdık paranteze de 1 yazdık
        }



    }
}
