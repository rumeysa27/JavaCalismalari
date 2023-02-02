package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Ornek {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    //4- Adım: getBirthYear isminde persona ait bir metod yazınız çalştığında kişinin doğum yılını versn
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.
    public static void main(String[] args) {
        Person calısan1=new Person();
        calısan1.name="Alina";
        calısan1.surName="Çevik";
        calısan1.age=30;

        Person calısan2=new Person();
        calısan2.name="Erkan";
        calısan2.surName="Alkan";
        calısan2.age=32;

//aynı şeyi iki defa yazıyorsan metod kullan...
        //1.yöntem
        System.out.println("calısan1.name= "+calısan1.name);
        System.out.println("calısan1.surName= "+calısan1.surName);
        System.out.println("calısan1.age= "+calısan1.age);

        System.out.println("calısan2.name= "+calısan2.name);
        System.out.println("calısan2.surName= "+calısan2.surName);
        System.out.println("calısan2.age= "+calısan2.age);

        //2.yöntem normal metod
        BilgiYazdir(calısan1);
        BilgiYazdir(calısan2);

        //3.yöntem metodu ait olduğu class dan çağırıyoruz
        calısan1.BilgiYazdir();
        calısan2.BilgiYazdir();

      /*  int[] dizi=new int[5];
        System.out.println("Arrays.toString(dizi)="+ Arrays.toString(dizi));
        ArrayList<Integer> liste=new ArrayList<>();
        System.out.println("Liste= "+Liste.toString);*/

        //4.yöntem
        System.out.println("calısan1= "+calısan1);
        calısan1.getBirthYear();
        System.out.println(calısan2.getBirthdayYear2());//bir başka yöntem de bu person kısmında strinle ayrı metod açıp çağrdk
        calısan1.getInitials();
    }

    private static void BilgiYazdir(Person calısan) {
        System.out.println("calısan.name = " + calısan.name);
        System.out.println("calısan.surName = " + calısan.surName);
        System.out.println("calısan.age="+calısan.age);
    }



    }

