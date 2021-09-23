package ru.netology.square;

public class SQRService {
    public static int square(int minNum, int maxNum) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
          if (i*i > minNum && i*i < maxNum){
              count++;
          }
        }
        return count;
    }
}
