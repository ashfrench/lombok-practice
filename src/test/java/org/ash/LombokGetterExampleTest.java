package org.ash;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LombokGetterExampleTest {

    @Test
    public void testGetter() {
        LombokGetterExample example = new LombokGetterExample();
        assertEquals(example.getAlist(), Lists.newArrayList(4.2, 1.23, 4.648));
        assertEquals(example.getMyString(), "TEST");
        assertEquals(example.getSomeInt(), 4);
    }
}