package ch02.exception;

public class OverHeightThanDoorException
        extends RuntimeException {

    public OverHeightThanDoorException() {
        super("키가 문보다 커서 통과할 수 없습니다!!!");
    }
}