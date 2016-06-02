package org.ash;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LombokBuilderExampleTest {

    @Test
    public void builder() throws Exception {
        List<Double> alist = Lists.newArrayList(2.3, 2.3, 456.465);
        LombokBuilderExample builderExample = LombokBuilderExample.builder()
                .myString("Ash")
                .someInt(3)
                .alist(alist)
                .build();

        assertEquals("Ash", builderExample.getMyString());
        assertEquals(3, builderExample.getSomeInt());
        assertEquals(new ArrayList<>(alist), builderExample.getAlist());
    }

}