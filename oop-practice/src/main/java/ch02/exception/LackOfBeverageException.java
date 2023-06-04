package ch02.exception;

public class LackOfBeverageException
        extends RuntimeException {

    public LackOfBeverageException() {
        super("음료가 부족합니다!");
    }
}