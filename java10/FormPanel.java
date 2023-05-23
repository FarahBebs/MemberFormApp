import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    private JTextField fullNameField;
    private JTextField phoneNumberField;
    private JTextField emailField;
    private JComboBox<String> genderComboBox;

    public FormPanel() {
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Full Name:"));
        fullNameField = new JTextField();
        add(fullNameField);

        add(new JLabel("Phone Number:"));
        phoneNumberField = new JTextField();
        add(phoneNumberField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Gender:"));
        genderComboBox = new JComboBox<>(new String[]{"Men", "Women", "Other"});
        add(genderComboBox);
    }

    public Member getMember() {
        String fullName = fullNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();
        String gender = (String) genderComboBox.getSelectedItem();

        return new Member(fullName, phoneNumber, email, gender);
    }
}
