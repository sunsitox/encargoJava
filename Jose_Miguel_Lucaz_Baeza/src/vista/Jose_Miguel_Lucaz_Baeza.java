/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author José Miguel
 */
public class Jose_Miguel_Lucaz_Baeza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Ventana_Inicio ventInic=new Ventana_Inicio();
       ventInic.setLocationRelativeTo(null);
       ventInic.setTitle("MENU PRINCIPAL");
       ventInic.setResizable(false);
       ventInic.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       ventInic.setVisible(true);
    }
    
}
