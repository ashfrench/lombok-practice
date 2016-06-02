package org.ash;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class LombokBuilderExample {

    private String myString;
    private int someInt;
    private List<Double> alist;
}
