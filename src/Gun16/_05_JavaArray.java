package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        //{"trt","atv"

        String[] tvler={"trt","atv","kanald","fox","habertürk"};//01234

        int rastgele= (int)(Math.random()*tvler.length);//5kadar 5dahil

        System.out.println("rastgele secilen Tv= "+ tvler[rastgele]);

        // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz (bu soruya göre)
        // fakat bir buldunu tekrar bulmasın


    }
}
