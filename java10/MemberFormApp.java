import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MemberFormApp extends JFrame {
    private FormPanel formPanel;

    public MemberFormApp() {
        setTitle("Member Form");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formPanel = new FormPanel();
        add(formPanel, BorderLayout.CENTER);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveButtonListener());
        add(saveButton, BorderLayout.SOUTH);
    }

    private class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Member member = formPanel.getMember();
            saveMember(member);
            JOptionPane.showMessageDialog(MemberFormApp.this, "Member information saved successfully.");
            clearFields();
        }

        private void saveMember(Member member) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("members.txt", true))) {
                writer.println(member.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        private void clearFields() {
            formPanel.getMember().getFullName();
            formPanel.getMember().getPhoneNumber();
            formPanel.getMember().getEmail();
            formPanel.getMember().getGender();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MemberFormApp app = new MemberFormApp();
            app.setVisible(true);
        });
    }
}
