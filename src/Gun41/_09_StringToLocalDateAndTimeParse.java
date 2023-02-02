package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan ve string durumundaki time veya tarih bilgisinin time veya tarih bilgisine çevrilmesi

        long startTime= System.currentTimeMillis();//kodun performansı başlayış saati
        long finishTime= System.currentTimeMillis();//bitiş saati
        System.out.println("gecenSure="+(finishTime-startTime)+"sn");//kodun ne zaman başlayıp ne zaman bittiğini yazdık

        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023) = ");
        String strTarih=oku.nextLine();

        //Kullanıcının gireceği formata göre format oluşturduk
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        //String in formatı bu formata uygun olmalı. o yüzden parse ile çevirdik
        LocalDate tarih= LocalDate.parse(strTarih,f);

        System.out.println("tarih = "+ tarih.format(f));
    }
}
