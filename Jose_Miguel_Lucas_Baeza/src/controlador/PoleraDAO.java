package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Polera;

public class PoleraDAO {

    public boolean ingresarPolera(Polera pol) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into polera (idPolera,nombre,talla,material,color,precio) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pol.getId());
            ps.setString(2, pol.getNombre());
            ps.setString(3, pol.getTalla());
            ps.setString(4, pol.getMaterial());
            ps.setString(5, pol.getColor());
            ps.setInt(6, pol.getPrecio());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarPolera(Polera pol) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "update polera set nombre=?, precio=? where idPolera=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, pol.getNombre());
            ps.setInt(2, pol.getPrecio());
            ps.setInt(3, pol.getId());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarPolera(int id) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "delete from polera where idPolera=?";
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

    public Polera buscarPolera(int id) {
        Polera pol = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select * from polera where idPolera=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pol = new Polera(rs.getInt(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(2));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pol;
    }

    public int contarPolera() {
        try {
            Connection con = Conexion.getConexion();
            String sql = "SELECT COUNT(pol.idPolera) FROM polera pol";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
