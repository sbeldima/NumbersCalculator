package org.beldiman.calculations;

public abstract class OperationBase {
    int firstNumber;
    int secondNumber;
    double result;

    public OperationBase(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public abstract double doOperation();

}
