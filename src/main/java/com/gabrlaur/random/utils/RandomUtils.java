package com.gabrlaur.random.utils;

import com.gabrlaur.random.enums.Email;

import java.util.Random;

public class RandomUtils {
    Random random;

    public RandomUtils() {
        this.random = new Random();
    }

    public int getRandomNumber(int maxValue) {
        return random.nextInt(maxValue);
    }

    public String getRandomEmail(String name, int maxValue) {
        return name + random.nextInt(9999) + Email.getEmailValue(Email.values()[getRandomNumber(maxValue)]);
    }
}
