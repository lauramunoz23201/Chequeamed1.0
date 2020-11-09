package Modelo;

public class Paciente {
   String id_p;
    String nom_p;
    String pri_ape_p;
    String seg_ape_p;
    String sexo;
    String fecha;

    public Paciente() {
    }

    public Paciente(String id_p, String nom_p, String pri_ape_p, String seg_ape_p, String sexo, String fecha) {
        this.id_p = id_p;
        this.nom_p = nom_p;
        this.pri_ape_p = pri_ape_p;
        this.seg_ape_p = seg_ape_p;
        this.sexo = sexo;
        this.fecha = fecha;
    }

    public String getId_p() {
        return id_p;
    }

    public void setId_p(String id_p) {
        this.id_p = id_p;
    }

    public String getNom_p() {
        return nom_p;
    }

    public void setNom_p(String nom_p) {
        this.nom_p = nom_p;
    }

    public String getPri_ape_p() {
        return pri_ape_p;
    }

    public void setPri_ape_p(String pri_ape_p) {
        this.pri_ape_p = pri_ape_p;
    }

    public String getSeg_ape_p() {
        return seg_ape_p;
    }

    public void setSeg_ape_p(String seg_ape_p) {
        this.seg_ape_p = seg_ape_p;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
