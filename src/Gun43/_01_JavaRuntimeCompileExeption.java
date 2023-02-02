package Gun43;

public class _01_JavaRuntimeCompileExeption {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        String kelime=""; //önce ; koymadık bu compile error
        char harf=kelime.charAt(3);// bu satırı en son ekledik, bu RUNTİME error
        //sadece mantık hatası var burada char olan kısımda yazılım kuralarında uygun

        System.out.println("Program bitti");

    }
    //daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara Derleme Zamanı yani
    // COMPİLE ERROR,Exception denir.

    //program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
    //çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.
}

