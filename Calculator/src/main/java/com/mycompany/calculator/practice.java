/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class practice extends JFrame implements ActionListener{
    Container container;
   public practice() {
     JFrame frame  = new JFrame();
     container =  frame.getContentPane();
     container.setLayout(null);
     
       JButton button = new JButton("Submit");
       button.addActionListener( this);
     
       
       button.setBounds(15, 25, 100, 30);
     
     container.add(button);
       
       
     frame.setSize(800,800);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setTitle("Practice");
     frame.setVisible(true);
     
}
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    public static void main(String[] args) {
        new practice();
    }
}
