package org.ash;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LombokGetterOverrideExampleTest {

    @Test
    public void testGetterOverride() {
        LombokGetterOverrideExample example = new LombokGetterOverrideExample();
        assertEquals(Lists.newArrayList(4.2, 1.23, 4.648), example.getAlist());
        assertEquals("TEST", example.getMyString());

        assertNotEquals(4, example.getSomeInt());
        assertEquals(20, example.getSomeInt());
    }
}