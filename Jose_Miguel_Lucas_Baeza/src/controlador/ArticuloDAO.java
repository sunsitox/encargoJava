
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Articulo;


public class ArticuloDAO {

    public boolean ingresarArticulo(Articulo ar) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into articulo (id,precio,nombre) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, ar.getId());
            ps.setInt(2, ar.getPrecio());
            ps.setString(3, ar.getNombre());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarArticulo(Articulo ar) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "update articulo set id=?, precio=?, nombre=? where id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, ar.getId());
            ps.setInt(2, ar.getPrecio());
            ps.setString(3, ar.getNombre());
            ps.setInt(4, ar.getId());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarAlumno(int id) {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "delete from articulo where id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<Articulo> obtenerTodos() {
        ArrayList<Articulo> arti = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from articulo";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Articulo ar;
            while (rs.next()) {
                ar = new Articulo(rs.getInt(1), rs.getInt(2), rs.getString(3));
                arti.add(ar);

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arti;
    }

    public Articulo buscarArticulo(int id) {
        Articulo art = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select * from articulo where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id); // Establecer el valor del parámetro id
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                art = new Articulo(rs.getInt(1), rs.getInt(2), rs.getString(3));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArticuloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return art;
    }
    
    public int contarArticulos() {
                try {
                    Connection con = Conexion.getConexion();
                    String sql = "SELECT COUNT(art.id) FROM articulo art";
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
