package Client;

import Server.Server;

import javax.swing.*;
import java.awt.*;

public class ClientMainPanel  extends JFrame {
    private static final String TITLE="Chat client";
    private static final String BTN_SEND="Send";
//    private static final String BTN_LOGIN="Login";
    private static final String BTN_DISC="Disconnect";
    private static final String MSG_SRV_CONNECT="Connection completed";
    private static final String MSG_SRV_DISCONNECT="Disconnected";
    private static final String MSG_SRV_OFFLINE="Сonnect to the server Failed";
    private static final int WIDTH=397;
    private static final int HEIGHT=304;

    private JTextField ipTF,portTF,loginTF,passTF,messageTF;
    private JButton loginBtn,sendBtn,dscBtn;
    private JTextArea textTA;
    ClientMainPanel mainPanel;

    ClientMainPanel (Server server, String login, String password) {
        mainPanel = this;
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle(TITLE);
        add(createBottomPanel(), BorderLayout.SOUTH);
        add(createTopPanel(defLogin,defPass),BorderLayout.NORTH);
        textTA=new JTextArea();
        textTA.setEditable(false);
        add(textTA,BorderLayout.CENTER);
        setVisible(true);
    }
}
