package calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(null);
        setVisible(true);
        setName("Calculator");
        setTitle("Calculator");

        JTextField equationTextField = new JTextField("EquationTextField");
        equationTextField.setName("EquationTextField");
        equationTextField.setBounds(50, 10, 200, 30);
        equationTextField.setText("");
        equationTextField.setVisible(true);
        add(equationTextField);

        JButton button7 = new JButton("7");
        button7.setName("7");
        button7.setBounds(20, 70, 45, 45);
        button7.setBackground(Color.lightGray);
        button7.setVisible(true);
        add(button7);

        JButton button4 = new JButton("4");
        button4.setName("4");
        button4.setBounds(20, 130, 45, 45);
        button4.setBackground(Color.lightGray);
        button4.setVisible(true);
        add(button4);

        JButton button1 = new JButton("1");
        button1.setName("1");
        button1.setBounds(20, 190, 45, 45);
        button1.setBackground(Color.lightGray);
        button1.setVisible(true);
        add(button1);

        JButton button8 = new JButton("8");
        button8.setName("8");
        button8.setBounds(80, 70, 45, 45);
        button8.setBackground(Color.lightGray);
        button8.setVisible(true);
        add(button8);

        JButton button5 = new JButton("5");
        button5.setName("5");
        button5.setBounds(80, 130, 45, 45);
        button5.setBackground(Color.lightGray);
        button5.setVisible(true);
        add(button5);

        JButton button2 = new JButton("2");
        button2.setName("2");
        button2.setBounds(80, 190, 45, 45);
        button2.setBackground(Color.lightGray);
        button2.setVisible(true);
        add(button2);

        JButton button0 = new JButton("0");
        button0.setName("0");
        button0.setBounds(80, 250, 45, 45);
        button0.setBackground(Color.lightGray);
        button0.setVisible(true);
        add(button0);


        JButton solve = new JButton("Solve");
        solve.setName("Solve");
        solve.setBounds(70, 320, 100, 50);
        solve.setBackground(Color.lightGray);
        solve.setVisible(true);
        add(solve);

        solve.addActionListener(actionEvent -> {
            equationTextField.getText();
            equationTextField.setText(Calculator.getResult(equationTextField.getText()));
        });

    }

    private static String getResult(String text) {
        String[] splitText = text.split("\\+");
        return text + " = " + (Integer.parseInt(splitText[0]) + Integer.parseInt(splitText[1]));
    }
}
