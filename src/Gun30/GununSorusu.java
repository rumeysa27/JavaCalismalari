package Gun30;

public class GununSorusu {

    int a;

    static  int b=0;//sen bitanesin demiş olduk static

    void artir(){
        a++;
        b++;
    }





    public static void main(String[] args) {
       GununSorusu gs1=new GununSorusu();
       gs1.a=5;
       GununSorusu gs2=new GununSorusu();
       gs2.a=7;
       //a nın değeri kaç oldu şu anda: burada verilecek cevap hangi a yı soruyorsunuz olmalı.
        //burada her nesnenin a sı var ve gs1 in5, gs2 nin ise 7 değeri var
        System.out.println("gs1.a= "+gs1);//5
        System.out.println("gs2.a= "+gs2);//7

        //soru b nin değeri kaçtır: tek bir değeri vardır en son değer
        System.out.println("GununSorusu.b= "+GununSorusu.b);

        gs1.artir();//gs1.a->6, b=1
        gs2.artir();//gs2.a ->8, b=2
        //soru a nın ve b nin en son değerleri kaçtır.
        System.out.println("s1.a= "+gs1.a);
        System.out.println("s2.a= "+gs2.a);
        System.out.println("Soru.b= "+GununSorusu.b);
    }
}
