
package com.mycompany.advjava;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Signup extends JFrame implements ActionListener{
    Container container;
    public Signup(){
        JFrame frame = new JFrame();
        container =frame.getContentPane();
        container.setLayout(null);
        
        JLabel reg = new JLabel("Registraion Form");
        
        JLabel name =new JLabel("Name:");
        JTextField txtname = new JTextField();
        
        JLabel pass= new JLabel("Password:");
        JPasswordField txtpass = new JPasswordField();
        
        JLabel mobile =new JLabel("Mobile No:");
        JTextField txtmob = new JTextField();
        
        JLabel email =new JLabel("Email:");
        JTextField txtemail =new JTextField();
        
        JLabel dob =new JLabel("Date of Birth:");
        
        
        
        String day[] = new String[31];
        String year[] = new String[100];
        String month[] = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        for(int i=0; i<31;i++ ){
            day[i]=Integer.toString(i+1);
        }
        for(int i = 0; i<100;i++)
        {
            year[i]=Integer.toString(i+1970);
        }
        JLabel daysLabel = new JLabel("Day");
        JComboBox daycombo = new JComboBox(day);
        
        JLabel monthLabel = new JLabel("Month");
        JComboBox monthCombo = new JComboBox(month);
        
        JLabel yearLabel = new JLabel("Year");
        JComboBox yearcombo = new JComboBox(year);
        
        
        JButton submit = new JButton("Submit");
        submit.addActionListener(this);
        
        
        //location
        name.setBounds(15, 50, 150, 25);
        txtname.setBounds(80, 50, 300, 25);
        pass.setBounds(15, 80, 150, 25);
        txtpass.setBounds(80, 80, 300, 25);
        mobile.setBounds(15, 110, 150, 25);
        txtmob.setBounds(80, 110, 300, 25);
        email.setBounds(15,140,150,25);
        txtemail.setBounds(80,140,300,25);
        dob.setBounds(15,170,150,25);
        daycombo.setBounds(100,170,50,25);
        monthCombo.setBounds(150, 170, 50, 25);
        yearcombo.setBounds(200, 170, 80, 25);
        
        
        submit.setBounds(15,200,100,25);
        
        
        // add components
        container.add(reg);
        container.add(name);
        container.add(txtname);
        container.add(pass);
        container.add(txtpass);
        container.add(mobile);
        container.add(txtmob);
        container.add(email);
        container.add(txtemail);
        container.add(dob);
        container.add(daycombo);
        container.add(monthCombo);
        container.add(yearcombo);
        container.add(submit);
        
        
        
        //frame 
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sign up Form");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
   
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
    int result=JOptionPane.showConfirmDialog(this, "Are you sure to submit");    
    if(result==0){
        System.out.println("Details Submitted");
        JOptionPane.showMessageDialog(this, "Details Submitted");
    }
    else if(result==JOptionPane.NO_OPTION)
            {
                System.out.println("Detains not submitted");
                JOptionPane.showMessageDialog(this, "Detains not submitted");
    }
    else if(result == JOptionPane.CANCEL_OPTION)
    {
        System.out.println("Cancelled");
        JOptionPane.showMessageDialog(this, "Cancelled");
    }
    }
    
    public static void main(String[] args) {
        new  Signup();
    }
}
