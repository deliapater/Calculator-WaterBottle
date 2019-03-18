public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public int Drink() {
        return this.volume - 10;
    }

    public int Empty(){
        return this.volume = 0;
    }


    public int Fill(){
       return this.volume = 100;
    }
}
