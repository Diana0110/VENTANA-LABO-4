/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {
    public int WIDTH = 300, widthTF = 120, widthB = 80;
    public int HEIGTH = 300, heigthTF = 30, heigthB = 30;
    public JTextField textF1, textF2;
    public JButton button;
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(100,40,widthTF,heigthTF));
        
        textF2 = new JTextField(9);
        textF2.setBounds(new Rectangle(100,200,widthTF,heigthTF));
        
        button = new JButton("Copiar");
        button.setBounds(new Rectangle(120,115,widthB,heigthB ));
        
        textF1.setEditable(true);
        textF2.setEditable(false);
        
        button.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent arg0){
            textF2.setText(textF1.getText());
        }
    });
        add(textF1);
        add(button);
        add(textF2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGTH));
        
    }
    
}