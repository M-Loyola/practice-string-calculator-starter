package com.tw;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringCalculator {
    public int add(String string) {
        return string.isEmpty() ? 0 : Arrays.stream(string.split("[,\n;]|[^0-9]"))
                .flatMapToInt(s -> !s.isEmpty() ? IntStream.of(Integer.parseInt(s)) : IntStream.empty())
                .sum();
    }
}
