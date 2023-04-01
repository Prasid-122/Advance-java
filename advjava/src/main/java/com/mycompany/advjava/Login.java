package com.mycompany.advjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    public Login() {
        JFrame frame = new JFrame();
        Container container = frame.getContentPane();
        container.setLayout(null);
        Font font = new Font("Serif", Font.BOLD, 12);
       

        JLabel Name = new JLabel("Name");
        Name.setFont(font);
        JTextField txtName = new JTextField();

        JLabel Mobile = new JLabel("Mobile");
        Mobile.setFont(font);
        JTextField txtMobile = new JTextField();
        JLabel reg = new JLabel("Registraion Form");
        reg.setFont(font);

        JLabel Gender = new JLabel("Gender");
        Gender.setFont(font);
        JRadioButton male = new JRadioButton("Male");
        male.setFont(font);

        JLabel Term = new JLabel("Accept terms and conditions");
        Term.setFont(font);
        JCheckBox term = new JCheckBox();
        term.setFont(font);

        JLabel Address = new JLabel("Address");
        Address.setFont(font);
        JTextField address = new JTextField();

        JLabel DOB = new JLabel("Date Of Birth");
        DOB.setFont(font);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(font);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        String day[] = new String[31];
        String year[] = new String[100];
        String month[] = {"jan", "Feb", "March", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < 31; i++) {
            day[i] = Integer.toString(i + 1);
        }
        for (int i = 0; i < 100; i++) {
            year[i] = Integer.toString(i + 1980);
        }
        JLabel dayLabel = new JLabel("Day");
        dayLabel.setFont(font);
        JComboBox dayCombo = new JComboBox(day);

        JLabel monthLabel = new JLabel("Month");
        monthLabel.setFont(font);
        JComboBox monthCombo = new JComboBox(month);

        JLabel yearLabel = new JLabel("Year");
        yearLabel.setFont(font);
        JComboBox yearCombo = new JComboBox(year);

        JButton Submit = new JButton("Submit");
        Submit.setFont(font);
        Submit.addActionListener(this);

        JButton Reset = new JButton("Reset");
        Reset.setFont(font);

        //set Location
        Name.setBounds(15, 50, 150, 25);
        txtName.setBounds(200, 50, 300, 25);
        Mobile.setBounds(15, 100, 150, 25);
        txtMobile.setBounds(200, 100, 300, 25);
        Gender.setBounds(15, 200, 100, 25);
        male.setBounds(200, 200, 100, 25);
        female.setBounds(350, 200, 100, 25);
        dayCombo.setBounds(200, 300, 40, 25);
        monthCombo.setBounds(240, 300, 60, 25);
        yearCombo.setBounds(300, 300, 80, 25);
        term.setBounds(100, 500, 20, 20);
        Term.setBounds(140, 500, 200, 20);
        Address.setBounds(15, 400, 50, 25);
        address.setBounds(100, 400, 200, 80);
        reg.setBounds(200, 2, 300, 50);
        DOB.setBounds(15, 300, 100, 30);

        Submit.setBounds(50, 550, 100, 25);
        Reset.setBounds(200, 550, 150, 25);

        //adding component
        container.add(Name);
        container.add(txtName);
        container.add(Mobile);
        container.add(txtMobile);

        container.add(Gender);
        container.add(male);
        container.add(female);
        container.add(dayCombo);
        container.add(monthCombo);
        container.add(yearCombo);
        container.add(term);
        container.add(Term);
        container.add(Submit);
        container.add(Reset);
        container.add(Address);
        container.add(address);
        container.add(reg);
        container.add(DOB);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Registration Form");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(this, "are you sure you want to submit");
        if (result == 0) {
            System.out.println("yes clicked");
            JOptionPane.showMessageDialog(this, "Submitted");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("no clicked");
            JOptionPane.showMessageDialog(this, "no clicked");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            System.out.println("Cancelled clicked");
            JOptionPane.showMessageDialog(this, "cancel clicked");
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
