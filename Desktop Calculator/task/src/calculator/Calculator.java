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
        equationTextField.setBounds(50, 50, 200, 30);
        equationTextField.setText("");
        equationTextField.setVisible(true);
        add(equationTextField);

        JButton button7 = new JButton("7");
        button7.setName("7");
        button7.setBounds(50, 100, 50, 50);
        button7.setBackground(Color.lightGray);
        button7.setVisible(true);
        add(button7);

        JButton solve = new JButton("Solve");
        solve.setName("Solve");
        solve.setBounds(70, 150, 100, 50);
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
