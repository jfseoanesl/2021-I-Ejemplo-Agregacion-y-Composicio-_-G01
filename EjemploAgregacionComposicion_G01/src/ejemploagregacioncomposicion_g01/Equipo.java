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
public class Equipo {
    private String nombre, ciudadOrigen, nombreTecnico;
    private int nInscripcion;
    public static final int N_MAX_JUGADORES=6;
    private Jugador jugadoresInscritos[];
    private int n;
    
    public Equipo(){
        this.jugadoresInscritos = new Jugador[Equipo.N_MAX_JUGADORES];
        this.n=0;
    }
    
    public Equipo(String n, String c, String t, int i){
        this();
        this.nombre=n;
        this.ciudadOrigen=c;
        this.nombreTecnico=t;
        this.nInscripcion=i;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ciudadOrigen
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * @param ciudadOrigen the ciudadOrigen to set
     */
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * @return the nombreTecnico
     */
    public String getNombreTecnico() {
        return nombreTecnico;
    }

    /**
     * @param nombreTecnico the nombreTecnico to set
     */
    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    /**
     * @return the nInscripcion
     */
    public int getnInscripcion() {
        return nInscripcion;
    }

    /**
     * @param nInscripcion the nInscripcion to set
     */
    public void setnInscripcion(int nInscripcion) {
        this.nInscripcion = nInscripcion;
    }

    /**
     * @return the jugadoresInscritos
     */
    public Jugador[] getJugadoresInscritos() {
        return jugadoresInscritos;
    }

    /**
     * @param jugadoresInscritos the jugadoresInscritos to set
     */
    public void setJugadoresInscritos(Jugador[] jugadoresInscritos) {
        this.jugadoresInscritos = jugadoresInscritos;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
    
    public boolean inscribirJugador(String nombre, String pos, int e){
        if(this.n<Equipo.N_MAX_JUGADORES){
             Jugador j = new Jugador(nombre, pos, e);
             this.jugadoresInscritos[this.n]=j;
             this.n++;
             return true;
        }
        else{
            return false;
        }
        
    }
    
}
