package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Vestido;

public class VestidoDAO {

    public boolean ingresarVestido(Vestido ves) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into vestido (idVestido,tela,talla,diceno) values(?,?,?,?)";
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
            String query = "update vestido set idVestido=?,tela=?,talla=?,diceno=? where idVestido=?";
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

    public boolean eliminarVestido(int id) {
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

    public int contarVestido() {
        try {
            Connection con = Conexion.getConexion();
            String sql = "SELECT COUNT(ves.idVestido) FROM vestido ves";
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
