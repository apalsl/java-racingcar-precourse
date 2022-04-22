package racingcar.model;

import java.util.Objects;

public class Round {

    private final int round;
    private static final String NUMBER_REGEX = "-?(0|[1-9]\\d*)";
    private static final int MIN_NUMBER = 1;

    public Round(Integer round) {
        this.round = round;
    }

    public static Round from(String round) {
        if (isBlank(round)) {
            throw new IllegalArgumentException("[ERROR] 반복 횟수를 잘못 입력했습니다. 다시 입력하세요");
        }
        if (isNotNumber(round)) {
            throw new IllegalArgumentException("[ERROR] 0보다 큰 숫자만 입력 가능합니다. 다시 입력하세요.");
        }

        return new Round(Integer.valueOf(round));
    }

    private static boolean isNotNumber(String round) {
        return !round.matches(NUMBER_REGEX) || Integer.valueOf(round) < MIN_NUMBER;
    }

    private static boolean isBlank(String round) {
        return Objects.isNull(round) || round.trim().isEmpty();
    }
}
