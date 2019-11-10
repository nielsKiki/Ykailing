package com.goolge.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        //
        JFrame frame = new JFrame("login Example");

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);


    }

    private static void placeComponents(JPanel panel) {
        final String COMMAND_LOGIN = "LOGIN";
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.setActionCommand(COMMAND_LOGIN);
        panel.add(loginButton);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if (COMMAND_LOGIN.equals(command)) {
                    System.out.println("OK 按钮被点击");
                    JOptionPane.showMessageDialog(null, "error!", "please input age", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Cancel 按钮被点击");
                }
            }
        };
        loginButton.addActionListener(actionListener);
    }


}
