package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.utils.NameParse;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private List<RacingCar> carList = new ArrayList<>();

    private Round round;


    public void ready(String carName) {
        String[] carNames = NameParse.parseName(carName);
        for (String name : carNames) {
            carList.add(new RacingCar(name));
        }
    }

    public void initRound(String round) {
        this.round = Round.from(round);
    }

    public void play() {
        for (int playRound = 0; playRound < this.round.getRound(); playRound++) {
            for (RacingCar racingCar : this.carList) {
                racingCar.move(Randoms.pickNumberInRange(0, 9));
            }
        }
    }

    public List<RacingCar> getPlayResult() {
        return this.carList;
    }

    public int getRound() {
        return this.round.getRound();
    }
}
