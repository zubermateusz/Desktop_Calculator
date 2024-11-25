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
        button7.setName("Seven");
        button7.setBounds(20, 70, 45, 45);
        button7.setBackground(Color.lightGray);
        button7.setVisible(true);
        add(button7);

        JButton button4 = new JButton("4");
        button4.setName("Four");
        button4.setBounds(20, 130, 45, 45);
        button4.setBackground(Color.lightGray);
        button4.setVisible(true);
        add(button4);

        JButton button1 = new JButton("1");
        button1.setName("One");
        button1.setBounds(20, 190, 45, 45);
        button1.setBackground(Color.lightGray);
        button1.setVisible(true);
        add(button1);

        JButton button8 = new JButton("8");
        button8.setName("Eight");
        button8.setBounds(80, 70, 45, 45);
        button8.setBackground(Color.lightGray);
        button8.setVisible(true);
        add(button8);

        JButton button5 = new JButton("5");
        button5.setName("Five");
        button5.setBounds(80, 130, 45, 45);
        button5.setBackground(Color.lightGray);
        button5.setVisible(true);
        add(button5);

        JButton button2 = new JButton("2");
        button2.setName("Two");
        button2.setBounds(80, 190, 45, 45);
        button2.setBackground(Color.lightGray);
        button2.setVisible(true);
        add(button2);

        JButton button0 = new JButton("0");
        button0.setName("Zero");
        button0.setBounds(80, 250, 45, 45);
        button0.setBackground(Color.lightGray);
        button0.setVisible(true);
        add(button0);

        JButton button9 = new JButton("9");
        button9.setName("Nine");
        button9.setBounds(140, 70, 45, 45);
        button9.setBackground(Color.lightGray);
        button9.setVisible(true);
        add(button9);

        JButton button6 = new JButton("6");
        button6.setName("Six");
        button6.setBounds(140, 130, 45, 45);
        button6.setBackground(Color.lightGray);
        button6.setVisible(true);
        add(button6);

        JButton button3 = new JButton("3");
        button3.setName("Three");
        button3.setBounds(140, 190, 45, 45);
        button3.setBackground(Color.lightGray);
        button3.setVisible(true);
        add(button3);

        JButton buttonSolve = new JButton("=");
        buttonSolve.setName("Equals");
        buttonSolve.setBounds(140, 250, 45, 45);
        buttonSolve.setBackground(Color.lightGray);
        buttonSolve.setVisible(true);
        add(buttonSolve);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setName("Divide");
        buttonDivide.setBounds(200, 70, 45, 45);
        buttonDivide.setBackground(Color.lightGray);
        buttonDivide.setVisible(true);
        add(buttonDivide);

        JButton buttonMultiply = new JButton("x");
        buttonMultiply.setName("Multiply");
        buttonMultiply.setBounds(200, 130, 45, 45);
        buttonMultiply.setBackground(Color.lightGray);
        buttonMultiply.setVisible(true);
        add(buttonMultiply);

        JButton buttonAdd = new JButton("+");
        buttonAdd.setName("Add");
        buttonAdd.setBounds(200, 190, 45, 45);
        buttonAdd.setBackground(Color.lightGray);
        buttonAdd.setVisible(true);
        add(buttonAdd);

        JButton buttonSubtract = new JButton("-");
        buttonSubtract.setName("Subtract");
        buttonSubtract.setBounds(200, 250, 45, 45);
        buttonSubtract.setBackground(Color.lightGray);
        buttonSubtract.setVisible(true);
        add(buttonSubtract);

        buttonSolve.addActionListener(actionEvent -> {
            equationTextField.getText();
            equationTextField.setText(Calculator.getResult(equationTextField.getText()));
        });

        button0.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "0");
        });
        button1.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "1");
        });
        button2.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "2");
        });
        button3.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "3");
        });
        button4.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "4");
        });
        button5.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "5");
        });
        button6.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "6");
        });
        button7.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "7");
        });
        button8.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "8");
        });
        button9.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "9");
        });
        buttonDivide.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "/");
        });
        buttonMultiply.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "x");
        });
        buttonAdd.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "+");
        });
        buttonSubtract.addActionListener(actionEvent -> {
            equationTextField.setText(equationTextField.getText() + "-");
        });


    }

    private static String getResult(String text) {
        String[] splitText = text.split("\\+|\\-|\\*regex |\\/");
        double result = 0;
        if (text.contains("-")) {
            result = (Integer.parseInt(splitText[0]) - Integer.parseInt(splitText[1]));
        }
        if (text.contains("+")) {
            result = (Integer.parseInt(splitText[0]) + Integer.parseInt(splitText[1]));
        }
        if (text.contains("x")) {
            result = (Integer.parseInt(splitText[0]) * Integer.parseInt(splitText[1]));
        }
        if (text.contains("/")) {
            result = ((double) Integer.parseInt(splitText[0]) / Integer.parseInt(splitText[1]));
        }
        return text + " = " + result;
    }
}
