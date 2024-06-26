package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        won = 1_000_000;
        dollar = CConverter.toDoller(won);
        System.out.printf("백만원은 %f달러입니다.%n", dollar);
        
        //100달러를 원으로 출력하기
        dollar = 100;
        won = CConverter.toKWR(dollar);
        System.out.printf("백달러는 %.1f원입니다.%n", won);
    }
}
