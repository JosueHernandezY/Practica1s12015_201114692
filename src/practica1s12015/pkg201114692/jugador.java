/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015.pkg201114692;

/**
 *
 * @author JB
 */
public class jugador {
    String nombre;
    int largolista;
    boolean tipo;
    jugador siguiente;
    Lplantas misplantas=new Lplantas();
    Lzombies miszombies=new Lzombies();
    
    public jugador(String nombre,int largo,boolean tipo){
        this.nombre=nombre;
        this.largolista=largo;
        this.tipo=tipo;
        this.siguiente=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLargolista() {
        return largolista;
    }

    public void setLargolista(int largolista) {
        this.largolista = largolista;
    }

    public jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(jugador siguiente) {
        this.siguiente = siguiente;
    }

    public Lplantas getMisplantas() {
        return misplantas;
    }

    public void setMisplantas(Lplantas misplantas) {
        this.misplantas = misplantas;
    }

    public Lzombies getMiszombies() {
        return miszombies;
    }

    public void setMiszombies(Lzombies miszombies) {
        this.miszombies = miszombies;
    }
    
    
}
