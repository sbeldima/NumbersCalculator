package org.beldiman.calculator;

import org.beldiman.calculations.Adder;
import org.beldiman.calculations.Divider;
import org.beldiman.calculations.Multiplier;
import org.beldiman.calculations.Subtracter;

public class CalculatorOperator implements OperatorInt{

    public double calculate (int firstNumber, int secondNumber, char operation) {
        double result;
        switch (operation) {
            case '+':
                return new Adder(firstNumber, secondNumber).doOperation();
            case '-':
                return new Subtracter(firstNumber, secondNumber).doOperation();
            case '*':
                return new Multiplier(firstNumber, secondNumber).doOperation();
            case '/':
                if (secondNumber == 0) {
                    throw new ArithmeticException("Cannot divide by 0!");
                }
                return new Divider(firstNumber, secondNumber).doOperation();
        }
        return 0;
    }
}
