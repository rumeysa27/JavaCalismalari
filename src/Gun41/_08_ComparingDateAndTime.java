package Gun41;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
       LocalDate buGun= LocalDate.now();
       LocalDate dun= buGun.minusDays(1);

       boolean sonraMi=buGun.isAfter(dun);//bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=buGun.isBefore(dun);//bugün dünden önce mi
        System.out.println("onceMi = "+ onceMi);

        boolean esitMi= buGun.isEqual(dun);//bugün düne eşit mi
        System.out.println("esitMi= "+ esitMi);

        boolean artikYilmi= buGun.isLeapYear();// bugün artık yıl mı
        System.out.println("artikYilmi = "+ artikYilmi);

    }
}
