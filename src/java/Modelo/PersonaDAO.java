package Modelo;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {


    static PreparedStatement ps;
    static ResultSet rs;
    static Conexion c = new Conexion();
    static Connection con;

    public List listar() {
        List<Persona> lista = new ArrayList<>();
        String sql = "SELECT * FROM USUARIOS";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPri_ape(rs.getString(3));
                p.setSeg_ape(rs.getString(4));
                p.setCorreo(rs.getString(5));
                p.setCargo(rs.getString(6));
                p.setContra(rs.getString(7));
                p.setDir(rs.getString(8));
                lista.add(p);
            }
        } catch (SQLException e) {

        }
        return lista;
    }

    public int agregar(Persona p) {
        int r = 0;
        String sql = "INSERT INTO USUARIOS (ID_U, NOMBRE_U, APELLIDO_U, APELLIDO2_U, CORREO_U, CARGO_U, CONTRASENA_U, DIRECCION_U) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getPri_ape());
            ps.setString(4, p.getSeg_ape());
            ps.setString(5, p.getCorreo());
            ps.setString(6, p.getCargo());
            ps.setString(7, p.getContra());
            ps.setString(8, p.getDir());
            ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (Exception e) {

        }
        return r;
    }

    public static String validar(Persona p) {
        String cargo = "";
        String sql = "SELECT * FROM USUARIOS WHERE ID_U=? AND CONTRASENA_U=? AND CARGO_U=?";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getContra());
            ps.setString(3, p.getCargo());
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString("id"));
                p.setContra(rs.getString("contraseña"));
                p.setCargo(rs.getString("cargo"));
                if ((rs.getString("cargo").equals("1"))) {
                    cargo = "Enfermera";
                } else {
                    cargo = "Familiar";
                }
            }
            return cargo;
        } catch (Exception e) {
            return "";
        }
        
    }
    
    
    public static String validarCargoPrueba(Persona p) {
        String cargor = "";

        if (p.cargo.equalsIgnoreCase("1")) {
            cargor="Enfermera";
        }else{
            if (cargor.equalsIgnoreCase("2")) {
                cargor="Familiar";
            }else{
                cargor="Admin";
            }
        }
        return cargor; 
    }

    

    public Persona listarId(String id) {
        String sql = "SELECT ID_U, NOMBRE_U, APELLIDO_U, APELLIDO2_U, CORREO_U, CARGO_U, CONTRASENA_U, DIRECCION_U FROM USUARIOS WHERE ID_U=" + id;
        Persona p = new Persona();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPri_ape(rs.getString(3));
                p.setSeg_ape(rs.getString(4));
                p.setCorreo(rs.getString(5));
                p.setCargo(rs.getString(6));
                p.setContra(rs.getString(7));
                p.setDir(rs.getString(8));

            }
        } catch (Exception e) {
        }
        return p;
    }

    public int actualizar(Persona p) {
        int r = 0;
        String sql = "UPDATE USUARIOS SET ID_U =?, NOMBRE_U =?, APELLIDO_U =?, APELLIDO2_U =?, CORREO_U =?,CARGO_U =?, CONTRASENA_U =?, DIRECCION_U =? WHERE ID_U =?";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getPri_ape());
            ps.setString(4, p.getSeg_ape());
            ps.setString(5, p.getCorreo());
            ps.setString(6, p.getCargo());
            ps.setString(7, p.getContra());
            ps.setString(8, p.getDir());
            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (Exception e) {
        }
        return r;
    }

    public void eliminar(String id) {
        String sql = "DELETE FROM USUARIOS WHERE ID_U=" + id;
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
}
