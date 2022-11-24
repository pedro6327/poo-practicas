/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;

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
public class VentanaBorderLayout extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;

    public VentanaBorderLayout() throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setSize(300, 150);
        this.setLocation(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarLabels();
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "BorderLayout"));
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

        this.jPanelList.get(0).setLayout(new BorderLayout());

        this.jPanelList.get(0).setBackground(Color.white);
        this.jPanelList.get(1).setBackground(Color.gray);
        this.jPanelList.get(2).setBackground(Color.white);
        this.jPanelList.get(3).setBackground(Color.gray);
        this.jPanelList.get(4).setBackground(Color.gray);
        this.jPanelList.get(5).setBackground(Color.gray);

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
        this.jLabelList.add(new JLabel("2"));//2
        this.jLabelList.add(new JLabel("Button 5"));//3
        this.jLabelList.add(new JLabel("Long-Named Button4"));//4

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(1));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        
    }

}
