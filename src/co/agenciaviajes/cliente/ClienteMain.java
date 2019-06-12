package co.agenciaviajes.cliente;

import co.agenciaviajes.negocio.CiudadComponent;
import co.agenciaviajes.negocio.RegionComponent;
import co.agenciaviajes.negocio.PaqueteComponent;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class ClienteMain {

    public static void main(String[] args) throws Exception {
        // Ejemplo de un paquete a Europa, que visitará tres paises: Italia, España y Francia
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
        
        //Medio Oriente
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

        // El cliente se refiere tanto a los componentes compuestos, como a los individuales, de manera uniforme
        System.out.println(" Región = "
                + principal.getNombre() + " " + principal.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 1 = "
                + pais1.getNombre() + " " + pais1.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 2 = "
                + pais2.getNombre() + " " + pais2.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 3 = "
                + pais3.getNombre() + " " + pais3.getComponentPrecio() + " Pesos");
        
        //Medio Oriente
          System.out.println(" Región = "
                + principal2.getNombre() + " " + principal2.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 4 = "
                + pais4.getNombre() + " " + pais4.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 5 = "
                + pais5.getNombre() + " " + pais5.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 6 = "
                + pais6.getNombre() + " " + pais6.getComponentPrecio() + " Pesos");

        // Si se requiere, personalizar los datos:
//        ((CiudadComponent) ciudad1).setHotel(new Hotel("Hotel Italia"));
//        String tours[] = {"Coliseo de Roma", "Basilica San Pedro", "Panteon de Roma"};
//        ((CiudadComponent) ciudad1).setCityTour(new CityTour(tours));
//
//        String alimentacion[] = {"Desayuno ejecutivo", "Almuerzo a la carta", "No incluye cena"};
//        ((CiudadComponent) ciudad1).setPlanAlimentacion(new PlanAlimentacion(alimentacion));
//
//        try {
//            ((CiudadComponent) ciudad1).setVuelo(new Vuelo("Avianca", new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("05/06/2019 10:30"), new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("07/06/2019 13:30")));
//        } catch (ParseException ex) {
//            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        CiudadComponent ciu = (CiudadComponent) ciudad1;
//        System.out.println("Ciudad: " + ciu.getNombre() + ", " 
//                + ciu.getHotel().getNombre() + ", " 
//                + Arrays.toString(ciu.getPlanAlimentacion().getAlimentacion()) + "' "
//                + Arrays.toString(ciu.getCityTour().getTours()) + ", " 
//                + ciu.getVuelo().getAerolinea() + ", "
//                + ciu.getVuelo().getFechaHoraLlegada().toString() + ", "
//                + ciu.getVuelo().getFechaHoraSalida().toString() + ", "
//        );
    }
}
