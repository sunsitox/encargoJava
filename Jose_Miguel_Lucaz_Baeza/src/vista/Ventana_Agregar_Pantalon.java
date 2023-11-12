/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ArticuloDAO;
import controlador.PantalonDAO;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.Pantalon;

/**
 *
 * @author José Miguel
 */
public class Ventana_Agregar_Pantalon extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Agregar_Pantalon
     */
    public Ventana_Agregar_Pantalon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnColores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();
        jTalla = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jMaterial = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        rbtAzul = new javax.swing.JRadioButton();
        rbtNegro = new javax.swing.JRadioButton();
        rbtBlanco = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Talla:");

        jLabel2.setText("Materia:");

        jLabel3.setText("Color:");

        btnIngreso.setText("Ingresar");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        jTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "S", "M", "L", "XL", "XXL" }));
        jTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTallaActionPerformed(evt);
            }
        });

        jLabel4.setText("Id:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Nombre:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Algodón", "Poliéster", "Lino", "Lana", "Seda", "Nylon", "Lycra" }));
        jMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaterialActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        rbtnColores.add(rbtAzul);
        rbtAzul.setText("Azul");
        rbtAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAzulActionPerformed(evt);
            }
        });

        rbtnColores.add(rbtNegro);
        rbtNegro.setText("Negro");
        rbtNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNegroActionPerformed(evt);
            }
        });

        rbtnColores.add(rbtBlanco);
        rbtBlanco.setText("Blanco");
        rbtBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtBlancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(141, 141, 141)
                        .addComponent(rbtAzul)
                        .addGap(54, 54, 54)
                        .addComponent(rbtNegro)
                        .addGap(85, 85, 85)
                        .addComponent(rbtBlanco)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(148, 148, 148)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTalla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId)
                                    .addComponent(txtNombre))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addComponent(jMaterial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtAzul)
                    .addComponent(rbtNegro)
                    .addComponent(rbtBlanco))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnIngreso))
                .addGap(65, 65, 65))
        );

        jMenu1.setText("File");

        jMenu8.setText("Agregar");

        jMenuItem5.setText("Polera");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem4.setText("Vestido");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenu1.add(jMenu8);

        jMenu9.setText("Eliminar");

        jMenuItem2.setText("Pantalon");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenu1.add(jMenu9);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Ventana_Agregar_Polera ventAgPolera = new Ventana_Agregar_Polera();
        ventAgPolera.setLocationRelativeTo(null);
        ventAgPolera.setTitle("Agrgar polera");
        ventAgPolera.setResizable(false);
        ventAgPolera.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ventAgPolera.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Ventana_Agregar_Vestido ventAgVestido = new Ventana_Agregar_Vestido();
        ventAgVestido.setLocationRelativeTo(null);
        ventAgVestido.setTitle("Agrgar vestido");
        ventAgVestido.setResizable(false);
        ventAgVestido.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ventAgVestido.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTallaActionPerformed
        if (jTalla.getItemCount() == 0) {
            jTalla.addItem("S");
            jTalla.addItem("M");
            jTalla.addItem("L");
            jTalla.addItem("XL");
            jTalla.addItem("XXL");
        }
    }//GEN-LAST:event_jTallaActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        int id, precio;
        String nombre, talla, material, color;
        Articulo ar;
        Pantalon pan;

        ButtonGroup buttonGroupColores = new ButtonGroup();
        buttonGroupColores.add(rbtAzul);
        buttonGroupColores.add(rbtNegro);
        buttonGroupColores.add(rbtBlanco);

        String colorSeleccionado = "";
        if (rbtAzul.isSelected()) {
            colorSeleccionado = "Azul";
        } else if (rbtNegro.isSelected()) {
            colorSeleccionado = "Negro";
        } else if (rbtBlanco.isSelected()) {
            colorSeleccionado = "Blanco";
        }

        id = Integer.parseInt(txtId.getText());
        nombre = txtNombre.getText();
        talla = jTalla.getSelectedItem().toString();
        material = jMaterial.getSelectedItem().toString();
        color = colorSeleccionado;
        precio = Integer.parseInt(txtPrecio.getText());

        ar = new Articulo(id, precio, nombre);
        ArticuloDAO arDAO = new ArticuloDAO();
        pan = new Pantalon(id, talla, material, color);
        PantalonDAO panDAO = new PantalonDAO();

        if (arDAO.buscarArticulo(id) == null) {
            arDAO.ingresarArticulo(ar);
            panDAO.ingresarPantalon(pan);
            JOptionPane.showMessageDialog(this, "Pantalon ingresado");
            
        }
        
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void rbtAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtAzulActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaterialActionPerformed
        if (jTalla.getItemCount() == 0) {
            jTalla.addItem("Algodón");
            jTalla.addItem("Poliéster");
            jTalla.addItem("Lino");
            jTalla.addItem("Lana");
            jTalla.addItem("Seda");
            jTalla.addItem("Nylon");
            jTalla.addItem("Lycra");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMaterialActionPerformed

    private void rbtNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNegroActionPerformed

    private void rbtBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtBlancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtBlancoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int id = 0;
        ArticuloDAO arDAO = new ArticuloDAO();
        PantalonDAO panDAO = new PantalonDAO();
        String idString = JOptionPane.showInputDialog("Ingrese el id del Pantalon a eliminar");

        id = Integer.parseInt(idString);
        //JOptionPane.showMessageDialog(this, );
        arDAO.eliminarAlumno(id);
        panDAO.eliminarPantalon(id);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jMaterial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jTalla;
    private javax.swing.JRadioButton rbtAzul;
    private javax.swing.JRadioButton rbtBlanco;
    private javax.swing.JRadioButton rbtNegro;
    private javax.swing.ButtonGroup rbtnColores;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}