package org.baseball;

public class ResultView {
    public static void printIntermediateResults(ResultDto resultDto) {
        System.out.printf("결과 : %d%s%d%s", resultDto.getStrike(), Word.S, resultDto.getBall(), Word.B);
    }
}
