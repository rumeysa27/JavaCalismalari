package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığının double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazınız.
        // vucut kitle ındexını de bularak yazdırınız (kg/ boy*boy)

        double agirlik= 52;
        int boy= 166;

        double kitleIndex= agirlik / (boy*boy);

        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("boyunuz="+boy+", kilonuz="+agirlik);

        /**************/
        double boy2=1.66;
        double kitleIndex2= agirlik / (boy2*boy2);
        System.out.println("kitleIndex2 = " + kitleIndex2);






    }
}
