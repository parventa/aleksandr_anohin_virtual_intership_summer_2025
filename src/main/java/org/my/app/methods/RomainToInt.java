package org.my.app.methods;

import java.util.HashMap;
import java.util.Map;

public class RomainToInt {

    public int romainToInt(String s) {

        int result = 0;

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {

            int current = romanMap.get(s.charAt(i));
            int nextNumber = (i + 1 < s.length())
                    ? romanMap.get(s.charAt(i + 1))
                    : 0;

            if (current < nextNumber) {
                result = result - current;
            } else {
                result = result + current;
            }

        }
        return result;
    }

}
