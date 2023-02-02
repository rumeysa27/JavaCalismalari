package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) { //static olduğu için bir tane yani en son değer ne ise o kalıyor
        // en sonda b olduğu için değer b kaldı
        A a=new A();
        System.out.println("A.mesaj = "+ A.mesaj); //A dan merhaba

        B b=new B();
        System.out.println("A.mesaj = "+ A.mesaj);//B den merhaba

        A a2=new A();
        System.out.println("A.mesaj = "+ A.mesaj);// B den merhaba
    }
}
