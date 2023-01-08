package org.baseball;

import org.baseball.ExpectedNumberDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpectedNumberDtoTest {
    @Test
    void getNum() {
        List<String> input = List.of("1", "2", "3");
        ExpectedNumberDto<BallNum> expectedNumberDto = ExpectedNumberDto.newInstance(input);

        assertEquals(expectedNumberDto.getNumbers(), List.of(BallNum.of(1), BallNum.of(2), BallNum.of(3)));
    }
}
