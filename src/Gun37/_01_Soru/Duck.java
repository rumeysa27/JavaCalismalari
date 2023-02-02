package Gun37._01_Soru;

public class Duck extends Animals implements ISailing,IFlying{
    public Duck(String food, String flying, String sailing) {
        super(food, flying, sailing);
    }


    @Override
    public String food() {
        return "Et ve ot ile beslenir";
    }

    @Override
    public String flying() {
        return "Gökyüzünde uçar";
    }

    @Override
    public String sailing() {
        return "Göletlerde yüzer";
    }
}
