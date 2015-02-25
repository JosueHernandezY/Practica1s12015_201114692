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
public class zombie {

    String nombre, imagen;
    int pv, pa, id;
    int ta;//tipo de ataque 0 directo, 1 distancia.

    int largolista;
    zombie siguiente;

    public zombie(String nombre, String imagen, int pv, int pa, int id, int ta) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.id = id;
        this.pa = pa;
        this.pv = pv;
        this.ta = ta;
        siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTa() {
        return ta;
    }

    public void setTa(int ta) {
        this.ta = ta;
    }

    public int getLargolista() {
        return largolista;
    }

    public void setLargolista(int largolista) {
        this.largolista = largolista;
    }

    public zombie getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(zombie siguiente) {
        this.siguiente = siguiente;
    }
    
    

}
