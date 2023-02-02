package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        // \n -> yeni satır açıyor, alt satıra geçiyor
        // \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
        // \b -> back space karakteri geri siler
        // \" tırnak yazmak için kullanılıyor
        // \\ -> \ yazılacak ekrana
        // \r -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar

        System.out.println("Merhaba Dünya"); // MerhabaDünya
        System.out.println("Merhaba \nDünya"); // Merhaba alt satıra geçer Dünya
        // print veya println \ (terss slash) görünce bu ekrana yazılacak karakter değil,
        // ayrı bir iş yapmam isteniyor, devam eden n(alt satıra geç demek) karakterini görünce
        //ayrı işin alt satıra geçmek olduğunu anlıyor
        System.out.println("Merhaba\t Dünya");
        System.out.println("Merhaba\bDünya");//kendinden bir önceki karakteri siler
        System.out.println("Merhaba\"Dünya");
        System.out.println("Merhaba\\Dünya");
        System.out.println("Merhaba\rDünya"); //kendinden önceki kelimeleri siler
        System.out.println("********************************");
        System.out.println("Dürtme içimdeki narı\nÜstümde beyaz gömlek var");
        System.out.println("Hayat\bGüzel");
        System.out.println("Sakınma güzellikleri\r benden");
        System.out.println("Gelirken\"Gitme");
        System.out.println("Terslikler\\Düzlükler");






    }
}
