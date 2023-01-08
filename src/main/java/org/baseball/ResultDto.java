package org.baseball;

import java.util.List;

public class ResultDto<T> {
    private final T strike;
    private final T ball;

    private ResultDto(T strike, T ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public static <T> ResultDto newInstance(T strike, T ball) {
        return new ResultDto(strike, ball);
    }

    public T getStrike() {
        return strike;
    }

    public T getBall() {
        return ball;
    }

}
