package org.baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaseBallGameTest {

    @Test
    void compare() {
        TestBallNumberCreator testBallNumberCreator = new TestBallNumberCreator();
        List<BallNum> compareNum = List.of(BallNum.of(1), BallNum.of(2), BallNum.of(3));

        BaseBallGame baseBall = BaseBallGame.of(testBallNumberCreator.createBallNumber());

        ResultDto result = baseBall.compare(compareNum);

        assertAll(() -> assertEquals(result.getStrike(), 3),
                () -> assertEquals(result.getBall(), 0));
    }
}