
package com.mycompany.advjava;

import java.awt.*;
import javax.swing.*;


public class GraphicsDemo extends JFrame{
Container container;
    public GraphicsDemo() {
        container = this.getContentPane();
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel panel = new JPanel();
        mypanel panel = new mypanel();
        container.add(panel);
        this.setVisible(true);
    }
    
    
      class mypanel extends JPanel{
   @Override
        public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(10, 10, 80, 50);
        
        g.setColor(Color.green);
        g.fillRect(150, 10, 80, 50);
        
        g.setColor(Color.black);
        g.fillOval(10, 90, 50, 50);
    }
    }
        
    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
    
  

   
    

