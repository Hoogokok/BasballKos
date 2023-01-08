package org.baseball;

import org.baseball.BallNum;
import org.baseball.BallNumberStrategy;

import java.util.List;

public class TestBallNumberCreator implements BallNumberStrategy {
    @Override
    public List<BallNum> createBallNumber() {
        return List.of(BallNum.of(1), BallNum.of(2), BallNum.of(3));
    }
}