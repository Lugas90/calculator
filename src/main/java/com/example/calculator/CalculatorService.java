package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus( int num1, int num2) {
        int sum = num1 + num2;
          return num1 + " + " + num2  + " = " +  sum;
    }

    public String minus(int num1, int num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2  + " = " +  sum;
    }

    public String multiply(int num1, int num2) {
        int sum = num1 * num2;
        return num1 + " * " + num2  + " = " +  sum;
    }

    public String divide(int num1, int num2) {
        int sum = num1 / num2;
        if (num1 == 0){
            throw new ArithmeticException(" нет деления на 0 ");
        }
        return num1 + " / " + num2  + " = " +  sum;

    }
}
