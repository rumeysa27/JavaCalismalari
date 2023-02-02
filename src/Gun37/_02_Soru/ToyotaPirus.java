package Gun37._02_Soru;

public class ToyotaPirus extends Vehicle implements IGas,IElectric{
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return"İlk 3 km elektrik ile gider";
    }
}
