package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız

        Scanner oku = new Scanner(System.in);// okuma işlemini yapacak olan değişken tanımlandı

        System.out.print("Adınızı ve soyadınızı giriniz :");// ekrana neyin girileceğini yazdık bilgilendirme
       String adSoyad= oku.nextLine();//okuma işlemi bu noktada yapılıyor/ bunu yazmazsan ad soyadını giremezsin

        System.out.println("Girilen ad ve soyad : " + adSoyad);// verinin gerçekten okunabildiğini
        // tekrar ekrana yazarak kontrol ettim.

    }
}
