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
public class pilazombies {

    zombie cima, aux, aux2;

    public pilazombies() {
        this.cima = null;
        this.aux = null;
        this.aux2 = null;
    }

    public boolean pilavacia() {
        return cima == null;
    }

    public void incertar(zombie nodo) {
        if (cima != null) {
            nodo.siguiente = null;
            cima = nodo;
        } else {
            nodo.siguiente = cima;
            cima = nodo;
        }
    }

    public void extraer() {
        if (cima != null) {
            aux2 = cima.siguiente;
            aux = cima;
            cima = aux2;
        } else {
            JOptionPane.showMessageDialog(null, this, "No hay datos para eliminar", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
