package Gun41;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        //Period iki tarih arasındaki farkı gösterir. LocalDate ler için kullanılır.

        LocalDate dogumTarihi= LocalDate.of(1994,6,17);
        LocalDate buGun= LocalDate.now();

        Period fark= Period.between(dogumTarihi,buGun);
        System.out.println("fark = "+ fark);

        System.out.println("fark.getYears() ="+fark.getYears());
        System.out.println("fark.getMonths() = "+fark.getMonths());
        System.out.println("fark.getDays() = "+ fark.getDays());

        System.out.println(fark.getYears()+"Yaşındasınız");
        /*************************************************************/

        Period period3Gun= Period.ofDays(3);
        Period period3Ay= Period.ofMonths(3);

        System.out.println("period3Gun = "+period3Gun);
        System.out.println("period3Ay = "+ period3Ay);

        LocalDate ucGunSonra= buGun.plus(period3Gun);
        System.out.println("ucGunSonra = "+ ucGunSonra);

        LocalDate ucAySonra= buGun.plus(period3Ay);
        System.out.println("ucAySonra = "+ ucAySonra);

        /*********************************************/

        //Kursun bitiş tarihini bulunuz 6 Ay 31 Ekim 2022
        LocalDate kursBaslangıc= LocalDate.of(2022,10,31);
        Period kursSure= Period.ofMonths(6);
        LocalDate kursBitis=kursBaslangıc.plus(kursSure);

        System.out.println("kursBitis =  "+kursBitis);
        System.out.println("getDayOfWeek() = "+ kursBitis.getDayOfWeek());

        //kursun bitmesine kalan süre
        Period neKadarSureKaldı= Period.between(buGun, kursBitis);
        System.out.println("neKadarSureKaldi= "+neKadarSureKaldı);

        //kurs ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi=Period.between(kursBaslangıc,buGun);
        System.out.println("suAnaKadarDevamSuresi= "+suAnaKadarDevamSuresi);





    }
}
