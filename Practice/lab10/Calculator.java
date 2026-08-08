package Practice.lab10;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    TextField numField;
    Button squareBtn, cubeBtn, factBtn, palindromeBtn, reverseBtn;

    public Calculator() {
        super("Calculator");

        numField = new TextField(20);
        squareBtn = new Button("Square");
        cubeBtn = new Button("Cube");
        factBtn = new Button("Factorial");
        palindromeBtn = new Button("Palindrome");
        reverseBtn = new Button("Reverse");

        setLayout(new FlowLayout());

        add(numField);
        add(squareBtn);
        add(cubeBtn);
        add(factBtn);
        add(palindromeBtn);
        add(reverseBtn);

        squareBtn.addActionListener(this);
        cubeBtn.addActionListener(this);
        factBtn.addActionListener(this);
        palindromeBtn.addActionListener(this);
        reverseBtn.addActionListener(this);

        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String number = numField.getText();

        if (number.isEmpty()) {
            numField.setText("Enter a number");
            return;
        }

        double num;
        try {
            num = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            numField.setText("Invalid number");
            return;
        }

        String result = "";
        if (ae.getSource() == squareBtn) {
            result = String.valueOf(num * num);
        } else if (ae.getSource() == cubeBtn) {
            result = String.valueOf(num * num * num);
        } else if (ae.getSource() == factBtn) {
            if (num < 0) {
                result = "Factorial is not defined for negative numbers";
            } else {
                result = String.valueOf(calculateFactorial(num));
            }
        } else if (ae.getSource() == palindromeBtn) {
            result = String.valueOf(isPalindrome(number));
        } else if (ae.getSource() == reverseBtn) {
            result = reverseString(number);
        }

        numField.setText(result);
    }

    public static int calculateFactorial(double num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPalindrome(String number) {
        StringBuilder sb = new StringBuilder(number);
        return sb.toString().equals(sb.reverse().toString());
    }

    public static String reverseString(String number) {
        StringBuilder sb = new StringBuilder(number);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
