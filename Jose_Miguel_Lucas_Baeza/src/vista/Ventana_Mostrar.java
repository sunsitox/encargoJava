/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;
import controlador.PantalonDAO;
import controlador.PoleraDAO;
import controlador.VestidoDAO;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Articulo;
import modelo.Pantalon;
import modelo.Polera;
import modelo.Vestido;

/**
 *
 * @author José Miguel
 */
public class Ventana_Mostrar extends javax.swing.JFrame {

    Conexion enlace = new Conexion();

    public Ventana_Mostrar() {
        initComponents();
    }

    public void mostrarDatos() {

        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM vista1";
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Precio");
            model.addColumn("Tipo");

            while (rs.next()) {
                String id = rs.getString("Id");
                String nombre = rs.getString("Nombre");
                String precio = rs.getString("Precio");
                String tipo = rs.getString("Tipo");
                model.addRow(new Object[]{id, nombre, precio, tipo});
            }

            jtVer.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void limpiarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) jtVer1.getModel();
        int n = jtVer1.getRowCount() - 1;
        for (int i = 0; i <= n; i++) {
            dtm.removeRow(dtm.getRowCount() - 1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnMostrarTodo = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVer = new javax.swing.JTable();
        btnMosPantalon = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVer1 = new javax.swing.JTable();
        btnMosPolera = new javax.swing.JButton();
        btnMosVestido = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        opSalir = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 226, 208));

        jPanel1.setBackground(new java.awt.Color(236, 226, 208));

        btnBuscar.setBackground(new java.awt.Color(191, 181, 175));
        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Ingrese Id Del Articulo");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnMostrarTodo.setBackground(new java.awt.Color(191, 181, 175));
        btnMostrarTodo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(191, 181, 175));
        btnVolver.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jtVer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtVer);

        btnMosPantalon.setBackground(new java.awt.Color(191, 181, 175));
        btnMosPantalon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMosPantalon.setText("Mostrar Pantalon");
        btnMosPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMosPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosPantalonActionPerformed(evt);
            }
        });

        jtVer1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVer1.setColumnSelectionAllowed(true);
        jtVer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(jtVer1);
        jtVer1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jtVer1.getColumnModel().getColumnCount() > 0) {
            jtVer1.getColumnModel().getColumn(0).setResizable(false);
            jtVer1.getColumnModel().getColumn(1).setResizable(false);
            jtVer1.getColumnModel().getColumn(2).setResizable(false);
        }

        btnMosPolera.setBackground(new java.awt.Color(191, 181, 175));
        btnMosPolera.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMosPolera.setText("Mostrar Polera");
        btnMosPolera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMosPolera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosPoleraActionPerformed(evt);
            }
        });

        btnMosVestido.setBackground(new java.awt.Color(191, 181, 175));
        btnMosVestido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnMosVestido.setText("Mostrar Vestido");
        btnMosVestido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMosVestido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosVestidoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(191, 181, 175));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setText("Limpiar Tabla");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(191, 181, 175));
        btnModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 51, 255));
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMosPantalon)
                                    .addComponent(btnMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMosPolera, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMosVestido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVolver)
                                .addGap(61, 61, 61))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)))
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMostrarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMosPantalon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMosPolera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMosVestido)
                        .addGap(24, 24, 24)
                        .addComponent(btnVolver)
                        .addGap(24, 24, 24))))
        );

        opSalir.setText("Archivo");

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/moreover_insert_append_3929.png"))); // NOI18N
        jMenu8.setText("Agregar");

        jMenuItem3.setText("Pantalon");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

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

        opSalir.add(jMenu8);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opSalir.add(jMenuItem1);

        jMenuBar1.add(opSalir);

        jMenu1.setText("Eliminar");

        jMenuItem7.setText("Pantalon");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem6.setText("Polera");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem2.setText("Vestido");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Ventana_Agregar_Pantalon ventAgPantalon = new Ventana_Agregar_Pantalon();
        ventAgPantalon.setLocationRelativeTo(null);
        ventAgPantalon.setTitle("Agrgar pantalon");
        ventAgPantalon.setResizable(false);
        ventAgPantalon.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ventAgPantalon.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Ventana_Agregar_Polera ventAgPolera = new Ventana_Agregar_Polera();
        ventAgPolera.setLocationRelativeTo(null);
        ventAgPolera.setTitle("Agrgar polera");
        ventAgPolera.setResizable(false);
        ventAgPolera.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Ventana_Agregar_Vestido ventAgVestido = new Ventana_Agregar_Vestido();
        ventAgVestido.setLocationRelativeTo(null);
        ventAgVestido.setTitle("Agrgar vestido");
        ventAgVestido.setResizable(false);
        ventAgVestido.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ventAgVestido.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int id = 0;
        PoleraDAO polDAO = new PoleraDAO();
        VestidoDAO vesDAO = new VestidoDAO();
        PantalonDAO panDAO = new PantalonDAO();
        String idString = JOptionPane.showInputDialog("Ingrese el id del Pantalon a eliminar");
        id = Integer.parseInt(idString);
        if (polDAO.buscarPolera(id) == null && vesDAO.buscarVestido(id) == null && panDAO.buscarPantalon(id) == null) {
            JOptionPane.showMessageDialog(this, "Articulo no encontrado");
        } else {
            panDAO.eliminarPantalon(id);
            JOptionPane.showMessageDialog(this, "Articulo Eliminado");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int id = 0;
        PoleraDAO polDAO = new PoleraDAO();
        VestidoDAO vesDAO = new VestidoDAO();
        PantalonDAO panDAO = new PantalonDAO();
        String idString = JOptionPane.showInputDialog("Ingrese el id del Vestido a eliminar");

        id = Integer.parseInt(idString);
        if (polDAO.buscarPolera(id) == null && vesDAO.buscarVestido(id) == null && panDAO.buscarPantalon(id) == null) {
            JOptionPane.showMessageDialog(this, "Articulo no encontrado");
        } else {
            //JOptionPane.showMessageDialog(this, );

            vesDAO.eliminarVestido(id);
            JOptionPane.showMessageDialog(this, "Articulo Eliminado");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int id = 0;
        PoleraDAO polDAO = new PoleraDAO();
        VestidoDAO vesDAO = new VestidoDAO();
        PantalonDAO panDAO = new PantalonDAO();
        String idString = JOptionPane.showInputDialog("Ingrese el id del Polera a eliminar");

        id = Integer.parseInt(idString);
        if (polDAO.buscarPolera(id) == null && vesDAO.buscarVestido(id) == null && panDAO.buscarPantalon(id) == null) {
            JOptionPane.showMessageDialog(this, "Articulo no encontrado");
        } else {

            polDAO.eliminarPolera(id);
            JOptionPane.showMessageDialog(this, "Articulo Eliminado");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnMosVestidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosVestidoActionPerformed
        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM vestido";
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Tela");
            model.addColumn("Talla");
            model.addColumn("Diceño");

            while (rs.next()) {
                String idVestido = rs.getString("idVestido");
                String tela = rs.getString("tela");
                String talla = rs.getString("talla");
                String diceno = rs.getString("diceno");
                model.addRow(new Object[]{idVestido, tela, talla, diceno});
            }

            jtVer.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMosVestidoActionPerformed

    private void btnMosPoleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosPoleraActionPerformed
        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM polera";
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Talla");
            model.addColumn("Material");
            model.addColumn("Color");

            while (rs.next()) {
                String idPolera = rs.getString("idPolera");
                String talla = rs.getString("talla");
                String material = rs.getString("material");
                String color = rs.getString("color");
                model.addRow(new Object[]{idPolera, talla, material, color});
            }

            jtVer.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMosPoleraActionPerformed

    private void btnMosPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosPantalonActionPerformed
        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM pantalon";
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Talla");
            model.addColumn("Material");
            model.addColumn("Color");

            while (rs.next()) {
                String idPantalonPrimaria = rs.getString("idPantalon");
                String talla = rs.getString("talla");
                String material = rs.getString("material");
                String color = rs.getString("color");
                model.addRow(new Object[]{idPantalonPrimaria, talla, material, color});
            }

            jtVer.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMosPantalonActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jtVer1.getModel();
        int fila = jtVer1.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el Articulo que desea modificar");
        } else {
            try {
                int id = Integer.parseInt(String.valueOf(jtVer1.getValueAt(fila, 0)));
                String nombre = String.valueOf(jtVer1.getValueAt(fila, 1));
                int precio = Integer.parseInt(String.valueOf(jtVer1.getValueAt(fila, 2)));

                JOptionPane.showMessageDialog(this, "Articulo modificado");

                // Aquí deberías hacer algo con las instancias de Polera, Vestido, Pantalon, y sus respectivos DAOs
                // Por ejemplo, podrías llamar a los métodos correspondientes para modificar esos elementos en la base de datos
                // Modificar Polera
                Polera pol = new Polera(id, "", "", "", precio, nombre);
                PoleraDAO polDAO = new PoleraDAO();
                polDAO.modificarPolera(pol);

                // Instancia de Vestido
                Vestido ves = new Vestido(id, precio, nombre, "", "", "");
                VestidoDAO vesDAO = new VestidoDAO();
                vesDAO.modificarVestido(ves);

                // Modificar Pantalon
                Pantalon pan = new Pantalon("", "", "", id, precio, nombre);
                PantalonDAO panDAO = new PantalonDAO();
                panDAO.modificarPantalon(pan);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al convertir datos. Asegúrate de ingresar valores válidos.");
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jtVer1.getModel();
        int n = jtVer1.getRowCount() - 1;
        for (int i = 0; i <= n; i++) {
            dtm.removeRow(dtm.getRowCount() - 1);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla();
        PoleraDAO polDAO = new PoleraDAO();
        VestidoDAO vesDAO = new VestidoDAO();
        PantalonDAO panDAO = new PantalonDAO();
        String idText = txtID.getText();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido");
            return;
        }

        int id = Integer.parseInt(idText);

        try {
            Polera po = polDAO.buscarPolera(id);
            Vestido ve = vesDAO.buscarVestido(id);
            Pantalon pa = panDAO.buscarPantalon(id);

            if (po == null && ve == null && pa == null) { // No existe
                JOptionPane.showMessageDialog(this, "ID no encontrado o no ingresado");
            } else { // Existe
                DefaultTableModel dtm = (DefaultTableModel) jtVer1.getModel();
                String[] datos = new String[3];

                // Dependiendo de cuál objeto se encontró, asignar valores correspondientes
                if (po != null) {
                    datos[0] = String.valueOf(po.getId());
                    datos[1] = po.getNombre();
                    datos[2] = String.valueOf(po.getPrecio());
                } else if (ve != null) {
                    datos[0] = String.valueOf(ve.getId());
                    datos[1] = ve.getNombre();
                    datos[2] = String.valueOf(ve.getPrecio());
                } else if (pa != null) {
                    datos[0] = String.valueOf(pa.getId());
                    datos[1] = pa.getNombre();
                    datos[2] = String.valueOf(pa.getPrecio());
                }

                dtm.addRow(datos);
                jtVer1.setModel(dtm);
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción aquí
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMosPantalon;
    private javax.swing.JButton btnMosPolera;
    private javax.swing.JButton btnMosVestido;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtVer;
    private javax.swing.JTable jtVer1;
    private javax.swing.JMenu opSalir;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
