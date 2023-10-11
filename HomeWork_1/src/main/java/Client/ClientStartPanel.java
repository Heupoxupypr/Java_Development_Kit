package Client;

import Server.Server;

import javax.swing.*;
import java.awt.*;

public class ClientStartPanel extends JFrame {

    private static final String TITLE="Client Start Panel";
    public static final String BTN_SETTINGS = "Settings";
    public static final String BTN_LOGIN = "Login";
    private static final int WIDTH_SETTINGS = 397;
    private static final int HEIGHT_SETTINGS = 240;
    private static final String DEF_IP="127.0.0.1";
    private static final String DEF_PORT="8080";
    private JTextField ipTextField,portTextField,loginTextField,passTextField;
    Server server;
    JButton buttonLogin, buttonSettings;

    ClientStartPanel () {
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle(TITLE);
        add(createSettingsPanel(), BorderLayout.CENTER);
        setVisible(true);
    }
    private JPanel createSettingsPanel(){
        JPanel settingsPanel=new JPanel(new GridLayout(3,2));
        ipTextField=new JTextField(DEF_IP);
        portTextField=new JTextField(DEF_PORT);
        loginTextField=new JTextField("Username");
        passTextField=new JPasswordField("Password");
        buttonLogin=new JButton(BTN_LOGIN);
        buttonSettings=new JButton(BTN_SETTINGS);
        settingsPanel.add(ipTextField);
        ipTextField.setEditable(false);
        settingsPanel.add(portTextField);
        portTextField.setEditable(false);
        settingsPanel.add(loginTextField);
        settingsPanel.add(passTextField);
        settingsPanel.add(buttonLogin);
        settingsPanel.add(buttonSettings);
        return settingsPanel;
    }
}
