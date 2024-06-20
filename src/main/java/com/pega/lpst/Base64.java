package com.pega.lpst;

import java.util.Map;

/**
 * Simple passthrough to java base64 decode and encode methods
 */
public class Base64 {
    /**
     * Decode a base64 string to text
     * @param inputMap Expected to contain a key of "text" and a value of the base64 string to decode
     * @return Object The decoded String object
     */
    public static Object decode(Map<Object,Object> inputMap) {
        if (inputMap == null) throw new IllegalArgumentException("inputMap cannot be null");
        String inputText = (String)inputMap.get("text");
        if (inputText == null) throw new IllegalArgumentException("inputMap must contain key of \"text\"");
        return new String(java.util.Base64.getDecoder().decode(inputText));
    }

    /**
     * Encode a string to base64
     * @param inputMap Expected to contain a key of "text" and a value of the string to encode
     * @return Object The encoded String object
     */
    public static Object encode(Map<Object,Object> inputMap) {
        if (inputMap == null) throw new IllegalArgumentException("inputMap cannot be null");
        String inputText = (String)inputMap.get("text");
        if (inputText == null) throw new IllegalArgumentException("inputMap must contain key of \"text\"");
        return java.util.Base64.getEncoder().encodeToString(inputText.getBytes());
    }
}