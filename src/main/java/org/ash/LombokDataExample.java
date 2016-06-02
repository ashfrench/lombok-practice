package org.ash;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
public class LombokDataExample {

    private String myString = "TEST";
    private int someInt = 4;
    private List<Double> alist = Lists.newArrayList(4.2, 1.23, 4.648);


}
