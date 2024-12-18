package com.kpilabs;

import java.util.Arrays;
import java.util.Comparator;

public class TextSorter {

    public String[] sortWordsByLetterCount(String text, char letter) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Текст не може бути порожнім.");
        }

        String[] words = text.trim().split("\\s+");
        if (words.length == 0) {
            throw new IllegalArgumentException("Текст не містить слів для сортування.");
        }

        Arrays.sort(words, Comparator.comparingInt(word -> countLetter(word, letter)));
        return words;
    }

    public int countLetter(String word, char letter) {
        int count = 0;
        char target = Character.toLowerCase(letter);
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
