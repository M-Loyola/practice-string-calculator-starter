package com.tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StringCalculator {
    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        return Arrays.stream(string.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
