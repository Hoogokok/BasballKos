import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseBallTest {

    @Test
    void countBall() {
        //given
        BallNum one = BallNum.of(1);
        BallNum two = BallNum.of(2);
        BallNum three = BallNum.of(3);
        List<BallNum> inputBallNum = List.of(one, two, three);
        BallNum four = BallNum.of(4);
        List<BallNum> compareBall = List.of(one, three, four);
        BaseBall baseBall = BaseBall.of(inputBallNum);
        //when

        //then

        int expected = baseBall.countBall(compareBall);

        assertEquals(expected, 1);
    }

    @Test
    void countStrike(){
        BallNum one = BallNum.of(1);
        BallNum two = BallNum.of(2);
        BallNum three = BallNum.of(3);
        BallNum four = BallNum.of(4);
        List<BallNum> inputBallNum = List.of(one, two, three);
        List<BallNum> compareBall = List.of(one, three, four);
        BaseBall baseBall = BaseBall.of(inputBallNum);
        //when

        //then

        int expected = baseBall.countStrike(compareBall);

        assertEquals(expected, 1);
    }
}
