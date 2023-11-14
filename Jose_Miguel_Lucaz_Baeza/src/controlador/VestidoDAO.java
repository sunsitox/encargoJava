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
import modelo.Vestido;

/**
 *
 * @author el wn maricon
 */
public class VestidoDAO {

    public boolean ingresarVestido(Vestido ves) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into vestido (idVestido,tela,talla,diceño) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, ves.getId());
            ps.setString(2, ves.getTela());
            ps.setString(3, ves.getTalla());
            ps.setString(4, ves.getDiceno());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarVestido(Vestido ves) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "update pantalon set idVestido=?,tela=?,talla=?,diceño=? where idVestido=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, ves.getId());
            ps.setString(2, ves.getTela());
            ps.setString(3, ves.getTalla());
            ps.setString(4, ves.getDiceno());

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
            String query = "delete from vestido where idVestido=?";
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

    public ArrayList<Vestido> obtenerTodos() {
        ArrayList<Vestido> vest = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from vestido";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Vestido pa = null;
            while (rs.next()) {
                Vestido ve = new Vestido(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                vest.add(pa);

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vest;
    }

    public Vestido buscarPantalon(int id) {
        Vestido ves = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select * from vestido where idVestido=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ves = new Vestido(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ves;
    }
}
