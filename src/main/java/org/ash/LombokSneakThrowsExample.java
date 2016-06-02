package org.ash;

import lombok.SneakyThrows;

import java.net.MalformedURLException;
import java.net.URL;

public class LombokSneakThrowsExample {

    @SneakyThrows
    public static URL connectToUrl(String urlString) {
        return new URL(urlString);
    }

    public static URL connectToUrlNotSneak(String urlString) throws MalformedURLException {
        return new URL(urlString);
    }
}
