package org.ash;

import lombok.Builder;

import java.util.List;

@Builder
public class LombokBuilderExample {

    private String myString;
    private int someInt;
    private List<Double> alist;

    public String getMyString() {
        return myString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public List<Double> getAlist() {
        return alist;
    }
}
