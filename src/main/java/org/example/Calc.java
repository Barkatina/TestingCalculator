package org.example;

public class Calc  {
    public int summ(int a, int b){
        int result;
        result = a+b;
        System.out.println("Сумма " + a + " и " + b + " равно " + result);
        return result;
    }
    public int difference (int a, int b){
        int result;
        result = a-b;
        System.out.println("Разность " + a + " и " + b + " равно " + result);
        return result;
    }
}
