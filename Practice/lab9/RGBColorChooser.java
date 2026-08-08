package Practice.lab9;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RGBColorChooser extends JFrame implements ActionListener {
    private JLabel redLabel, greenLabel, blueLabel;
    private JComboBox<String> redComboBox, greenComboBox, blueComboBox;
    private JButton showOutputButton;
    private JPanel colorPanel;

    public RGBColorChooser() {
        setTitle("RGB Color Chooser");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Labels
        redLabel = new JLabel("Red:");
        greenLabel = new JLabel("Green:");
        blueLabel = new JLabel("Blue:");

        // Combo Boxes
        redComboBox = new JComboBox<>(getComboBoxValues());
        greenComboBox = new JComboBox<>(getComboBoxValues());
        blueComboBox = new JComboBox<>(getComboBoxValues());

        // Button
        showOutputButton = new JButton("Show Output");

        // Panel for displaying color
        colorPanel = new JPanel();

        // Adding action listener to the button
        showOutputButton.addActionListener(this);

        // Adding components to the frame
        add(redLabel);
        add(redComboBox);
        add(greenLabel);
        add(greenComboBox);
        add(blueLabel);
        add(blueComboBox);
        add(showOutputButton);
        add(colorPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showOutputButton) {
            int redValue = Integer.parseInt((String) redComboBox.getSelectedItem());
            int greenValue = Integer.parseInt((String) greenComboBox.getSelectedItem());
            int blueValue = Integer.parseInt((String) blueComboBox.getSelectedItem());

            // Set panel background color based on RGB values
            Color color = new Color(redValue, greenValue, blueValue);
            colorPanel.setBackground(color);
        }
    }

    // Helper method to get values from 0 to 255 for combo boxes
    private String[] getComboBoxValues() {
        String[] values = new String[256];
        for (int i = 0; i < 256; i++) {
            values[i] = String.valueOf(i);
        }
        return values;
    }

    public static void main(String[] args) {
        new RGBColorChooser();
    }
}