package ch02;

import ch02.exception.LackOfBeverageException;

public class Beverage {

    private int quantity = 50;

    public void drunken(int quantity) {
        if (this.quantity < quantity)
            throw new LackOfBeverageException();

        this.quantity -= quantity;
    }
}