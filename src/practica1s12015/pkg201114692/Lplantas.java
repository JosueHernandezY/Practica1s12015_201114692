/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015.pkg201114692;

import javax.swing.JOptionPane;

/**
 *
 * @author JB
 */
public class Lplantas {

    private planta inicio;
    private planta ultimo;//ultimo apuntador de la lista
    private planta aux;

    public Lplantas() {
        inicio = null;
        ultimo = null;
    }


    public void incertar_final(planta nuevo_nodo) {
        planta nuevo = nuevo_nodo;
        if (inicio == null) {
            this.inicio = nuevo;
            this.ultimo = nuevo;
        } else {
            nuevo.siguiente = null;
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void eliminar(int id) {
        planta auxiliar1, auxiliar2, aux3;
        if (inicio != null) {
            if (inicio.id == id) {
                auxiliar1 = inicio.siguiente;
                inicio = auxiliar1;

            } else {
                auxiliar1=inicio;
                while(auxiliar1.siguiente!=null){
                    if(auxiliar1.siguiente.id==id){
                        auxiliar2=auxiliar1.siguiente;
                        aux3=auxiliar2.siguiente;
                        auxiliar1.siguiente=aux3;
                        auxiliar2=null;
                    } else {
                        ultimo=auxiliar1;
                        ultimo.siguiente=null;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, this, "No hay datos para eliminar", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void buscar(int id) {
        planta auxiliar;
        if (inicio != null) {
            auxiliar = inicio;
            while (auxiliar != null) {
                if (auxiliar.id == id) {
                    aux = auxiliar;
                } else {
                    auxiliar = auxiliar.siguiente;
                }
            }
        }
    }
    

}
