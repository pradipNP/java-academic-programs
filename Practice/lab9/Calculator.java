package Practice.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculate implements ActionListener{
    JButton add,sub,mul,div,reset;
    JFrame f1;
    JPanel p1;
    TextField t1,t2,res;
    JLabel l1,l2,l3;
    public calculate(){
        f1 = new JFrame("Calculator");
        f1.setVisible(true);
        f1.setSize(300,300);

        p1 = new JPanel();
        f1.getContentPane().add(p1);

        l1 = new JLabel("Operand 1: ");
        l2 = new JLabel("Operand 2: ");
        l3 = new JLabel("Result: ");
 
        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        reset = new JButton("Reset");
 
        t1 = new TextField(10);
        t2 = new TextField(10);
        res = new TextField(10);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(res);
        p1.add(add);
        p1.add(sub);
        p1.add(mul);
        p1.add(div);
        p1.add(reset);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        reset.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev){
        Object src = ev.getSource();
        double op1 = Double.parseDouble(t1.getText());
        double op2 = Double.parseDouble(t2.getText());
        double result;
        if(src == add){
            result = op1 + op2;
            res.setText(Double.toString(result));
        }
        else if(src == sub){
            result = op1 - op2;
            res.setText(Double.toString(result));
        }
        else if(src == mul){
            result = op1 * op2;
            res.setText(Double.toString(result));
        }
        else if(src == div){
            result = op1 / op2;
            res.setText(Double.toString(result));
        }
        else if(src == reset){
            res.setText("");
            t1.setText("");
            t2.setText("");
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        calculate obj = new calculate();
    }
}