package Gun25;
//tiplerin tanımlandığı yer yani classların
public class _01_JavaClassAndObject {
    //metodların yazıldığı yer
    public static void main(String[] args) {
        //ana programın başladığı ve çalıştığı yer
        Araba benimArabam=new Araba();//araba tür, tip adı, benimArabam nesne
        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benimArabam.yili= "+benimArabam.yili);
        System.out.println("benimArabam.renk= "+benimArabam.renk);
        System.out.println("benimArabam.marka= "+benimArabam.marka);
        System.out.println("benimArabam.motorHacmi= "+benimArabam.motorHacmi);


    } //bittiği yer dur bölümü
    //metodların yazıldığı yer
}
// class-tiplerin tanımlandığı yer
class Araba{
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}