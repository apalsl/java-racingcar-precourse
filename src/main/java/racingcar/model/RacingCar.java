package racingcar.model;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private static final int ENOUGH_POWER = 4;

    private Name name;
    private int position;
    private List<Integer> positionHistory;

    public RacingCar(String name) {
        this.name = Name.from(name);
        this.position = 0;
        this.positionHistory = new ArrayList<>();
    }

    public void move(int randomNumber) {
        if (randomNumber >= ENOUGH_POWER) {
            position++;
        }
        addPosition();
    }

    private void addPosition() {
        positionHistory.add(position);
    }

    public int getPosition() {
        return this.position;
    }

    public List<Integer> getPositionHistory() {
        return this.positionHistory;
    }
}
