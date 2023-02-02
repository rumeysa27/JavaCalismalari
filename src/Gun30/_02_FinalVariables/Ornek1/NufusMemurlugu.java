package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("ayse");
        Vatandas v2=new Vatandas("Mehmet");
        Vatandas v3=new Vatandas("Ahmet");

        System.out.println("v1= "+v1);
        System.out.println("v2= "+v2);
        System.out.println("v3= "+v3);

        //final hem sabit değerler için hem de sonradan değişmesini istemediğimiz değerler için kulllanılır..
    }
}
