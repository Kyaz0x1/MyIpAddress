package net.kyaz0x1.myipaddress;

import net.kyaz0x1.myipaddress.view.MyIpView;

import javax.swing.SwingUtilities;

public class MyIpAddress {

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new MyIpView().setVisible(true));
    }

}