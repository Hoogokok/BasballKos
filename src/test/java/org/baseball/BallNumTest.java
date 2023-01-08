package org.baseball;

import org.baseball.BallNum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallNumTest {

    @Test
    void newInstance() {
        //given
        BallNum ballNum = BallNum.of(1);
        //when
        BallNum otherBall = BallNum.of(1);
        //then
        assertEquals(ballNum,otherBall);
    }
}
