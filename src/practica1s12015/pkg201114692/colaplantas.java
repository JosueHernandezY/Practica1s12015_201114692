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
public class colaplantas {

    planta primero, ultimo, aux1, aux2;

    public colaplantas() {
        this.aux1 = null;
        this.primero = null;
        this.ultimo = null;
    }

    public void incertar(planta nodo) {
        nodo.siguiente = null;
        if (primero == null) {
            primero = nodo;
            ultimo = nodo;
        } else {
            ultimo.siguiente = nodo;
            ultimo = nodo;
        }
    }

    public void extraer() {
        if (primero != null) {
            if (primero.siguiente != ultimo) {
                aux1 = primero.siguiente;
                aux2 = primero;
                primero = aux1;
            } else {
                aux1 = primero;
                primero = null;
                ultimo = null;
            }

        } else {
            JOptionPane.showMessageDialog(null, this, "No hay datos para eliminar", JOptionPane.WARNING_MESSAGE);
        }
    }

}
