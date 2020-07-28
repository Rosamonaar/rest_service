package com.rest_service;

import java.util.*;

public class ArrayHandler {

    public static void process(String[] lines) {
        sort(lines);
        addLength(lines);
    }

    private static void sort(String[] lines) {
        Arrays.sort(lines, (o1, o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() > o2.length()) {
                return 1;
            } else {
                for(int i = 0; i < o1.length(); i++) {
                    if(o1.charAt(i) < o2.charAt(i)) {
                        return -1;
                    }
                    else if (o1.charAt(i) > o2.charAt(i)) {
                        return 1;
                    }
                }
                return 0;
            }
        });
    }

    private static void addLength(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            lines[i] = String.format("(%d): %s", lines[i].length(), lines[i]);
        }
    }


}
