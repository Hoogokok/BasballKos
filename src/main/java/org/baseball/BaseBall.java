package org.baseball;

import java.util.List;
import java.util.Objects;

public class BaseBall {
    private final List<BallNum> ballNumbers;
    private static BaseBall baseBall;

    private BaseBall(List<BallNum> ballNums) {
        this.ballNumbers = ballNums;
    }

    public static BaseBall of(List<BallNum> ballNums) {
        if (Objects.isNull(baseBall)) {
            baseBall = new BaseBall(ballNums);
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
