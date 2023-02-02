package Gun41;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_Odev {
    public static void main(String[] args) {
        //TODO: //Alınan saati geriye doğru saniye saniye saydırınız.

        DateTimeFormatter f= DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true){
            LocalTime saat= LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.Bekle(1);
        }

    }
}
