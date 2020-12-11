package com.mydesign.Command.demo3;

import javax.swing.*;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:08
 * @Desc：
 */
public class HunTunChef extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel l = new JLabel();
    HunTunChef() {
        super("煮馄饨");
        l.setIcon(new ImageIcon("src/command/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking() {
        this.setVisible(true);
    }
}
