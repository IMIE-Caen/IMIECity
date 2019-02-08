/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity.interfacegraphique;
import imiecity.core.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author clmntlxndr
 */
public class FenetrePrincipale extends JFrame {

    Monde monde = Monde.getInstance();
        
    public FenetrePrincipale() {
        super("IMIECity - the game");
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(true);
        
        
        for(Lieu lieu : monde.lieux){
            JButton bouton = new JButton(lieu.nom + ": "+lieu.hashCode());
            bouton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new LieuPopup(lieu);

                }
            });
            add(bouton);
        };
        
        
        setLayout(new GridLayout());

        setVisible(true);
    
    }
    
    
    
}
