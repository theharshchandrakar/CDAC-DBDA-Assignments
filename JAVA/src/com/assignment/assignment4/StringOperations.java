package com.assignment.assignment4;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class StringOperations {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static Map<String, Integer> countCharacterTypes(String str) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercaseCount++;
            } else {
                specialCharCount++;
            }
        }

        Map<String, Integer> counts = new HashMap<>();
        counts.put("uppercase", uppercaseCount);
        counts.put("lowercase", lowercaseCount);
        counts.put("special", specialCharCount);
        return counts;
    }

    public static boolean isUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                return false;
            }
        }
        return true;
    }

    public static String shiftLeft(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char[] chars = new char[str.length()];
        char firstChar = str.charAt(0);

        for (int i = 0; i < str.length() - 1; i++) {
            chars[i] = str.charAt(i + 1);
        }

        chars[str.length() - 1] = firstChar;

        return new String(chars);
    }

    public static boolean myEquals(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
       return true;
    }

    public static boolean myEqualsIgnoreCase(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                if (ch1 >= 'A' && ch1 <= 'Z') {
                    ch1 = (char) (ch1 + 32);
                }
                if (ch2 >= 'A' && ch2 <= 'Z') {
                    ch2 = (char) (ch2 + 32);
                }
                
                if (ch1 != ch2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("a. Anagram Check:");
        System.out.println("Are 'listen' and 'silent' anagrams? " + areAnagrams("listen", "silent"));
        System.out.println("Are 'hello' and 'world' anagrams? " + areAnagrams("hello", "world"));
        System.out.println("\n");

        System.out.println("b. Count Character Types in 'Hello World! 123':");
        Map<String, Integer> counts = countCharacterTypes("Hello World! 123");
        System.out.println("   - Uppercase: " + counts.get("uppercase"));
        System.out.println("   - Lowercase: " + counts.get("lowercase"));
        System.out.println("   - Special/Digits: " + counts.get("special"));
        System.out.println("\n");

        System.out.println("c. Is Upper Case Check:");
        System.out.println("Is 'HELLO' uppercase? " + isUpperCase("HELLO"));
        System.out.println("Is 'Hello' uppercase? " + isUpperCase("Hello"));
        System.out.println("Is 'HELLO WORLD' uppercase? " + isUpperCase("HELLO WORLD"));
        System.out.println("\n");

        System.out.println("d. Shift Characters Left:");
        System.out.println("Shifting 'abcde' left: " + shiftLeft("abcde"));
        System.out.println("Shifting 'Java' left: " + shiftLeft("Java"));
        System.out.println("\n");

        System.out.println("e. Custom Equals Methods:");
        System.out.println("myEquals('Java', 'Java'): " + myEquals("Java", "Java"));
        System.out.println("myEquals('Java', 'Python'): " + myEquals("Java", "Python"));
        System.out.println("myEqualsIgnoreCase('JAVA', 'java'): " + myEqualsIgnoreCase("JAVA", "java"));
        System.out.println("myEqualsIgnoreCase('Hello', 'Jello'): " + myEqualsIgnoreCase("Hello", "Jello"));
    }
}

