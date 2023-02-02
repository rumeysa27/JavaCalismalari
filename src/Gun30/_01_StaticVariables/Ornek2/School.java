package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student ogr1=new Student(1,"Yusuf selim");
        Student ogr2=new Student(2,"Ayşe Serra");
        Student ogr3=new Student(3,"Aden Berra");//problem:hem id yi takip etmek zorunda
        // hem hata oranı yüksek

        Student ogr10=new Student("Yusuf selim");
        Student ogr11=new Student("Ayşe serra");
        Student ogr12=new Student("Aden berra");
        System.out.println("ogr10= "+ogr10);
        System.out.println("ogr11= "+ogr11);
        System.out.println("ogr12= "+ogr12);

    }
}
