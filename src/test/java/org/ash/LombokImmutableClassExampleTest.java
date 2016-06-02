package org.ash;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LombokImmutableClassExampleTest {

    @Test
    public void testImmutable() throws Exception {
        ArrayList<Double> alist1 = Lists.newArrayList(2.365, 56.124);
        LombokImmutableClassExample example = new LombokImmutableClassExample("test", 3, alist1);

        assertEquals(alist1, example.getAlist());
        assertEquals("test", example.getMyString());
        assertEquals(3, example.getSomeInt());
    }

}