package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.InputView;

public class RacingGameController {

    private RacingGame racingGame = new RacingGame();
    private InputView inputView = new InputView();


    public void start() {
        readyCar();
        initGameCount();
        startGame();
    }

    private void readyCar() {
        String carName = inputView.getCarNames();
        racingGame.ready(carName);
    }

    private void initGameCount() {
        String gameCount = inputView.getGameCount();
        try {
            racingGame.validGameCount(gameCount);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            initGameCount();
        }

    }
    private void startGame() {

    }


}
