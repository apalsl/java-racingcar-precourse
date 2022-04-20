package racingcar.model;

public class RacingCar {

    private static final int ENOUGH_POWER = 4;

    private Name name;
    private int position;

    public void move(int randomNumber) {
        if (randomNumber >= ENOUGH_POWER) {
            position++;
        }
    }

    public int getPosition() {
        return this.position;
    }
}
