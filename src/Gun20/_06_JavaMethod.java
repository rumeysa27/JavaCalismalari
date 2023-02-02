package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul("rümeysa",s1, s2);
        int sonuc2 = toplamBul("nursel",s1, s2, s3);
        int sonuc3 = toplamBul("rübi",s1, s2, s3, s4);

        System.out.println("sonuc1= "+ sonuc1);
        System.out.println("sonuc2= "+ sonuc2);
        System.out.println("sonuc3= "+ sonuc3);
    }

    //gelen kaç sayı olursa olsun hepsini dizi şeklinde metoda al

    public static int toplamBul(String isim, int...sayilar){ //kaç sayı gelirse gelsin onları dizi şeklinde alıyor
        int toplam=0;
        System.out.println("isim= "+ isim);

        for (int i=0; i< sayilar.length;i++){
            toplam=toplam+sayilar[i];
        }
        return toplam;
    }

    // ... ile ilgili 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı
    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al


   /* public static int toplamBul(int s1,int s2){ //yukarıda yaptığımız buradaki uzun yolun kısası
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2,int s3){
        return s1+s2+s3;
    }

    public static int toplamBul(int s1,int s2,int s3, int s4){
        return s1+s2+s3+s4; */
    }

