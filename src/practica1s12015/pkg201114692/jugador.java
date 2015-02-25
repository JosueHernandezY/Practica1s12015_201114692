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
    jugador siguiente;
    Lplantas misplantas;
    Lzombies miszombies;
    
    public jugador(String nombre,int largo,jugador siguiente,Lplantas misplantas,Lzombies miszombies){
        this.nombre=nombre;
        this.largolista=largo;
        this.siguiente=null;
        this.misplantas=misplantas;
        this.miszombies=miszombies;  
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
