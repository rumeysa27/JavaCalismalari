package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program başladı");

        for (int i=0; i<3; i++){//for döngüsünü sonradan ekledik doğruyu yazana kadar düzeltene kadar girsin diye
        try {//hata bölgesini try(hata şeridine) aldık
            Scanner oku= new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1=oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2= oku.nextInt();

            int bolum=sayi1/sayi2;
            System.out.print("bolum="+ bolum);
        }
        catch (Exception hata)//hata mesajlarını hata isimli Exception cinsinden değişkene attık
        {
            System.out.println("hata = "+ hata.getMessage());
            System.out.println("Lütfen tekrar deneyiniz");
            i--;//for döngüsünün devamı
        }

        System.out.println("Program bitti");
    }
}
}