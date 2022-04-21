package racingcar.model;

import java.util.Objects;

public class GameCount {

    private final int gameCount;
    private static final String NUMBER_REGEX = "-?(0|[1-9]\\d*)";
    private static final int MIN_NUMBER = 1;

    public GameCount(Integer gameCount) {
        this.gameCount = gameCount;
    }

    public static GameCount from(String gameCount) {
        if (isBlank(gameCount)) {
            throw new IllegalArgumentException("[ERROR] 반복 횟수를 잘못 입력했습니다. 다시 입력하세요");
        }
        if (isNotNumber(gameCount)) {
            throw new IllegalArgumentException("[ERROR] 0보다 큰 숫자만 입력 가능합니다. 다시 입력하세요.");
        }

        return new GameCount(Integer.valueOf(gameCount));
    }

    private static boolean isNotNumber(String gameCount) {
        return !gameCount.matches(NUMBER_REGEX) || Integer.valueOf(gameCount) < MIN_NUMBER;
    }

    private static boolean isBlank(String gameCount) {
        return Objects.isNull(gameCount) || gameCount.trim().isEmpty();
    }
}
