package ch02;

public class Elice {

    private Beverage beverage;
    private int height;
    private Location location;

    public Elice(
            Beverage beverage,
            int height,
            Location location
    ) {
        this.beverage = beverage;
        this.height = height;
        this.location = location;
    }

    public void drinkBeverage() {

    }

    public void eatCake() {

    }

    public void fan() {

    }

    public void eatMushrooms() {

    }

    public void throughDoor() {

    }

    public int getHeight() {
        return height;
    }

    public Location getLocation() {
        return location;
    }
}