package ch02;

import ch02.exception.OverHeightThanDoorException;

public class Door {

    public void getThrough(int height) {
        if (height > 40)
            throw new OverHeightThanDoorException();
    }
}