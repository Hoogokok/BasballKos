package org.baseball;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExpectedNumberDto<T> {
    private final List<T> numbers;

    private ExpectedNumberDto(List<T> numbers) {
        this.numbers = numbers;
    }

    public static <T> ExpectedNumberDto newInstance(List<T> input) {

        return new ExpectedNumberDto(convertBaseBallNum(input));
    }

    private static <T> List<BallNum> convertBaseBallNum(List<T> input) {
        return input.stream().map(t -> Integer.parseInt((String) t)).map(BallNum::of).collect(Collectors.toList());
    }

    public List<T> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
