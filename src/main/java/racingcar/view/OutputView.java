package racingcar.view;

import racingcar.controller.RacingCarResultDto;

import java.util.List;

public class OutputView {
    public void showPlayResult(List<RacingCarResultDto> racingCarResultDtos, int round) {
        System.out.println("실행 결과");

        for (int gameRound = 0; gameRound < round; gameRound++) {


            for (int userIndex = 0; userIndex < racingCarResultDtos.size(); userIndex++) {

                RacingCarResultDto racingCarResultDto = racingCarResultDtos.get(userIndex);

                System.out.println(racingCarResultDto.getName() + ":" + racingCarResultDto.getPositionHistory().get(gameRound));


            }
            System.out.println();

        }

    }
}
