package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

/**
 * A class providing extra functions for strings
 */
@Service
public class StringService {
    /**
     * Converts a string to uppercase letters
     * @param string the string that is to be converted
     * @return string in uppercase letters
     * @throws IllegalArgumentException if string is null
     */
    public String toUpperCase(final String string) throws IllegalAccessException {
        if (string == null)
            throw new IllegalAccessException("String cannot be null");

        return string.toUpperCase();
    }
}
