import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        JFrame frame = new JFrame("Login App");
        JPanel panel = new JPanel();
        JButton btnLogin = new JButton("Login");
        JLabel label = new JLabel("Enter name:");
        JTextField textField = new JTextField(10);
        JLabel password = new JLabel("Enter Password: ");
        JPasswordField passwordField = new JPasswordField(10);


        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = textField.getText();
                String password = passwordField.getText();

                JOptionPane.showMessageDialog(frame,"Username " + name +
                        "\n" +"Password "+ password);

            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(password);
        panel.add(passwordField);
        panel.add(btnLogin);
        frame.add(panel);
        frame.setSize(250,300);
        frame.setVisible(true);


    }
}