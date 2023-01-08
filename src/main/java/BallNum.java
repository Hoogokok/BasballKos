import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class BallNum {
    private static final Map<Integer, BallNum> BallNumCashing = new HashMap<>();
    private final int ballNumber;

    static {
        IntStream.range(1, 10)
                .forEach(i -> BallNumCashing.put(i, new BallNum(i)));
    }

    private BallNum(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public static BallNum of(int i) {
        return BallNumCashing.get(i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNum ballNum = (BallNum) o;
        return ballNumber == ballNum.ballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber);
    }
}
