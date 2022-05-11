package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        //throw new UnsupportedOperationException();
        OptionalInt optionalInt;
        if (values != null && values.length > 0) {
            int maxValue = values[0];
            for (int elem : values) {
                if (maxValue < elem) {
                    maxValue = elem;
                }
            }
            optionalInt = OptionalInt.of(maxValue);
        } else {
            optionalInt = OptionalInt.empty();
        }
        return optionalInt;
    }
}
