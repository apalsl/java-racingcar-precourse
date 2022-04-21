package racingcar.model;

import racingcar.utils.NameParse;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private List<RacingCar> carList = new ArrayList<>();

    private GameCount gameCount;


    public void ready(String carName) {
        String[] carNames = NameParse.parseName(carName);
        for (String name : carNames) {
            carList.add(new RacingCar(name));
        }
    }

    public void initGameCount(String gameCount) {
        this.gameCount = GameCount.from(gameCount);
    }




}
