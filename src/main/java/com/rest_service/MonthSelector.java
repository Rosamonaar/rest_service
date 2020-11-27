package com.rest_service;

public class MonthSelector {

    public static String getMonth(String num) {
        return select(parseDigit(num));
    }

    private static String select(int num) {
        switch (num) {
            case 1 : return "Я-Н-В-А-Р-Ь";
            case 2 : return "Ф-Е-В-Р-А-Л-Ь";
            case 3 : return "М-А-Р-Т";
            case 4 : return "А-П-Р-Е-Л-Ь";
            case 5 : return "М-А-Й";
            case 6 : return "И-Ю-Н-Ь";
            case 7 : return "И-Ю-Л-Ь";
            case 8 : return "А-В-Г-У-С-Т";
            case 9 : return "С-Е-Н-Т-Я-Б-Р-Ь";
            case 10 : return "О-К-Т-Я-Б-Р-Ь";
            case 11 : return "Н-О-Я-Б-Р-Ь";
            case 12 : return "д-Е-К-А-Б-Р-Ь";
            case 13 : return "qwe";
            default: return "INCORRECT INPUT DATA";
        }
    }

    private static int parseDigit(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
