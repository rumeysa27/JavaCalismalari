package Gun44;

public class S35 {
    public static void main(String[] args) {//bu soru çok kolaydı hemen yaptım
//AŞAĞIDAKİNİN çıktısı ne olur

        int num1[]={1,2,3};
        int num2[]={1,2,3,4,5};
        num2=num1; //num2yi num1e eşitledik artık num2nin referansı num1 yani birbirine eşitler
        for(int x: num2){
            System.out.print(x+ ":");
        }



    }
}
