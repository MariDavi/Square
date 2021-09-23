package ru.netology.square;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCountSquare() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int minNum  = 200;
        int maxNum = 1000;
        int expected = 17;

        // вызываем целевой метод:
        int actual = SQRService.square(minNum,maxNum);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}