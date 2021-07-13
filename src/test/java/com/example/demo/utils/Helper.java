package com.example.demo.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static Double money(String value) {
        Pattern pattern = Pattern.compile("[^0-9]*([0-9]*,?([0-9]+(\\.[0-9]*))?)");
        Matcher matcher = pattern.matcher(value);
        String number = matcher.group(1).replace(",", "");
        return Double.valueOf(number);
    }
}
