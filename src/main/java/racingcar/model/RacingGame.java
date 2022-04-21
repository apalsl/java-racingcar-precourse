package racingcar.model;

import racingcar.utils.NameParse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingGame {

    private List<RacingCar> carList = new ArrayList<>();

    private int gameCount;


    public void ready(String carName) {
        String[] carNames = NameParse.parseName(carName);
        for (String name : carNames) {
            carList.add(new RacingCar(name));
        }
    }

    public void validGameCount(String gameCount) {
        if (isBlank(gameCount)) {
            throw new IllegalArgumentException("[ERROR] 반복 횟수를 잘못 입력했습니다. 다시 입력하세요");
        }
        if (isNotNumber(gameCount)) {
            throw new IllegalArgumentException("[ERROR] 0보다 큰 숫자만 입력 가능합니다. 다시 입력하세요.");
        }
        this.gameCount = Integer.valueOf(gameCount);
    }

    private boolean isNotNumber(String gameCount) {
        return !gameCount.matches("-?(0|[1-9]\\d*)") || Integer.valueOf(gameCount) < 1;
    }

    private boolean isBlank(String gameCount) {
        return Objects.isNull(gameCount) || gameCount.trim().isEmpty();
    }
}
