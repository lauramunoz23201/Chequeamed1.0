/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnitarias;

import Modelo.Persona;
import Modelo.PersonaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LAURA HENAO
 */
public class PUnitariaCargo {
    
    public PUnitariaCargo() {
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

    @Test
    public void validarCargo2() {
        //Validar si el cargo es Enfermera o Familiar
        PersonaDAO xdao2 = new PersonaDAO();
        Persona uPrueba2 = new Persona();
        
        uPrueba2.setId("idPrueba");
        uPrueba2.setNom("nomPrueba");
        uPrueba2.setPri_ape("priapePrueba");
        uPrueba2.setSeg_ape("segapePrueba");
        uPrueba2.setCorreo("correoPrueba");
        uPrueba2.setCargo("1");
        uPrueba2.setContra("contraPrueba");
        uPrueba2.setDir("dirPrueba");


        String esperado = "Enfermera";

        String resultado = Modelo.PersonaDAO.validarCargoPrueba(uPrueba2);
        
        System.out.println(""+resultado);

        assertEquals(esperado, resultado);


    }
}
