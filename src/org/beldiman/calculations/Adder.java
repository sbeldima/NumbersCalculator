package org.beldiman.calculations;

import org.beldiman.calculations.OperationBase;

public class Adder extends OperationBase {
    public Adder(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    public double doOperation() {
       return result = firstNumber + secondNumber;
    }
}
