package org.baseball;

import java.util.List;

public class ResultDto<T> {
    private final List<T> results;

    private ResultDto(List<T> result) {
        this.results = result;
    }

    public static <T> ResultDto newInstance(List<T> result) {
        return new ResultDto(result);
    }

    public T getStrike() {
        return results.get(0);
    }

    public T getBall() {
        return results.get(1);
    }

}
