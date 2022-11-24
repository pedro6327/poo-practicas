/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03_01;


    
  
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kevinandres
 */
public class Bandera extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;

    public Bandera() throws HeadlessException {
        this.setTitle("Bandera");
        this.setSize(300, 150);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarLabels();
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Bandera"));
        this.setVisible(true);
        this.setContentPane(this.jPanelList.get(0));
    }

    private void iniciarPaneles() {

        this.jPanelList = new ArrayList<>();

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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
    
        
        this.jPanelList.get(0).setLayout(new BorderLayout());

        
        this.jPanelList.get(0).setBackground(Color.white);
        this.jPanelList.get(1).setBackground(Color.gray);
         this.jPanelList.get(3).setBackground(Color.gray);
        this.jPanelList.get(4).setBackground(Color.gray);
        this.jPanelList.get(5).setBackground(Color.gray);
        
       
        this.jPanelList.get(2).setLayout(new GridLayout(3,4));
        this.jPanelList.get(6).setLayout(new GridLayout(1,4));
        this.jPanelList.get(7).setLayout(new GridLayout(1,4));
        this.jPanelList.get(8).setLayout(new GridLayout(2,1));
        this.jPanelList.get(9).setLayout(new GridLayout(3,1));
        this.jPanelList.get(10).setLayout(new GridLayout(1,4));
        this.jPanelList.get(11).setLayout(new GridLayout(3,1));
        this.jPanelList.get(12).setLayout(new GridLayout(1,4));
        this.jPanelList.get(13).setLayout(new GridLayout(1,4));
        this.jPanelList.get(14).setLayout(new GridLayout(1,1));
        
         this.jPanelList.get(28).setLayout(new GridLayout(3,1)); //39
        this.jPanelList.get(29).setLayout(new GridLayout(3,1)); //43    
        this.jPanelList.get(30).setLayout(new GridLayout(3,1)); //47
        
        
       
        this.jPanelList.get(15).setBackground(Color.red);
        this.jPanelList.get(16).setBackground(Color.red);
        this.jPanelList.get(17).setBackground(Color.red);
        this.jPanelList.get(18).setBackground(Color.white);
        
        this.jPanelList.get(19).setBackground(Color.blue);
        this.jPanelList.get(20).setBackground(Color.white);
        this.jPanelList.get(21).setBackground(Color.red);
        this.jPanelList.get(22).setBackground(Color.red);
        
        this.jPanelList.get(23).setBackground(Color.red);
        this.jPanelList.get(24).setBackground(Color.red);
        
        this.jPanelList.get(25).setBackground(Color.white);
        this.jPanelList.get(26).setBackground(Color.blue);
        this.jPanelList.get(27).setBackground(Color.white);
        
        this.jPanelList.get(32).setBackground(Color.blue);
        
        this.jPanelList.get(33).setBackground(Color.white);
        this.jPanelList.get(34).setBackground(Color.blue);
        this.jPanelList.get(35).setBackground(Color.white);
        
        this.jPanelList.get(36).setBackground(Color.white);
        this.jPanelList.get(37).setBackground(Color.blue);
        this.jPanelList.get(38).setBackground(Color.white);
        
        this.jPanelList.get(40).setBackground(Color.white);
        this.jPanelList.get(41).setBackground(Color.blue);
        this.jPanelList.get(42).setBackground(Color.white);
        
        this.jPanelList.get(43).setBackground(Color.white);
        this.jPanelList.get(44).setBackground(Color.blue);
        this.jPanelList.get(45).setBackground(Color.white);
        
        this.jPanelList.get(46).setBackground(Color.red);
        this.jPanelList.get(47).setBackground(Color.red);
        this.jPanelList.get(48).setBackground(Color.red);
        this.jPanelList.get(49).setBackground(Color.white);
        
        this.jPanelList.get(50).setBackground(Color.blue);
        this.jPanelList.get(51).setBackground(Color.white);
        this.jPanelList.get(52).setBackground(Color.red);
        this.jPanelList.get(53).setBackground(Color.red);
        
        this.jPanelList.get(54).setBackground(Color.red);
        
        
        this.jPanelList.get(2).add(this.jPanelList.get(6));
        this.jPanelList.get(2).add(this.jPanelList.get(7));
        this.jPanelList.get(2).add(this.jPanelList.get(8));
        this.jPanelList.get(2).add(this.jPanelList.get(9));
        this.jPanelList.get(2).add(this.jPanelList.get(10));
        this.jPanelList.get(2).add(this.jPanelList.get(11));
        this.jPanelList.get(2).add(this.jPanelList.get(12));
        this.jPanelList.get(2).add(this.jPanelList.get(13));
        this.jPanelList.get(2).add(this.jPanelList.get(14));

        
        this.jPanelList.get(6).add(this.jPanelList.get(15));
        this.jPanelList.get(6).add(this.jPanelList.get(16));
        this.jPanelList.get(6).add(this.jPanelList.get(17));
        this.jPanelList.get(6).add(this.jPanelList.get(18));
       
        this.jPanelList.get(7).add(this.jPanelList.get(19));
        this.jPanelList.get(7).add(this.jPanelList.get(20));
        this.jPanelList.get(7).add(this.jPanelList.get(21));
        this.jPanelList.get(7).add(this.jPanelList.get(22));
        
        this.jPanelList.get(8).add(this.jPanelList.get(23));
        this.jPanelList.get(8).add(this.jPanelList.get(24));
        
        this.jPanelList.get(9).add(this.jPanelList.get(25));
        this.jPanelList.get(9).add(this.jPanelList.get(26));
        this.jPanelList.get(9).add(this.jPanelList.get(27));
       
        
        
        this.jPanelList.get(10).add(this.jPanelList.get(32));
        this.jPanelList.get(10).add(this.jPanelList.get(28));
        this.jPanelList.get(10).add(this.jPanelList.get(30));
        this.jPanelList.get(10).add(this.jPanelList.get(29));
        
      
         
         this.jPanelList.get(28).add(this.jPanelList.get(33));
         this.jPanelList.get(28).add(this.jPanelList.get(34));
         this.jPanelList.get(28).add(this.jPanelList.get(35));
         
         this.jPanelList.get(29).add(this.jPanelList.get(36));
         this.jPanelList.get(29).add(this.jPanelList.get(37));
         this.jPanelList.get(29).add(this.jPanelList.get(38));
         
         this.jPanelList.get(30).add(this.jPanelList.get(40));
         this.jPanelList.get(30).add(this.jPanelList.get(41));
         this.jPanelList.get(30).add(this.jPanelList.get(42));
        
        
        this.jPanelList.get(11).add(this.jPanelList.get(43));
        this.jPanelList.get(11).add(this.jPanelList.get(44));
        this.jPanelList.get(11).add(this.jPanelList.get(45));

        this.jPanelList.get(12).add(this.jPanelList.get(46));
        this.jPanelList.get(12).add(this.jPanelList.get(47));
        this.jPanelList.get(12).add(this.jPanelList.get(48));
        this.jPanelList.get(12).add(this.jPanelList.get(49));

        this.jPanelList.get(13).add(this.jPanelList.get(50));
        this.jPanelList.get(13).add(this.jPanelList.get(51));
        this.jPanelList.get(13).add(this.jPanelList.get(52));
        this.jPanelList.get(13).add(this.jPanelList.get(53));
        
         this.jPanelList.get(14).add(this.jPanelList.get(54));
        
 
        
        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.WEST);
        this.jPanelList.get(0).add(this.jPanelList.get(4), BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(5), BorderLayout.SOUTH);
        
        
        

        
    }

    public void iniciarLabels() {
        
        this.jLabelList = new ArrayList<>();
        
        
        this.jLabelList.add(new JLabel("Button 1")); //0
       this.jLabelList.add(new JLabel("Button 3"));//1
       this.jLabelList.add(new JLabel("Button 5"));//3
       this.jLabelList.add(new JLabel("Long-Named Button4"));//4

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(3).add(this.jLabelList.get(1));
        this.jPanelList.get(4).add(this.jLabelList.get(2));
        this.jPanelList.get(5).add(this.jLabelList.get(3));
        
    }

}
