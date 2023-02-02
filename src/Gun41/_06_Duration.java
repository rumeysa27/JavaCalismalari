package Gun41;

import java.time.LocalDateTime;
import java.time.LocalTime;
//nano saniye 9
public class _06_Duration {
    public static void main(String[] args) {
        // Duration:hem LocalTime hem de LocalDateTime arasındaki farkı verir

        //LocalTime
        LocalTime dersBaslangic= LocalTime.of(19,0,0);
        LocalTime dersBitis= LocalTime.of(22,0,0);

        java.time.Duration GunlukDersSuresi= java.time.Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSuresi = "+ GunlukDersSuresi);

        System.out.println("toHours()= "+ GunlukDersSuresi.toHours());//farkın toplam hali
        System.out.println("toMinutes() = "+GunlukDersSuresi.toMinutes());//farkın toplam dakika hali
        System.out.println("toMillis()= "+ GunlukDersSuresi.toMillis());//farkın toplam milisaniye halini

        LocalDateTime from = LocalDateTime.of(2022,1,1, 0,0);
        LocalDateTime to= LocalDateTime.now();//bugün

        java.time.Duration farkZaman= java.time.Duration.between(from,to);
        System.out.println("farkZaman = "+ farkZaman);
        System.out.println("farkZaman.toDays()= "+ farkZaman.toDays());
        System.out.println("farkZaman.toHours() = "+ farkZaman.toHours());
        System.out.println("farkZaman.toMinutes()= "+farkZaman.toMinutes());
        
    }



}
