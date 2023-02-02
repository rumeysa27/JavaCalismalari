package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad = "İsmet"; // String : kelime veya kelimeleri saklamak için kullanılır
        // sınırlarını " " ile belirlenir.

        String soyad = "Temur";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " +ad+" "+soyad);
        // + lar burada stringler arasında olduğu birleştirir

        String tamAd = "Rümeysa" + " "+ "Bakır";
        System.out.println("tamAd: "+ tamAd);
        System.out.println("************************");
        String kitap= "Mimoza Sürgünü";
        String yazar="Nazan Bekiroğlu";
        System.out.println("kitap: "+ kitap);
        System.out.println("yazar: "+ yazar);
        System.out.println("****************");
        System.out.println("kitap\\yazar: "+ kitap +" \\ "+ yazar);




    }
}
