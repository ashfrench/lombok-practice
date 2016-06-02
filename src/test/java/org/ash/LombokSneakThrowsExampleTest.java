package org.ash;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LombokSneakThrowsExampleTest {
    @Test
    public void connectToUrl() {
        URL url = LombokSneakThrowsExample.connectToUrl("http://www.google.com");
        assertEquals("www.google.com", url.getHost());
    }

    @Test
    public void connectToUrlNotSneak() throws Exception {
        URL url = LombokSneakThrowsExample.connectToUrlNotSneak("http://www.google.com");
        assertEquals("www.google.com", url.getHost());
    }

    @Test
    public void connectToUrlThrows() {
        try {
            LombokSneakThrowsExample.connectToUrl("www.google.com");
            fail("Didnt throw an exception");
        } catch (Exception e) { //needs to be an Exception as Malformed isnt thrown - causes a compilation error
            assertEquals("no protocol: www.google.com", e.getMessage());
        }
    }

    @Test
    public void connectToUrlNotSneakThrows() throws Exception {
        try {
            LombokSneakThrowsExample.connectToUrlNotSneak("www.google.com");
            fail("Didnt throw an exception");
        } catch (MalformedURLException e) {
            assertEquals("no protocol: www.google.com", e.getMessage());
        }
    }

}