package org.baseball;

import java.util.List;
import java.util.Objects;

public class BaseBallGame {
    private final List<BallNum> ballNumbers;
    private static BaseBallGame baseBall;

    private BaseBallGame(List<BallNum> correctNumbers) {
        this.ballNumbers = correctNumbers;
    }

    public static BaseBallGame of(List<BallNum> correctNumbers) {
        if (Objects.isNull(baseBall)) {
            baseBall = new BaseBallGame(correctNumbers);
            return baseBall;
        }
        return baseBall;
    }

    public ResultDto result(List<BallNum> compareBall) {
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < compareBall.size(); i++) {
            if (ballNumbers.contains(compareBall.get(i)) && !ballNumbers.get(i).equals(compareBall.get(i))) {
                ball++;
            }

            if (ballNumbers.get(i).equals(compareBall.get(i))) {
                strike++;
            }
        }

        return ResultDto.newInstance(strike, ball);
    }

}


