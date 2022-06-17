package com.example.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus( Integer num1, Integer num2) {
        Integer sum = num1 + num2;
          return num1 + " + " + num2  + " = " +  sum;
    }

    public String minus(Integer num1, Integer num2) {
        Integer sum = num1 - num2;
        return num1 + " - " + num2  + " = " +  sum;
    }

    public String multiply(Integer num1, Integer num2) {
        Integer sum = num1 * num2;
        return num1 + " * " + num2  + " = " +  sum;
    }

    public String divide(Integer num1, Integer num2) {
        Integer sum = num1 / num2;
        if (num1 == 0 || num2 == 0){
            throw new ArithmeticException();
        }
        return num1 + " / " + num2  + " = " +  sum;
    }
}
