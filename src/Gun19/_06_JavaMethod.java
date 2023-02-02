package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();//Math.random();
        merhabaYazRum("Rümeysa");//Math.Abs(-10)
        gelmesiniSoyle("Yusuf");

        cokMerhabaYaz(5);
        azMerhabaYaz(2);
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Java");
    }

    public static void merhabaYazRum(String isim){

        System.out.println(isim+"'ya merhaba");

    }
    public static void cokMerhabaYaz(int miktar){
        for (int i=0; i<miktar; i++){
            System.out.println(" merhaba");
        }

    }
    public static void gelmesiniSoyle(String isim){
        System.out.println(isim+ "'a söyle");

    }
    public static void azMerhabaYaz(int miktar){
        for (int i=0; i<miktar; i++){
            System.out.println("MERHABA");
        }
    }

}
