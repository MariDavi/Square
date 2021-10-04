package ru.netology.square;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCountSquare() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int minNum = 200;
        int maxNum = 1000;
        int expected = 17;

        // вызываем целевой метод:
        int actual = SQRService.square(minNum, maxNum);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSquare() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int minNum = 100;
        int maxNum = 200;
        int expected = 5;

        // вызываем целевой метод:
        int actual = SQRService.square(minNum, maxNum);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSquareNumbers() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int minNum = 10;
        int maxNum = 2500;
        int expected = 41;

        // вызываем целевой метод:
        int actual = SQRService.square(minNum, maxNum);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}

