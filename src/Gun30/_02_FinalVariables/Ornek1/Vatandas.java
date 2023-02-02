package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {

    String isim;
  final int tcNo;//final değişkenlerine sadece 1kez veri atanabilir o da ya tanımlanırken ya da constructor ,
    //finalin görevi değer atandıktan  sonra değiştirilmeyi engelliyor..

  static  int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim=isim;
        this.tcNo=tcNoSayac;
        //static sayac ise her yeni nesne oluşturulduğunda yeni artan değer almasını sağlıyor..

    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
