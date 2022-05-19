package org.beldiman.calculations;

import org.beldiman.calculations.OperationBase;

public class Multiplier extends OperationBase {

    public Multiplier(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double doOperation() {
        return firstNumber * secondNumber;
    }
}
