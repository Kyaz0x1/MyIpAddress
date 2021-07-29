package net.kyaz0x1.myipaddress.view;

import net.kyaz0x1.myipaddress.controller.MyIpController;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class MyIpView extends JFrame {

    private final JLabel lblAddress;

    public MyIpView(){
        super("MyIpAddress v1.0.0");
        setSize(300, 90);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        this.lblAddress = new JLabel("Seu ip é: " + MyIpController.getInstance().getAddress());
        lblAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lblAddress.setBounds(10, 10, 400, 30);

        add(lblAddress);
    }

}