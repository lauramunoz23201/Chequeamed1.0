package Modelo;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    public List listar() {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM PACIENTES";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Paciente p = new Paciente();
                p.setId_p(rs.getString(1));
                p.setNom_p(rs.getString(2));
                p.setPri_ape_p(rs.getString(3));
                p.setSeg_ape_p(rs.getString(4));
                p.setSexo(rs.getString(5));
                p.setFecha(rs.getString(6));
                lista.add(p);
            }
        } catch (SQLException e) {

        }
        return lista;
    }

    public int agregar(Paciente pa) {
        int r = 0;
        String sql = "INSERT INTO PACIENTES (ID_P,NOMBRE_P,APELLIDO_P,APELLIDO2_P,SEXO_P,FECHA_NAC_P) VALUES (?,?,?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pa.getId_p());
            ps.setString(2, pa.getNom_p());
            ps.setString(3, pa.getPri_ape_p());
            ps.setString(4, pa.getSeg_ape_p());
            ps.setString(5, pa.getSexo());
            ps.setString(6, pa.getFecha());
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

    public Paciente listarId(String id) {
        String sql = "SELECT ID_P,NOMBRE_P,APELLIDO_P,APELLIDO2_P,SEXO_P,FECHA_NAC_P FROM PACIENTES WHERE ID_P=" + id;
        Paciente pa = new Paciente();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pa.setId_p(rs.getString(1));
                pa.setNom_p(rs.getString(2));
                pa.setPri_ape_p(rs.getString(3));
                pa.setSeg_ape_p(rs.getString(4));
                pa.setSexo(rs.getString(5));
                pa.setFecha(rs.getString(6));

            }
        } catch (Exception e) {
        }
        return pa;
    }

    public int actualizar(Paciente pa) {
        int r = 0;
        String sql = "UPDATE PACIENTES SET ID_P=?,NOMBRE_P=?,APELLIDO_P=?,APELLIDO2_P=?,SEXO_P=?,FECHA_NAC_P=? FROM PACIENTES WHERE ID_P =?";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pa.getId_p());
            ps.setString(2, pa.getNom_p());
            ps.setString(3, pa.getPri_ape_p());
            ps.setString(4, pa.getSeg_ape_p());
            ps.setString(5, pa.getSexo());
            ps.setString(6, pa.getFecha());
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
        String sql = "DELETE FROM PACIENTES WHERE ID_P=" + id;
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
}
