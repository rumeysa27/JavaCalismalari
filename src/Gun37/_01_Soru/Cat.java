package Gun37._01_Soru;

public class Cat extends Animals implements IAnimal {
    public Cat(String food){
        super(food);

    }

    @Override
    public String food() {
        return "Süt ile beslenir";
    }
}
