package Gun37._01_Soru;

public class Animals {
    private String food;
    private String flying;
    private String sailing;

    public Animals(String food, String flying, String sailing) {
        setFlying(flying);
        setFood(food);
        setSailing(sailing);
    }

   public Animals(String food, String sailing) {
    }

    public Animals(String food) {
    }




    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFlying() {
        return flying;
    }

    public void setFlying(String flying) {
        this.flying = flying;
    }

    public String getSailing() {
        return sailing;
    }

    public void setSailing(String sailing) {
        this.sailing = sailing;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", flying='" + flying + '\'' +
                ", sailing='" + sailing + '\'' +
                '}';
    }
}
