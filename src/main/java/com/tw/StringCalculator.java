package com.tw;

import java.util.Arrays;

public class StringCalculator {
    public int add(String string) {
        return string.isEmpty() ? 0 : Arrays.stream(string.split("[,\n;]|[^0-9]"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
