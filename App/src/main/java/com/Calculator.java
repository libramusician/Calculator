package com;

public class Calculator {

    public Calculator() {

        CalculatorControl controller = new CalculatorControl();
        CalculatorView view = new CalculatorView(controller);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
