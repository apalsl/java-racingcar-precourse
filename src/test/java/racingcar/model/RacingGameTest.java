package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class RacingGameTest {

    @ParameterizedTest
    @ValueSource(strings = {"0", "-10", "abc", " 1"})
    @DisplayName("게임 반복 횟수로 0이하 및 문자열 입력 시 예외 발생")
    void gameCount_notNumber(String input) {

        RacingGame racingGame = new RacingGame();

        Assertions.assertThatThrownBy(() -> racingGame.validGameCount(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    @DisplayName("게임 반복 횟수로 공백 입력 시 예외 발생")
    void gameCount_isBlank(String input) {
        RacingGame racingGame = new RacingGame();

        Assertions.assertThatThrownBy(() -> racingGame.validGameCount(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }


}