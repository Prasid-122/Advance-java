
package com.mycompany.advjava;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menudemo extends JFrame implements ActionListener  {
    
     JMenuItem item1;
     JMenuItem item2;
     JMenuItem item3;
     JMenuItem item4;
     JMenuItem item5;
     JMenuItem item6;
     JMenuItem item7;
     JMenuItem item8;
     JMenuItem item9;
     JMenuItem item10;
     JMenuItem item11;
     JMenuItem item12;
     JMenuItem item13;
     JMenuItem item14;
    
     JTextArea textarea;
    public Menudemo()
    {
      Container container = this.getContentPane();
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setBounds(100,100,800,500);
      this.setTitle("Menubar");
      
      JMenuBar menubar= new JMenuBar();
     JMenu file = new JMenu("File");
     JMenu edit = new JMenu("edit");
     JMenu view = new JMenu("view");
     item1 = new JMenuItem("open");
     item2 = new JMenuItem("save");
     item3 = new JMenuItem("save as");
     item4 = new JMenuItem("new");
     item5 = new JMenuItem("close");
     item6 = new JMenuItem("copy");
     item7 = new JMenuItem("cut");
     item8 = new JMenuItem("paste");
     item9 = new JMenuItem("select all");
     item10 = new JMenuItem("undo");
     item11 = new JMenuItem("redo");
     item12 = new JMenuItem("word wrap");
     item13 = new JMenuItem("split");
     item14 = new JMenuItem("full screen");
     
     menubar.add(file);
     menubar.add(edit);
     menubar.add(view);
      
      file.add(item1);
      file.add(item2);
      file.add(item3);
      file.add(item4);
      file.add(item5);
      edit.add(item6);
      edit.add(item7);
      edit.add(item8);
      edit.add(item9);
      edit.add(item10);
      edit.add(item11);
      view.add(item12);
      view.add(item13);
      view.add(item14);
      
      item1.addActionListener(this);
      item2.addActionListener(this);
      item3.addActionListener(this);
      item4.addActionListener(this);
      item5.addActionListener(this);
      item6.addActionListener(this);
      item7.addActionListener(this);
      item8.addActionListener(this);
      item9.addActionListener(this);
      item10.addActionListener(this);
      item11.addActionListener(this);
      item12.addActionListener(this);
      item13.addActionListener(this);
      item14.addActionListener(this);
      
      this.setJMenuBar(menubar);
      
      
      textarea=new JTextArea();
      this.add(textarea);
      
       this.setVisible(true);
      
    }
    public static void main(String[] args){
      new Menudemo();   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==item9)
        {
            textarea.selectAll();
         // System.out.println("openlicked");
        }
         if(e.getSource()==item6)
        {
            textarea.copy();
         // System.out.println("openlicked");
        }
          if(e.getSource()==item8)
        {
            textarea.paste();
         // System.out.println("openlicked");
        }
         
        
       
    }
}
