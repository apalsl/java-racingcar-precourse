package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class RacingCarTest {

    RacingCar racingCar;

    @BeforeEach
    void setup() {
        racingCar = new RacingCar("car");
    }

    @Test
    @DisplayName("4이상 수를 입력받으면 차가 움직인다.")
    void move() {
        racingCar.move(4);
        Assertions.assertThat(racingCar.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    @DisplayName("3이하 수를 입력받으면 차가 움직이지 않는다.")
    void stop() {
        racingCar.move(3);
        Assertions.assertThat(racingCar.getPosition()).isEqualTo(new Position(0));
    }
    @Test
    @DisplayName("차가 움직일때마다 현재 위치를 히스토리에 쌓는다.")
    void addHistory() {
        racingCar.move(4);
        Assertions.assertThat(racingCar.getPositionHistories().get(0)).isEqualTo(1);

        racingCar.move(5);
        Assertions.assertThat(racingCar.getPositionHistories().get(1)).isEqualTo(2);

        racingCar.move(3);
        Assertions.assertThat(racingCar.getPositionHistories().get(1)).isEqualTo(2);
    }


}