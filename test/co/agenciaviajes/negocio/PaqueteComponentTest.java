
package co.agenciaviajes.negocio;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Libardo, Ricardo, Julio
 */
public class PaqueteComponentTest {
    
    public PaqueteComponentTest() {
    }

    /**
     * Test Europa
     */
    @Test
    public void testEuropa() throws Exception {
        System.out.println("Test Europa");
        PaqueteComponent principal = new RegionComponent("Europa");
        PaqueteComponent pais1 = new RegionComponent("Italia");
        PaqueteComponent pais2 = new RegionComponent("Francia");
        PaqueteComponent pais3 = new RegionComponent("España");

        PaqueteComponent ciudad1 = new CiudadComponent("Roma", 1000000);
        PaqueteComponent ciudad2 = new CiudadComponent("Paris", 2000000);
        PaqueteComponent ciudad3 = new CiudadComponent("Madrid", 3000000);
        PaqueteComponent ciudad4 = new CiudadComponent("Valencia", 2000000);

        principal.addComponent(pais1);
        principal.addComponent(pais2);
        principal.addComponent(pais3);

        pais1.addComponent(ciudad1);
        pais2.addComponent(ciudad2);
        pais3.addComponent(ciudad3);
        pais3.addComponent(ciudad4);
        
        assertEquals("Europa", principal.getNombre());
        assertEquals("Italia", pais1.getNombre());
        assertEquals("Francia", pais2.getNombre());
        assertEquals("España", pais3.getNombre());
  
    }
    
     /**
     * Test Medio Oriente
     */
    @Test
    public void testMedioOriente () throws Exception {
        System.out.println("Test Medio Oriente");
        PaqueteComponent principal2 = new RegionComponent("Medio Oriente");
        PaqueteComponent pais4 = new RegionComponent("Iran");
        PaqueteComponent pais5 = new RegionComponent("Israel");
        PaqueteComponent pais6 = new RegionComponent("Turquia");

        PaqueteComponent ciudad5 = new CiudadComponent("Teheran", 1500000);
        PaqueteComponent ciudad6 = new CiudadComponent("Jerusalen", 4400000);
        PaqueteComponent ciudad7 = new CiudadComponent("Tel Avic", 6700000);
        PaqueteComponent ciudad8 = new CiudadComponent("Ankara", 8900000);

        principal2.addComponent(pais4);
        principal2.addComponent(pais5);
        principal2.addComponent(pais6);

        pais4.addComponent(ciudad5);
        pais5.addComponent(ciudad6);
        pais5.addComponent(ciudad7);
        pais6.addComponent(ciudad8);
        
        assertEquals("Medio Oriente", principal2.getNombre());
        assertEquals("Iran", pais4.getNombre());
        assertEquals("Israel", pais5.getNombre());
        assertEquals("Turquia", pais6.getNombre());
  
    }
        
     
}
