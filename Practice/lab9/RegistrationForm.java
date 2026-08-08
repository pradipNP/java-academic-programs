package Practice.lab9;


import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {
    private JLabel nameLabel, emailLabel, addressLabel, genderLabel, countryLabel, hobbiesLabel, imageLabel;
    private JTextField nameField, emailField;
    private JTextArea addressArea;
    private JCheckBox tennisCheckBox, footballCheckBox, basketballCheckBox;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;
    private JComboBox<String> countryComboBox;
    private JList<String> hobbiesList;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Labels
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        addressLabel = new JLabel("Address:");
        genderLabel = new JLabel("Gender:");
        countryLabel = new JLabel("Country:");
        hobbiesLabel = new JLabel("Hobbies:");
        imageLabel = new JLabel(new ImageIcon("profile.png")); // Replace "profile.png" with your image file

        // TextFields and TextArea
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        addressArea = new JTextArea(5, 20);

        // CheckBoxes
        tennisCheckBox = new JCheckBox("Tennis");
        footballCheckBox = new JCheckBox("Football");
        basketballCheckBox = new JCheckBox("Basketball");

        // RadioButtons
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // ComboBox
        String[] countries = {"USA", "Canada", "UK", "Australia"};
        countryComboBox = new JComboBox<>(countries);

        // List
        String[] hobbies = {"Reading", "Traveling", "Gaming", "Cooking"};
        hobbiesList = new JList<>(hobbies);
        hobbiesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Button
        registerButton = new JButton("Register");

        // Adding components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(new JScrollPane(addressArea));
        add(genderLabel);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(countryLabel);
        add(countryComboBox);
        add(hobbiesLabel);
        add(new JScrollPane(hobbiesList));
        add(registerButton);
        add(imageLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}