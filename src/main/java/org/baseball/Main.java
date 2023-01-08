package org.baseball;

public class Main {
    public static void main(String[] args) {
        BallNumberCreator ballNumberCreator = new BallNumberCreator();
        BaseBallGame baseBall = BaseBallGame.of(ballNumberCreator.createBallNumber());
        int count = 0;

        do {
            count++;

            ExpectedNumberDto expectedNumberDto = InputView.printInputView();
            ResultDto resultDto = baseBall.compare(expectedNumberDto.getNumbers());
            ResultView.printIntermediateResults(resultDto);

            if (resultDto.getStrike().equals(BaseBallGame.ALL_STRIKE)) {
                ResultView.printTryNum(count);
                return;
            }

        } while (true);


    }
}