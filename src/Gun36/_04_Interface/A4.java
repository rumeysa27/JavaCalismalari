package Gun36._04_Interface;
//1class 1den fazla interface implemente edebilir.
public class A4 implements IGosterir,IYazdirir{
    @Override
    public void göster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdırdı");

    }
}
