package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class RacingCarTest {

    @Test
    @DisplayName("4이상 수를 입력받으면 차가 움직인다.")
    void move() {
        RacingCar racingCar = new RacingCar("car");

        racingCar.move(4);
        Assertions.assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("3이하 수를 입력받으면 차가 움직이지 않는다.")
    void stop() {
        RacingCar racingCar = new RacingCar("car");

        racingCar.move(3);
        Assertions.assertThat(racingCar.getPosition()).isEqualTo(0);
    }


}