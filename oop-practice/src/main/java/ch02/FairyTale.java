package ch02;

import static ch02.Location.*;

public class FairyTale {
    public static void main(String[] args) {
        Elice elice = new Elice(
                new Beverage(),
                new Mushroom(),
                140,
                AISLE
        );
        Door door = new Door();

        // 엘리스는 문을 통과하려고 한다. 하지만 키가 커서 실패한다.
        elice.throughDoor(door);

        // 엘리스는 탁자위에 있는 병을 발견하고 그 안에 있는 음료를 마신다.
        elice.drinkBeverage();

        // 키가 작아졌지만, 너무 작아지는 바람에 탁자위에 열쇠를 사용할 수 없다.
        // 엘리스는 케이크를 발견하였고, 케이크를 먹는다.
        elice.eatCake();

        // 엘리스의 키가 너무 커져버렸다. 이때 엘리스를 보고 놀란 토끼가 부채를 떨어뜨리고 도망간다.
        // 엘리스는 그 부채를 주워서 부채질을한다.
        elice.fan();

        // 우여곡절 끝에 버섯을 얻게 되고, 버섯의 한쪽을 먹으면 커지고, 다른 한쪽을 먹으면 작아진다는 걸 알아차린다.
        elice.eatRightOfMushroom();
        elice.eatRightOfMushroom();

        // 적당한 키로 돌아간 엘리스는 열쇠를 주워 문을 열고 다시 버섯을 먹어 키를 작게 만든다.
        elice.eatLeftOfMushroom();
        elice.eatLeftOfMushroom();
        elice.eatLeftOfMushroom();

        // 엘리스는 성공적으로 문을 통과하여 정원으로 들어간다.
        elice.throughDoor(door);
    }
}