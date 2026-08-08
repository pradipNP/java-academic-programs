package Practice.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JLabel firstNumberLabel, secondNumberLabel, resultLabel;
    private JTextField firstNumberField, secondNumberField, resultField;
    private JButton addButton, subButton, mulButton, resetButton;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Labels
        firstNumberLabel = new JLabel("Enter the First Number:");
        secondNumberLabel = new JLabel("Enter the Second Number:");
        resultLabel = new JLabel("Result:");

        // TextFields
        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        // Buttons
        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        resetButton = new JButton("Reset");

        // Adding Action Listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Adding components to the frame
        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(resetButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            performOperation('+');
        } else if (e.getSource() == subButton) {
            performOperation('-');
        } else if (e.getSource() == mulButton) {
            performOperation('*');
        } else if (e.getSource() == resetButton) {
            resetFields();
        }
    }

    private void performOperation(char operation) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.");
        }
    }

    private void resetFields() {
        firstNumberField.setText("");
        secondNumberField.setText("");
        resultField.setText("");
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}