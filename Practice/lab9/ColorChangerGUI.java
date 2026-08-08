package Practice.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangerGUI extends JFrame implements ActionListener {
    private JComboBox<String> colorListBox;
    private JButton changeColorButton;
    private JPanel colorPanel;

    public ColorChangerGUI() {
        setTitle("Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Color names for the list box
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        // List Box
        colorListBox = new JComboBox<>(colors);

        // Button
        changeColorButton = new JButton("Change Color");

        // Panel for displaying color
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE); // Default color

        // Adding action listener to the button
        changeColorButton.addActionListener(this);

        // Adding components to the frame
        add(colorListBox, BorderLayout.NORTH);
        add(changeColorButton, BorderLayout.CENTER);
        add(colorPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeColorButton) {
            String selectedColor = (String) colorListBox.getSelectedItem();
            Color color;

            // Set color based on the selected item
            switch (selectedColor) {
                case "Red":
                    color = Color.RED;
                    break;
                case "Green":
                    color = Color.GREEN;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Yellow":
                    color = Color.YELLOW;
                    break;
                default:
                    color = Color.WHITE;
            }

            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        new ColorChangerGUI();
    }
}