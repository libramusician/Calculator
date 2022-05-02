package com;

import javax.swing.*;

public class CalculatorControl {

    public void calculate(JTextField textField) {
        String text = textField.getText();
        textField.setText(text+1);
    }
}
