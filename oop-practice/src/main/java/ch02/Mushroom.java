package ch02;

public class Mushroom {

    private int leftQuantity = 5;
    private int rightQuantity = 5;

    public void eatenLeft() {
        leftQuantity -= 1;
    }

    public void eatenRight() {
        rightQuantity -= 1;
    }

    public int getLeftQuantity() {
        return leftQuantity;
    }

    public int getRightQuantity() {
        return rightQuantity;
    }
}