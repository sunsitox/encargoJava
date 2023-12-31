package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pantalon;

public class PantalonDAO {

    public boolean ingresarPantalon(Pantalon pan) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into pantalon (idPantalon,nombre,talla,material,color,precio) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pan.getId());
            ps.setString(2, pan.getNombre());
            ps.setString(3, pan.getTalla());
            ps.setString(4, pan.getMaterial());
            ps.setString(5, pan.getColor());
            ps.setInt(6, pan.getPrecio());

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
            String query = "update pantalon set nombre=?, precio=? where idPantalon=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, pan.getNombre());
            ps.setInt(2, pan.getPrecio());
            ps.setInt(3, pan.getId());

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

    public Pantalon buscarPantalon(int id) {
        Pantalon pan = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select * from pantalon where idPantalon=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                pan = new Pantalon(rs.getString(5), rs.getString(3), rs.getString(4), rs.getInt(1), rs.getInt(6), rs.getString(2));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pan;
    }

    public int contarPantalon() {
        try {
            Connection con = Conexion.getConexion();
            String sql = "SELECT COUNT(pan.idPantalon) FROM pantalon pan";
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
