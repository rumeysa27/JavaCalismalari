package Gun37._01_Soru;

public class Shark extends Animals implements ISailing{


    public Shark(String food,  String sailing) {
        super(food,sailing);
    }

    @Override
    public String food() {

        return "kalamar yer";
    }

    @Override
    public String sailing() {

        return "Okyanuslarda yüzer";
    }
}
