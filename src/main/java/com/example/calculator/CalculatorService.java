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
        if (num1 == null){
          return "Ошибка, введите первое число";
        } else if (num2 == null) {
            return "ошибка, введите второе число";
        }
        return num1 + " + " + num2  + " = " +  sum;
    }

    public String minus(Integer num1, Integer num2) {
        Integer sum = num1 - num2;
        if (num1 == null){
            return "Ошибка, введите первое число";
        } else if (num2 == null) {
            return "ошибка, введите второе число";
        }
        return num1 + " - " + num2  + " = " +  sum;
    }

    public String multiply(Integer num1, Integer num2) {
        Integer sum = num1 * num2;
        if (num1 == null){
            return "Ошибка, введите первое число";
        } else if (num2 == null) {
            return "ошибка, введите второе число";
        }
        return num1 + " * " + num2  + " = " +  sum;
    }

    public String divide(Integer num1, Integer num2) {
        Integer sum = num1 / num2;
        if (num1 == null){
            return "Ошибка, введите первое число";
        } else if (num2 == null) {
            return "ошибка, введите второе число";
        }else if (num1 == 0){
            return "Ошибка, нет деления на ноль";
        }
        return num1 + " / " + num2  + " = " +  sum;
    }
}
