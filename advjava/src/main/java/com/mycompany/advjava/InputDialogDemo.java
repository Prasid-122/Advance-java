/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marshall
 */
public class EventInJtable extends JFrame implements ActionListener{
    Container container;
    JFrame frame=new JFrame();
    public EventInJtable(){
        container=frame.getContentPane();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Event in JTable");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        JButton clickme=new JButton("Click Me");
         
    clickme.addActionListener(new ActionListener){
        
    @Override
    public void actionPerformed(ActionEvent e){
        int result=JOptionPane.showConfirmDialog(frame,"are you sure to display");
        if(result==0){
            System.out.println("yes clicked");
        }else if(result==JOptionPane.NO_OPTION){
           System.out.println("no clicked"); 
        }else if(result==JOptionPane.CANCEL_OPTION){
            System.out.println("Cancelled clicked");  
        }
    
    }
    }};

    public static void main(String[]args){
        new EventInJtable();
    }

    
    
}