package org.ash;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LombokNonNullExampleTest {

    @Test
    public void testNonNull() {
        try {
            new LombokNonNullExample(null, 1, new ArrayList<>());
            fail();
        } catch (NullPointerException e) {
            assertEquals("myString", e.getMessage());
        }
    }

}