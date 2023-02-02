package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime {
    public static void main(String[] args) {
        //LocalDateTime hem tarih hem de saat bilgisini tutar

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = "+ ldt);

        System.out.println("ldt.getYear() = "+ldt.getYear());
        System.out.println("ldt.getMonth() = "+ldt.getMonth());
        System.out.println("ldt.getMonthValue() = "+ ldt.getMonthValue());
        System.out.println("ldt.getDayOfYear() = "+ ldt.getDayOfYear());
        System.out.println("ldt.getDayOfMonth() = "+ldt.getDayOfMonth());
        System.out.println("ldt.getDayOfWeek() = "+ ldt.getDayOfWeek());
        System.out.println("getDayOfWeek().getValue() = "+ ldt.getDayOfWeek().getValue());
        System.out.println("ldt.getHour() = "+ldt.getHour());
        System.out.println("ldt.getMinute() = "+ldt.getMinute());
        System.out.println("ldt.getSecond() = "+ ldt.getSecond());
        System.out.println("ldt.getNano() = "+ ldt.getNano());

        System.out.println("ISO_DATE = "+ldt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT = "+ ldt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM = "+ldt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        //özel formatta istediğimiz gibi yazdırma
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("ldt.format(f) = "+ ldt.format(f));
    }
}
