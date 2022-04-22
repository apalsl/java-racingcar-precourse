package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.InputView;

public class RacingGameController {

    private RacingGame racingGame = new RacingGame();
    private InputView inputView = new InputView();


    public void start() {
        readyCar();
        initGameCount();
    }

    private void readyCar() {
        String carName = inputView.getCarNames();
        racingGame.ready(carName);
    }

    private void initGameCount() {
        String round = inputView.getRound();
        try {
            racingGame.initRound(round);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            initGameCount();
        }

    }

    private void startGame() {
    }
}
