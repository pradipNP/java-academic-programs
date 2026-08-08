package Practice.OwnPractice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculate implements ActionListener {
    JFrame f1;
    JPanel p1;
    TextField t1,t2,res;
    JLabel l1,l2,l3;
    JButton add,sub,mul,div,reset;

    public calculate(){
        f1 = new JFrame("Calculator");
        f1.setVisible(true);
        f1.setSize(300,00);

        p1 = new JPanel();
        f1.getContentPane().add(p1);

        l1 = new JLabel("Operand 1");
        l2 = new JLabel("Operand 2");
        l3 = new JLabel("Result ");

        t1 = new TextField(10);
        t2 = new TextField(10);
        res = new TextField(10);

        add = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Mul");
        div = new JButton("Div");
        reset = new JButton("Reset");

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
            
        }
    }
}

public class Calculator {
    public static void main(String[] args){
        calculate obj = new calculate();
    }
}

