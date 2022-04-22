package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class PositionHistories {

    private List<Position> positionHistories;

    public PositionHistories() {
        this.positionHistories = new ArrayList<>();
    }

    public void add(Position position) {
        this.positionHistories.add(position);
    }

    public List<Integer> getPositionHistories() {
        List<Integer> histories = new ArrayList<>();
        for (Position position : this.positionHistories) {
            histories.add(position.getPosition());
        }
        return histories;
    }
}
