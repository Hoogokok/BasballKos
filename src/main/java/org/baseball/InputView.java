package org.baseball;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_BALL_GUIDE = "숫자 3개를 입력하세요.";
    private static final Scanner sc = new Scanner(System.in);
    public List<String> printInputView(){
        System.out.println(INPUT_BALL_GUIDE);
        String tempBallNum = sc.nextLine();

        return split(tempBallNum);
    }

    private static List<String> split(String input) {
        return Arrays.stream(input.split("")).collect(Collectors.toUnmodifiableList());
    }
}
