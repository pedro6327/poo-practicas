/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad0302;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Ventana0302a extends JFrame{
    
    private List<JPanel> jPanelList;

    public Ventana0302a() throws HeadlessException {
        
        this.setTitle("Grid Layout");
        this.setSize(300, 150);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList= new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
              
           
        
        this.jPanelList.get(0).setLayout(new GridLayout(3,4));
        this.jPanelList.get(1).setLayout(new GridLayout(1,4));
        this.jPanelList.get(2).setLayout(new GridLayout(1,4));
        this.jPanelList.get(3).setLayout(new GridLayout(2,1));
        this.jPanelList.get(4).setLayout(new GridLayout(3,1));
        this.jPanelList.get(15).setLayout(new GridLayout(1,4));
        this.jPanelList.get(16).setLayout(new GridLayout(3,1));
        this.jPanelList.get(17).setLayout(new GridLayout(1,4));
        this.jPanelList.get(32).setLayout(new GridLayout(1,4));
        this.jPanelList.get(37).setLayout(new GridLayout(1,1));
        
        
        this.jPanelList.get(39).setLayout(new GridLayout(3,1));
        this.jPanelList.get(43).setLayout(new GridLayout(3,1));
        this.jPanelList.get(47).setLayout(new GridLayout(3,1));
        
        
    
        
        this.jPanelList.get(5).setBackground(Color.red);
        this.jPanelList.get(6).setBackground(Color.red);
        this.jPanelList.get(20).setBackground(Color.red);
        this.jPanelList.get(21).setBackground(Color.white);
        
        this.jPanelList.get(28).setBackground(Color.red);
        this.jPanelList.get(29).setBackground(Color.red);
        this.jPanelList.get(30).setBackground(Color.red);
        this.jPanelList.get(31).setBackground(Color.white);
       
        
        this.jPanelList.get(7).setBackground(Color.white);
        this.jPanelList.get(8).setBackground(Color.blue);
        this.jPanelList.get(24).setBackground(Color.white);
        
        
        
        this.jPanelList.get(9).setBackground(Color.blue);
        this.jPanelList.get(10).setBackground(Color.white);
        this.jPanelList.get(22).setBackground(Color.red);
        this.jPanelList.get(23).setBackground(Color.red);

        this.jPanelList.get(33).setBackground(Color.blue);
        this.jPanelList.get(34).setBackground(Color.white);
        this.jPanelList.get(35).setBackground(Color.red);
        this.jPanelList.get(36).setBackground(Color.red);      
        
        this.jPanelList.get(38).setBackground(Color.red);
        
        this.jPanelList.get(53).setBackground(Color.white);
        
        
        this.jPanelList.get(11).setBackground(Color.red);
        this.jPanelList.get(12).setBackground(Color.red);
        
        this.jPanelList.get(13).setBackground(Color.blue);
       
        
        
        

 
        this.jPanelList.get(18).setBackground(Color.white);
        this.jPanelList.get(19).setBackground(Color.blue);
        this.jPanelList.get(27).setBackground(Color.white);
        
        this.jPanelList.get(44).setBackground(Color.white);
        this.jPanelList.get(45).setBackground(Color.blue);
        this.jPanelList.get(46).setBackground(Color.white);
        
        this.jPanelList.get(48).setBackground(Color.white);
        this.jPanelList.get(49).setBackground(Color.blue);
        this.jPanelList.get(50).setBackground(Color.white);
        
        this.jPanelList.get(40).setBackground(Color.white);
        this.jPanelList.get(41).setBackground(Color.blue);
        this.jPanelList.get(42).setBackground(Color.white);
        
       
       
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        this.jPanelList.get(0).add(this.jPanelList.get(16));
        this.jPanelList.get(0).add(this.jPanelList.get(17));
        this.jPanelList.get(0).add(this.jPanelList.get(32));
        this.jPanelList.get(0).add(this.jPanelList.get(37));
        
     
        
        
        
        

        this.jPanelList.get(1).add(this.jPanelList.get(5));
        this.jPanelList.get(1).add(this.jPanelList.get(6));
         this.jPanelList.get(1).add(this.jPanelList.get(20));
         this.jPanelList.get(1).add(this.jPanelList.get(21));
       
        
        this.jPanelList.get(2).add(this.jPanelList.get(9));
        this.jPanelList.get(2).add(this.jPanelList.get(10));
        this.jPanelList.get(2).add(this.jPanelList.get(22));
        this.jPanelList.get(2).add(this.jPanelList.get(23));
        
        this.jPanelList.get(3).add(this.jPanelList.get(11));
        this.jPanelList.get(3).add(this.jPanelList.get(12));
        
        this.jPanelList.get(4).add(this.jPanelList.get(7));
        this.jPanelList.get(4).add(this.jPanelList.get(8));
        this.jPanelList.get(4).add(this.jPanelList.get(24));
       
        
        
        this.jPanelList.get(15).add(this.jPanelList.get(13));
        this.jPanelList.get(15).add(this.jPanelList.get(39));
        this.jPanelList.get(15).add(this.jPanelList.get(47));
        this.jPanelList.get(15).add(this.jPanelList.get(43));
        
        
      
        this.jPanelList.get(47).add(this.jPanelList.get(48));
         this.jPanelList.get(47).add(this.jPanelList.get(49));
         this.jPanelList.get(47).add(this.jPanelList.get(50));
         
         this.jPanelList.get(43).add(this.jPanelList.get(44));
         this.jPanelList.get(43).add(this.jPanelList.get(45));
         this.jPanelList.get(43).add(this.jPanelList.get(46));
         
         this.jPanelList.get(39).add(this.jPanelList.get(40));
         this.jPanelList.get(39).add(this.jPanelList.get(41));
         this.jPanelList.get(39).add(this.jPanelList.get(42));
        
         
         
        
          this.jPanelList.get(16).add(this.jPanelList.get(18));
        this.jPanelList.get(16).add(this.jPanelList.get(19));
        this.jPanelList.get(16).add(this.jPanelList.get(27));
        
        this.jPanelList.get(17).add(this.jPanelList.get(28));
        this.jPanelList.get(17).add(this.jPanelList.get(29));
        this.jPanelList.get(17).add(this.jPanelList.get(30));
        this.jPanelList.get(17).add(this.jPanelList.get(31));
        
        this.jPanelList.get(32).add(this.jPanelList.get(33));
        this.jPanelList.get(32).add(this.jPanelList.get(34));
        this.jPanelList.get(32).add(this.jPanelList.get(35));
        this.jPanelList.get(32).add(this.jPanelList.get(36));
        
         this.jPanelList.get(37).add(this.jPanelList.get(38));
         
         
         
         
         
         this.jPanelList.get(43).add(this.jPanelList.get(44));
         this.jPanelList.get(43).add(this.jPanelList.get(45));
         this.jPanelList.get(43).add(this.jPanelList.get(46));
         
          this.jPanelList.get(47).add(this.jPanelList.get(48));
         this.jPanelList.get(47).add(this.jPanelList.get(49));
         this.jPanelList.get(47).add(this.jPanelList.get(50));
         
         this.jPanelList.get(39).add(this.jPanelList.get(40));
         this.jPanelList.get(39).add(this.jPanelList.get(41));
         this.jPanelList.get(39).add(this.jPanelList.get(42));
         
 
    }
   
}
