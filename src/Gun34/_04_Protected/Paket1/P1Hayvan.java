package Gun34._04_Protected.Paket1;

public class P1Hayvan {
    public  String ad;//her paketten her yerden ulaşılabilir
    int yas; //sadece bulunduğu pakettekiler
    protected  String cinsi;//default gibi diğer paketlerden erişilemiyor
    private  String renk;//bulunduğu classtan erişilebilir
}
