/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mizar
 */
public class NameView extends JPanel{
    private Block[] nameBlock = new Block[5];
    
    public NameView(){
        initNameBlock();    
        JPanel panel = new JPanel(new FlowLayout());
        for ( Block block : nameBlock ){
            panel.add(block);
        }
        this.add(panel);
        this.setLayout(new FlowLayout());
    }
    
    private void initNameBlock(){
        String[] attributes = {"Given Name:", "Family Name:",
                              "Additional Name:", "Honorific Preffix:",
                              "Honorific Suffix"};
        String[] values = {"given name", "family name",
                          "additional name" , "honorific preffix",
                          "honorific suffix"};
       
        
        for (int i = 0; i < nameBlock.length; i++){
            nameBlock[i] = new Block();
            nameBlock[i].getTitleLabel().setText(attributes[i]);
            nameBlock[i].getTextArea().setColumns(8);
            nameBlock[i].setContent(values[i]);
            nameBlock[i].updateBlock();
        }        
    }
    
    public void makeStatic(boolean b){  
        for ( Block block : nameBlock ){
            block.makeStatic( b );
        }
    }

}
