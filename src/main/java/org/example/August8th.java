package org.example;

import java.util.*;

public class August8th {
    public static int minimumPushes(String word) {
        HashMap<Character, Integer> distinctCharacterCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            int currCount = distinctCharacterCount.getOrDefault(c, 0);
            distinctCharacterCount.put(c, currCount + 1);
        }
        ArrayList<Map.Entry<Character, Integer>> arrayOfElements = new ArrayList<>(distinctCharacterCount.entrySet());
        arrayOfElements.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        int minimumPushes = 0;
        int pushButton = 2;
        int pushCount = 1;
        for (Map.Entry<Character, Integer> entry : arrayOfElements) {
            minimumPushes += entry.getValue() * pushCount;
            pushButton++;
            if (pushButton == 10) {
                pushButton = 2;
                pushCount++;
            }
        }
        return minimumPushes;
    }
}
