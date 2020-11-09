
package Modelo;

public class Persona {

    String id;
    String nom;
    String pri_ape;
    String seg_ape;
    String correo;
    String cargo;
    String contra;
    String dir;

    public Persona() {

    }

    public Persona(String id, String nom, String pri_ape, String seg_ape, String correo, String cargo, String contra, String dir) {
        this.id = id;
        this.nom = nom;
        this.pri_ape = pri_ape;
        this.seg_ape = seg_ape;
        this.correo = correo;
        this.cargo = cargo;
        this.contra = contra;
        this.dir = dir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPri_ape() {
        return pri_ape;
    }

    public void setPri_ape(String pri_ape) {
        this.pri_ape = pri_ape;
    }

    public String getSeg_ape() {
        return seg_ape;
    }

    public void setSeg_ape(String seg_ape) {
        this.seg_ape = seg_ape;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
    
    

}