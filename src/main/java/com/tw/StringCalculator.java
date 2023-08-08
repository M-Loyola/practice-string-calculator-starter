package com.tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StringCalculator {
    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        return Arrays.stream(string.split("[,\n;]"))
                .map(s -> s.replaceAll("[^0-9]", ""))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
