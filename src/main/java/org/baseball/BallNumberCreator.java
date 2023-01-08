package org.baseball;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BallNumberCreator  implements BallNumberStrategy{
    @Override
    public List<BallNum> createBallNumber() {
        List<BallNum> ballNum = IntStream.range(1, 10).mapToObj(BallNum::of).collect(Collectors.toList());

        Collections.shuffle(ballNum);

        return  ballNum.stream().limit(3).collect(Collectors.toUnmodifiableList());
    }
}
