package Gun37._01_Soru;

public class Swallow extends Animals implements IFlying{

    public Swallow(String food, String flying) {
        super(food, flying);
    }

    @Override
    public String food() {
        return "Böcek ile beslenir";
    }

    @Override
    public String flying() {
        return "Açık alanlarda uçarlar";
    }
}
