package org.ash;

import lombok.NonNull;

import java.util.List;

public class LombokNonNullExample {

    private String myString;
    private int someInt;
    private List<Double> alist;

    public LombokNonNullExample(@NonNull String myString, int someInt, @NonNull List<Double> alist) {
        this.myString = myString;
        this.someInt = someInt;
        this.alist = alist;
    }
}
