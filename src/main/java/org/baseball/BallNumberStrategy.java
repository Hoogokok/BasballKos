package org.baseball;

import java.util.List;

public interface BallNumberStrategy<T> {
    List<T> createBallNumber();
}
