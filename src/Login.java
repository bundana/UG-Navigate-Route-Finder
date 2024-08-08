import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.AuthUtils;

/*
    |--------------------------------------------------------------------------
    | Login Class
    |--------------------------------------------------------------------------
    |
    | The Login class provides a graphical user interface (GUI) for users to log in
    | to the UG Navigate application. It includes fields for entering a student ID and
    | password, and a button to submit the login credentials. On successful login,
    | it transitions to the RouteFinder interface.
    |
    | Constructor:
    | - Login():
    |   Initializes the login window with fields for student ID and password, and a
    |   login button. Customizes the appearance of components and sets up the layout.
    |
    | Components:
    | - `studentIdField`: Text field for entering the student ID.
    | - `passwordField`: Password field for entering the password.
    | - `loginButton`: Button to submit the login form.
    | - `panel`: Main panel holding the login components.
    |
    | Methods:
    | - `resizeIcon(ImageIcon icon, int width, int height)`:
    |   Resizes the provided icon to the specified width and height.
    |
    | Features:
    | - Displays a login form with icons for user ID and password fields.
    | - Shows tooltips for guidance on what to enter in each field.
    | - Changes button color and text to enhance usability.
    | - Validates login credentials using `AuthUtils.authenticate`.
    | - Provides feedback with a message dialog on successful or failed login attempts.
    | - On successful login, it opens the RouteFinder window and closes the login window.
    | Todo: Add login with student email
    */

public class Login extends JFrame {
    private JTextField studentIdField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel panel;

    public Login() {
        setTitle("UG Navigate - Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Icons with resized dimensions
        ImageIcon userIcon = resizeIcon(new ImageIcon("resources/images/user.png"), 30, 30);
        ImageIcon passwordIcon = resizeIcon(new ImageIcon("resources/images/padlock.png"), 30, 30);

        studentIdField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Customizing components
        studentIdField.setToolTipText("Enter your student ID");
        passwordField.setToolTipText("Enter your password");
        loginButton.setBackground(new Color(0x4CAF50));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel(userIcon), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(studentIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel(passwordIcon), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(loginButton, gbc);

        add(panel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentId = studentIdField.getText();
                String password = new String(passwordField.getPassword());

                if (AuthUtils.authenticate(studentId, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                    dispose();
                    new RouteFinder().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            }
        });
    }

    // Method to resize icons
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }
}
