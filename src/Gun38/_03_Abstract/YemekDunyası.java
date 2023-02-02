package Gun38._03_Abstract;

public class YemekDunyası {
    public static void main(String[] args) {
        Baklava b= new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();

        GreekSalad gS=new GreekSalad();
        gS.setName("Greek Salad");
        gS.madeIn();
        gS.taste();

        SezerSalad sS= new SezerSalad();
        sS.setName("Sezer Salad");
        sS.madeIn();
        sS.taste();
    }
}
