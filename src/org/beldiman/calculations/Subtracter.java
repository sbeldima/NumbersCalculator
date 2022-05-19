package org.beldiman.calculations;

import org.beldiman.calculations.OperationBase;

public class Subtracter extends OperationBase {
    public Subtracter(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double doOperation() {
        return result = firstNumber - secondNumber;
    }
}
