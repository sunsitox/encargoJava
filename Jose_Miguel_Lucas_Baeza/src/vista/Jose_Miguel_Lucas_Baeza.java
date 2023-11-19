package vista;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Jose_Miguel_Lucas_Baeza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ventana_Inicio ventInic = new Ventana_Inicio();
        ventInic.setLocationRelativeTo(null);
        ventInic.setTitle("MENU PRINCIPAL");
        ventInic.setResizable(true);
        ventInic.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ventInic.setVisible(true);
    }

}
