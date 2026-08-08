package Practice.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringOperationsGUI extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton reverseButton, uppercaseButton, lowercaseButton, clearButton;

    public StringOperationsGUI() {
        setTitle("String Operations");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Text Fields
        inputField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        // Buttons
        reverseButton = new JButton("Reverse");
        uppercaseButton = new JButton("Uppercase");
        lowercaseButton = new JButton("Lowercase");
        clearButton = new JButton("Clear");

        // Adding Action Listeners
        reverseButton.addActionListener(this);
        uppercaseButton.addActionListener(this);
        lowercaseButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Adding components to the frame
        add(new JLabel("Input:"));
        add(inputField);
        add(new JLabel("Result:"));
        add(resultField);
        add(reverseButton);
        add(uppercaseButton);
        add(lowercaseButton);
        add(clearButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        String result = "";
        if (e.getSource() == reverseButton) {
            result = reverseString(input);
        } else if (e.getSource() == uppercaseButton) {
            result = input.toUpperCase();
        } else if (e.getSource() == lowercaseButton) {
            result = input.toLowerCase();
        } else if (e.getSource() == clearButton) {
            inputField.setText("");
            resultField.setText("");
            return;
        }
        resultField.setText(result);
    }

    private String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        new StringOperationsGUI();
    }
}