package Gun35._01_Final.method;

public class Ucak extends Araclar{
    public Ucak(String model) {
        super(model);
    }

   // public final String toString() { //metodu kimse değiştirsin istemiyorsan final yapacaksın buradaki gibi
    //    return "Araclar{" +
     //           "model='" + model + '\'' +
      //          '}';
   // } FİNAL metodların başında olursa değiştirilemez
    //değişkenlerin de başında olursa değeri sonradan değiştirilemez
    //classların başında olduğundu EXTEND edilemez
}
