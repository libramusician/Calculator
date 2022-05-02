package com;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 750;
    private CalculatorControl controller;

    public CalculatorView(CalculatorControl controller){
        super("Calculator");
        this.controller = controller;
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon backGroundImg = new ImageIcon(this.getClass().getClassLoader().getResource("backGround.jpg"));
        backGroundImg.setImage(backGroundImg.getImage().getScaledInstance(WIDTH,HEIGHT,Image.SCALE_DEFAULT));
        JLabel backGround = new JLabel(backGroundImg);
        backGround.setLayout(null);
        setContentPane(backGround);


        JTextField textField = new JTextField();
        textField.setSize(400,50);
        textField.setLocation(WIDTH/2-200,50);
        backGround.add(textField);

        JButton button = new JButton("caculate");
        button.setSize(100,50);
        button.setLocation(WIDTH/2-50,150);
        backGround.add(button);
        button.addActionListener(e-> controller.calculate(textField));

        setResizable(false);
        setVisible(true);
    }
}
