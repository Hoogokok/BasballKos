package org.baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseBallTest {

    @Test
    void totalResult() {
        //given
        BallNum one = BallNum.of(1);
        BallNum two = BallNum.of(2);
        BallNum three = BallNum.of(3);
        List<BallNum> inputBallNum = List.of(one, two, three);
        BallNum four = BallNum.of(4);
        List<BallNum> compareBall = List.of(one, three, four);
        BaseBallGame baseBall = BaseBallGame.of(inputBallNum);
        //when
        ResultDto expected = baseBall.result(compareBall);

        //then


        assertAll(() -> assertEquals(expected.getBall(), 1),
                () -> assertEquals(expected.getStrike(), 1));
    }
}
