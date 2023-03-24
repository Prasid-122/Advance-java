
package com.mycompany.advjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WindowEventDemo extends JFrame {
    public Container container;
    public WindowEventDemo(){
        container = this.getContentPane();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,400,800,400);
        this.addWindowListener(new myWindow());
        
        JLabel label = new JLabel("click me");
//        label.addMouseListener(new myListener());
        
        
        
        label.setBounds(10,10,80,20);
        container.add(label);
        
        this.setVisible(true);
        
    }



class myWindow implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windows closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
      System.out.println("window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
      System.out.println("iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
      System.out.println("deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("deactivated");
    }
    
}


//class myWindow extends WindowAdapter{
//    @Override 
//    public void windowOpened(WindowEvent e){
//        System.out.println("opened");
//    }
//}
    public static void main(String[] args) {
        new WindowEventDemo();
    }
}
