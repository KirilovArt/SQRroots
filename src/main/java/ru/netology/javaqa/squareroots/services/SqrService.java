package ru.netology.javaqa.squareroots.services;

public class SqrService {
    public int calcSqr(int x, int y) {
            int result = 0;
            for (int i = 10; i <= 999; i++) {
                if ((i * i >= x) & (i * i <= y)) {
                    result = result +1;
                    // Рассширил значения для тестов.
                }
            }
            return result;
    }
}
