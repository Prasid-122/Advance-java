
package com.mycompany.advjava;

import java.awt.*;
import javax.swing.*;

public class TableExample extends JFrame {
    
    public TableExample(){
        Container   container = this.getContentPane();
        this.setLayout(new FlowLayout());
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,100,800,500);
      this.setTitle("TABLE");
     
      
      String data[][]={
        {"ram","Kathmandu","20"},
        {"Hari","Pokhara","21"},
        {"Jup","chitwan","22"}};
        
        
        
        String colName[]={"Name","Address","Age"};
        JTable table = new JTable(data,colName);
        JScrollPane scrollTable = new JScrollPane(table);
        
          container.add(scrollTable);
      
        
        
         this.setVisible(true);
        
    }
    public static void main(String[] args) {
        new TableExample();       
        
    }
}


