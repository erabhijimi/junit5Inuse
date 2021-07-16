package interview.tcsprep;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {
    public static void main(String[] args) {
        String s = "abcaba";
        Map<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqs.merge(c,                  // key = char
                    1,                  // value to merge
                    Integer::sum);      // counting
        }
        System.out.println("Frequencies:\n" + freqs);
    }
}
