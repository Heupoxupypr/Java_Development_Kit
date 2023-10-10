import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Server extends JFrame {
    private static final String TITLE = "Chat server";
    private static final String MSG_ALLREADY_START = "Server is already srart";
    private static final String MSG_ALLREADY_STOP = "Server is already stop";
    private static final String MSG_START = "Server start";
    private static final String MSG_STOP = "Server stop";
    private static final String MSG_ALLREADY_CLIENT = "Клиент уже подключен";
    private static final String HAS_INPUT = "В чат вошел ";
    private static final String HAS_EXIT = "Чат покинул ";
    private static final String NO_CLIENT = "Такого клиента нет";

    private static final int WIDTH = 500;
    private static final int HEIGHT = 400;
    private static final String BTN_START = "Start";
    private static final String BTN_STOP = "Stop";
    private JTextArea textTextArea;
    private JButton startBtn, stopBtn;
    //    private ArrayList<Client> clients;
    private boolean isStart = false;

    Server() {
//        clients=new ArrayList<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle(TITLE);
//        add(createBottomPanel(), BorderLayout.SOUTH);
        textTextArea = new JTextArea();
        add(textTextArea, BorderLayout.CENTER);
        setVisible(true);
//        startBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (isStart) {
//                    System.out.println(MSG_ALLREADY_START);
//                    return;
//                }
//
//                isStart=true;
//                System.out.println(MSG_START);
//            }
//        });
//        stopBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!isStart){
//                    System.out.println(MSG_ALLREADY_STOP);
//                }
//                isStart=false;
//                System.out.println(MSG_STOP);
//            }
//        });
    }
}