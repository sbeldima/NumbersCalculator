package org.beldiman.calculations;

import org.beldiman.calculations.OperationBase;

public class Divider extends OperationBase {

    public Divider(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double doOperation() {
        return (float)firstNumber / secondNumber;
    }
}
