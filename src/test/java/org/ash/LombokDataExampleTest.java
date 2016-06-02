package org.ash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LombokDataExampleTest {

    @Test
    public void testDataToString() {
        LombokDataExample example = new LombokDataExample();
        assertEquals("LombokDataExample(myString=TEST, someInt=4, alist=[4.2, 1.23, 4.648])", example.toString());
    }

    @Test
    public void testDataEquals() {
        LombokDataExample example = new LombokDataExample();
        LombokDataExample example1 = new LombokDataExample();

        assertEquals(example, example1);
    }

    @Test
    public void testDataHashCode() {
        LombokDataExample example = new LombokDataExample();
        LombokDataExample example1 = new LombokDataExample();

        assertEquals(example.hashCode(), example1.hashCode());
    }

    @Test
    public void testIncorrectHashCodeNoData() {
        LombokGetterExample example1 = new LombokGetterExample();
        LombokGetterExample example2 = new LombokGetterExample();

        assertNotEquals(example1, example2);
        assertNotEquals(example1.hashCode(), example2.hashCode());
    }

}