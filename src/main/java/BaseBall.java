import java.util.List;
import java.util.Objects;

public class BaseBall {
    private final List<BallNum> ballNums;
    private static BaseBall baseBall;

    private BaseBall(List<BallNum> ballNums) {
        this.ballNums = ballNums;
    }

    public static BaseBall of(List<BallNum> ballNums) {
        if (Objects.isNull(baseBall)) {
            baseBall = new BaseBall(ballNums);
            return baseBall;
        }
        return baseBall;
    }


    public int countBall(List<BallNum> compareBall) {
        int count = 0;

        for (int i = 0; i < compareBall.size(); i++) {
            if (ballNums.contains(compareBall.get(i)) && ballNums.get(i).equals(compareBall.get(i))) {
                count++;
            }
        }

        return count;
    }


    public int countStrike(List<BallNum> compareBall) {
        int count = 0;

        for (int i = 0; i < compareBall.size(); i++) {
            if (ballNums.get(i).equals(compareBall.get(i))) {
                count++;
            }
        }
        return count;
    }
}
