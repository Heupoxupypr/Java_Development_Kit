package Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartServer extends JFrame {
    public static final String BTN_START = "Start Server";
    private static final int WIDTH_START_SERVER = 180;
    private static final int HEIGHT_START_SERVER = 80;
    Server server;
    JButton buttonStart;
    StartServer (Server server) {
        this.server = server;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int centerServerWindowX = server.getX() + server.getWidth()/2;
        int centerServerWindowY = server.getY() + server.getHeight()/2;
        setLocation(centerServerWindowX - WIDTH_START_SERVER/2, centerServerWindowY - HEIGHT_START_SERVER/2);
        setSize(WIDTH_START_SERVER, HEIGHT_START_SERVER);

        add(createButtonStart());
        setVisible(true);
    }

    private Component createButtonStart(){
        buttonStart = new JButton(BTN_START);
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                startServer();
            }
        });
        return buttonStart;
    }

    private void startServer(){
        server.start();
    }
}
