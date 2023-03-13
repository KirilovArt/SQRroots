package ru.netology.javaqa.squareroots.services;

public class SqrService {
    public int calcSqr(int lowervalue, int uppervalue) {
        int result = 0;
        for (int i = 10; i <= 999; i++) {
            if ((i * i >= lowervalue) & (i * i <= uppervalue)) {
                result = result + 1;
            }
        }
        return result;
    }
}
