package main.java.com.mydesign.Command.demo3;

import javax.swing.*;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:08
 * @Desc：
 */
public class HeFenChef extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel l = new JLabel();
    HeFenChef() {
        super("煮河粉");
        l.setIcon(new ImageIcon("src/command/HeFen.jpg"));
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking() {
        this.setVisible(true);
    }
}
