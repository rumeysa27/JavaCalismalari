package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullName;
    static int sayac=1;//her tarafta geçerli
    //static olmadan her zaman 0la başlıyordu
    //static olduğunda artık 1tane olduğundan değerini kourudu ve hep 1er tane arttı.
    //tüm nesnelere ait olan bilgileri veya sayac gibi işlemler için static kullanılır.


    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        //maindeki ilk 3satır için gerekli,static ten sonra gerek kalmadı
    }
    public Student(String fullName){
        this.id=sayac++;//önce var olan değer veriliyor,sonra artıyor
        this.fullName=fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
