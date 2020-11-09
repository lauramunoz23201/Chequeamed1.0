package PruebasUnitarias;

import Modelo.Persona;
import Modelo.PersonaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class PUnitariaValidarCargo {

    public PUnitariaValidarCargo() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void validarCargo() {
        //Validar si el cargo es Enfermera o Familiar
        PersonaDAO xdao = new PersonaDAO();
        Persona uPrueba = new Persona();
        
        uPrueba.setId("idPrueba");
        uPrueba.setNom("nomPrueba");
        uPrueba.setPri_ape("priapePrueba");
        uPrueba.setSeg_ape("segapePrueba");
        uPrueba.setCorreo("correoPrueba");
        uPrueba.setCargo("1");
        uPrueba.setContra("contraPrueba");
        uPrueba.setDir("dirPrueba");


        String esperado = "Enfermera";

        String resultado = Modelo.PersonaDAO.validarCargoPrueba(uPrueba);
        
        System.out.println(""+resultado);

        assertEquals(esperado, resultado);


    }
    

}
