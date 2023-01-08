package org.baseball;

public class ResultDto {
    private final int strike;
    private final int ball;

    private ResultDto(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }
    
    public static ResultDto newInstance(int strike, int ball){
        return  new ResultDto(strike,ball);
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
