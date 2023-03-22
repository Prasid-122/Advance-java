
package com.mycompany.calculator;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Calculation extends JFrame implements ActionListener {
public JTextField  txtText1;
public JTextField  txtText2;
public JTextField txtOutput;
public JButton Add, sub, mul, div;

public Calculation(){
    Container container =this.getContentPane();
    container.setLayout(null);
    Font font = new Font("Serif", Font.ITALIC, 12);
    
    
    JLabel First = new JLabel("First");
    First.setFont(font);
    txtText1 = new JTextField();
    
    JLabel Sec = new JLabel("Second");
    Sec.setFont(font);
    txtText2 = new JTextField();
    
    JLabel Output = new JLabel("Output");
    Output.setFont(font);
    txtOutput = new JTextField();
    
    Add = new JButton("Add");
    Add.setFont(font);
    sub = new JButton("Substraction");
    sub.setFont(font);
    mul =new JButton("Multiplication");
    mul.setFont(font);
    div = new JButton("Division");
    div.setFont(font);
  
    //setLocation
    First.setBounds(15, 50, 100, 25);
    txtText1.setBounds(100, 50, 300, 25);
    Sec.setBounds(15, 100, 150, 25);
    txtText2.setBounds(100, 100, 300, 25);
    Add.setBounds(50, 400, 100, 25);
    Output.setBounds(15, 200, 100, 25);
    txtOutput.setBounds(100,200,300,25);
     
    //Event Handeler
   Add.addActionListener(this);
   sub.addActionListener(this);
   mul.addActionListener(this);
   div.addActionListener(this);
    //set Conponent
    container.add(First);
    container.add(txtText1);
    container.add(Sec);
    container.add(txtText2);
    container.add(Add);
    container.add(Output);
    container.add(txtOutput);
     
    this.setVisible(true);
    this.setTitle("Calculator");
    this.setSize(800, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.WHITE);
    this.setResizable(false);
    
}
@Override
 public void actionPerformed(ActionEvent e) {
     int no1 =Integer.parseInt(txtText1.getText());
     int no2 =Integer.parseInt(txtText2.getText());
     txtOutput.setText("Addition:"+(no1+no2));
   
    
    }    
}
