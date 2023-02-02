package Gun28._02_Constructor;

public class kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {

        Kitap kit1=new Kitap();
        kit1.name="Mimoza Sürgünü";
        kit1.author="Nazan Bekiroğlu";
        kit1.publishYear=2007;

        Kitap kit2=new Kitap("Dava",1980,"Franz Kafka");
        Kitap kit3=new Kitap("Yalnızız",2000);

        System.out.println("kit1= "+kit1);
        System.out.println("kit2= "+kit2);
        System.out.println("kit3= "+kit3);
    }
}
