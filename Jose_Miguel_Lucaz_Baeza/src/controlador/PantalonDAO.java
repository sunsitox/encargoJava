/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pantalon;

/**
 *
 * @author José Miguel
 */
public class PantalonDAO {

    public boolean ingresarPantalon(Pantalon pan) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into pantalon (idPantalon,talla,material,color) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pan.getId());
            ps.setString(2, pan.getTalla());
            ps.setString(3, pan.getMaterial());
            ps.setString(4, pan.getColor());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarPantalon(Pantalon pan) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "update pantalon set idPantalon=?,talla=?,material=?,color=? where idPantalon=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pan.getId());
            ps.setString(2, pan.getTalla());
            ps.setString(3, pan.getMaterial());
            ps.setString(4, pan.getColor());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarPantalon(int id) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "delete from pantalon where idPantalon=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<Pantalon> obtenerTodos() {
        ArrayList<Pantalon> pant = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from pantalon";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Pantalon pa;
            while (rs.next()) {
                pa = new Pantalon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                pant.add(pa);

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pant;
    }

    public Pantalon buscarPantalon(int id) {
        Pantalon pan = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select * from pantalon where idPantalon=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pan = new Pantalon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pan;
    }
}
