package com.cosmos.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        String s = "abcaba";
        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqs.merge(c,                  // key = char
                    1,                  // value to merge
                    Integer::sum);      // counting
        }

    }
}
