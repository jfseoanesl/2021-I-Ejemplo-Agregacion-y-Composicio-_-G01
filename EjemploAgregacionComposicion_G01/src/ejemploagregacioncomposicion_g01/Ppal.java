/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploagregacioncomposicion_g01;

/**
 *
 * @author jairo
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creacion objetos de tipo equipo
        System.out.println("Creacion de objetos equipos: ");
        Equipo junior = new Equipo("Junior", "Barranquilla", "Amaranto perea", 123);
        Equipo nacional = new Equipo("Nacional", "Medellin", "Guimaraes", 234);
        Equipo cucuta = new Equipo("Cucuta D", "Cucuta", "Pepito Perez", 456);
        Equipo boca = new Equipo("Boca Junior", "Buenos Aires", "Miguel Ruso", 567);
        Equipo barca = new Equipo("Barcelona", "Barcelona", "Koeman", 678);
        Equipo real = new Equipo("Real MAdrid", "Madrid", "Zidane", 789);
        
        // Creacion de objeto campeonato
        Campeonato liga = new Campeonato();
        
        // Registro de equipos en campeonato ( Solo permite 5 equipos)
        System.out.println("\n\nInscripcion de equipos al campeonato: ");
        inscribirEquipo(liga, junior);
        inscribirEquipo(liga, nacional);
        inscribirEquipo(liga, cucuta);
        inscribirEquipo(liga, boca);
        inscribirEquipo(liga, barca);
        inscribirEquipo(liga, real);
        
        // inscribe jugadores en un equipo (Solo permite 6 jugadores)
        System.out.println("\n\nInscripcion de jugadores a equipo: ");
        inscribirJugador(junior, "Sebastian Viera", "Portero", 35);
        inscribirJugador(junior, "Teofilo Gutierrez", "Delantero", 33);
        inscribirJugador(junior, "Miguel Borja", "Delantero", 29);
        inscribirJugador(junior, "EL pibe valderrama", "Volante", 50);
        inscribirJugador(junior, "Victor Pacheco", "Volante", 48);
        inscribirJugador(junior, "Ivan Valenciano", "Delantero", 45);
        inscribirJugador(junior, "Edwin Velasco", "Defensa", 32);
        
        // Busca e imprime la nomina de Jugadores de un equipo del campeonato
        // El equipo de busca a traves del codigo de inscripcion
        System.out.println("\n\nBusqueda de equipo inscrito en campeonato:");
        nominaJugadores(liga, 123);
        
    }
    
    public static void nominaJugadores(Campeonato c, int nInscripcion){
        Equipo e = c.buscarEquipoInscrito(nInscripcion);
        if(e!=null){//esta inscrito en el campeonato
            System.out.println("Datos del equipo: ");
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Ciudad Origen: " + e.getCiudadOrigen());
            System.out.println("Tecnico: " + e.getNombreTecnico());
            System.out.println("Nomina de Jugadores: ");
            System.out.println("--------------------------------------------------------");
            imprimirNominaJugadores(e);
        }
        else{
            System.out.println("No se encuentra el numero de inscripcion..");
        }
    
    }
    
    public static void imprimirNominaJugadores(Equipo e){
        System.out.printf("%-20s   %-20s   %s\n", "Nombre Jugador", "Posicion", "Edad");
        System.out.println("--------------------------------------------------------");
        for(int i=0; i<e.getN();i++){
            Jugador j = e.getJugadoresInscritos()[i];
            System.out.printf("%-20s   %-20s   %d\n"
                              ,j.getNombre()
                              , j.getPosicion()
                              , j.getEdad());
        }
    }
    
    public static void inscribirJugador(Equipo e, String n, String p, int ed){
        if(e.inscribirJugador(n, p, ed)){
            System.out.printf("Jugador %s inscrito con exito en %s\n"
                              ,n
                              ,e.getNombre());
        }
        else{
            System.out.printf("Sin cupos para inscribir a %s en %s\n"
                              ,n
                              ,e.getNombre());
        }
        
    }
    
    public static void inscribirEquipo(Campeonato c, Equipo e){
        if(c.inscribirEquipo(e)){
            System.out.printf("%s inscrito exitosamente, quedad %d cupos\n"
                             ,e.getNombre(), c.getN_MAX_EQUIPOS() - c.getN());
        }
        else{
            System.out.printf("No es posible inscribir a %s, limite de equipos cumplido\n"
                              , e.getNombre());
        }
    }
    
}
