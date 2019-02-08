/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity.interfacegraphique;

import imiecity.core.Lieu;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import sun.security.krb5.Config;

/**
 *
 * @author clmntlxndr
 */
public class LieuPopup extends JFrame implements Observer {
    private Lieu lieu;
    public LieuPopup(Lieu lieu){
        super(lieu.nom + ":"+ lieu.hashCode());
        
        this.lieu = lieu;
        setSize(200, 200);
        add(new JLabel(lieu.nom + ":"+ lieu.hashCode()), BorderLayout.NORTH);
        
        lieu.addObserver(this);
        
        
        
        JTable table = new JTable(new LieuTableModelAdapter(lieu)) ;
        add(table);
        
        
        setVisible(true);
    }
    
        @Override
    public void update(Observable o, Object arg) {
 
        repaint();
    }


}
