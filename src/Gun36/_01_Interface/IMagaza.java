package Gun36._01_Interface;

public interface IMagaza {//buraya public tazdığımız için zaten alttakilerin başına public almamıza gerek yok
    //otomatikmen zaten onlar da public olmuş oluyor her yerden erişilebiliyor
    //interface den nesne türetemezsin bu sadece metodların iisimlerin olduğu taslak
    //sadece referans olarak kullanabilirsin
    //data saklamaz static falan kullanamayız conscructor metod içermez
    //metod yazılımılarını zorunlu tutar ama içini serbest bırakır birden fazla şablon oluşturmaya izin  verir
    //iki işlemi bir classta da oluşturabiliriz
    //interface den interface ye genişletme aktarma yapabiliyoruz extends ile.
    //class interface den implement alır ama interface classtan imlement almaz interface interfaceden alabilir
    //diğer classlardan ayrılsın diye başına I kullanıyoruz mesela Iaraba classı açarsak böyle




    void bilgileriAl();
    void krediSkorunuKontrolEt();
    void krediSecenekleriniGoster();
    void belgeleriImzalat();
    void krediyiKullandir();
    void krediSkoruGoster();



}
