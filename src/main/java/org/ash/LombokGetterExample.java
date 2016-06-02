package org.ash;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.List;

@Getter
public class LombokGetterExample {

    private String myString = "TEST";
    private int someInt = 4;
    private List<Double> alist = Lists.newArrayList(4.2, 1.23, 4.648);
}
