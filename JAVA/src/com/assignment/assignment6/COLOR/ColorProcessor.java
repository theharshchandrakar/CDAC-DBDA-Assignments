package com.assignment.assignment6.COLOR;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColorProcessor {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList(
            "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"
        );
        
        System.out.println("Original List: " + colors);
        System.out.println("----------------------------------------");

        List<String> uppercaseColors = colors.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Uppercase List: " + uppercaseColors);

        List<String> lowercaseColors = colors.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());
        System.out.println("Lowercase List: " + lowercaseColors);
        System.out.println("----------------------------------------");


       List<String> colorsBeforeM = colors.stream()
            .filter(color -> color.toLowerCase().charAt(0) < 'm')
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Colors starting before 'm' (sorted): " + colorsBeforeM);
        System.out.println("----------------------------------------");
        
        List<String> shortColors = colors.stream()
            .filter(color -> color.length() <= 5)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Colors with 5 or fewer letters (sorted): " + shortColors);
        System.out.println("----------------------------------------");
    }
}
