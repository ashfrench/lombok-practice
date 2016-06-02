package org.ash;

import lombok.Value;

import java.util.List;

@Value
public class LombokImmutableClassExample {

    private String myString;
    private int someInt;
    private List<Double> alist;

}
