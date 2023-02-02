package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCath {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");
        try {
        LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30);

        }catch (Exception ex)//ex isimli değişkende oluşan hataların bilgisi atanıyor hata olduğunda
                //yapılması istenenler buraya yazılıyor
        {
            System.out.println("Hata oluştu lütfen tekrar deneyiniz");
            System.out.println("Tüm hata mesajı = "+ex);
            System.out.println("Hatanın açıklaması= "+ ex.getMessage());
            //kendine hata mesajını kendine mail atabilirsin
            //log tutma: program nasıl çalışıyor, hata loglarını HARDDİSKE yazabilirsin
        }
        System.out.println("Program bitti");
        try {
            //java ve tolları çalışmaya devam et
            //konuları öğrenmeye ve çalışmaya devam
            //anlamadığın yer mi oldu kırılmadan devam et:
        } catch (Exception ex){
            //hatanın sebebini anla
            //derse daha fazla odaklan
            //gereken videoları izle
            //grup çalışması yap
            //öğren ve kırılmadan devam et
            //unutma sen bi söz verdin ve DEVAM
        }
        //sonunda seni güzel bir meslek bekliyor.
    }
}
