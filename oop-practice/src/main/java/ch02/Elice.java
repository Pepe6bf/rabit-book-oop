package ch02;

import ch02.exception.LackOfBeverageException;
import ch02.exception.OverHeightThanDoorException;

import static ch02.Location.*;

public class Elice {

    private final Beverage beverage;
    private final Mushroom mushroom;
    private int height;
    private Location location;

    public Elice(
            Beverage beverage,
            Mushroom mushroom,
            int height,
            Location location
    ) {
        this.beverage = beverage;
        this.mushroom = mushroom;
        this.height = height;
        this.location = location;
    }

    public void drinkBeverage() {
        try {
            beverage.drunken(20);
            height = 24;
            displayHeight();
        } catch (LackOfBeverageException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eatCake() {
        height = 240;
        displayHeight();
    }

    public void fan() {
        height = 60;
        displayHeight();
    }

    public void eatLeftOfMushroom() {
        mushroom.eatenLeft();
        height -= 30;
        displayHeight();
    }

    public void eatRightOfMushroom() {
        mushroom.eatenRight();
        height += 30;
        displayHeight();
    }

    public void throughDoor(Door door) {
        try {
            door.getThrough(height);
            location = GARDEN;
        } catch (OverHeightThanDoorException e) {
            System.out.println(e.getMessage());
        }
        displayLocation();
    }

    public int getHeight() {
        return height;
    }

    public Location getLocation() {
        return location;
    }

    private void displayHeight() {
        System.out.println("엘리스의 키가 " + height + "cm가 되었다!");
    }

    private void displayLocation() {
        System.out.println("현재 위치 : " + location);
    }
}