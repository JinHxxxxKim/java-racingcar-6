package racingcar.controller;

import java.util.HashMap;
import java.util.List;
import racingcar.service.RacingCarService;
import racingcar.view.MainView;

public class RacingcarController {
    private static final RacingcarController instance = new RacingcarController();

    public static RacingcarController getInstance() {
        return instance;
    }

    private RacingcarController() {
    }

    private RacingCarService baseBallService = RacingCarService.getInstance();

    public void run() {
        MainView.printStartMessage();
        List<String> carNames = MainView.getCarNames();
        HashMap<String, Integer> racingStatus = baseBallService.initRacingStatus(carNames);
        MainView.printInputAttemptMessage();
    }
}
