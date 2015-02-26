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
public class Lusuarios {

    private jugador inicio;
    private jugador siguiente;
    private jugador aux;

    public Lusuarios() {
        inicio = null;
        siguiente = null;
        aux = null;
    }

    public boolean lisatavacia() {
        return inicio == null;
    }

    public void incertar_final(jugador nuevo_nodo) {
        jugador nuevo = nuevo_nodo;
        if (inicio == null) {
            this.inicio = nuevo;
            this.siguiente = nuevo;
            nuevo.siguiente = nuevo;
        } else {
            nuevo.siguiente = null;
            siguiente.siguiente = nuevo;
            siguiente = nuevo;
        }
    }

    public void buscar(String nombre) {
        jugador auxiliar;
        if (inicio != null) {
            auxiliar = inicio;
            while (auxiliar != null) {
                if (auxiliar.nombre.equals(nombre)) {
                    aux = auxiliar;
                } else {
                    auxiliar = auxiliar.getSiguiente();
                }
            }
        }
    }

    public jugador extrar_por_tipo(boolean tipo) {
        jugador auxiliar;
        if (inicio != null) {
            auxiliar = inicio;
            while (auxiliar != null) {
                if (auxiliar.tipo == tipo) {
                    return auxiliar;
                } else {
                    auxiliar = auxiliar.getSiguiente();
                }
            }
        }
        return null;
    }

    public void eliminar_todo() {
        if (inicio != null) {
            inicio = null;
            siguiente = null;
        } else {
            JOptionPane.showMessageDialog(null, this, "No hay datos para eliminar", JOptionPane.WARNING_MESSAGE);
        }
    }

  public void remplazar(jugador actual) {
        jugador auxiliar1, auxiliar2, aux3;
        if (inicio != null) {
            if (actual.nombre.equals(inicio.nombre)) {
                auxiliar1 = inicio.siguiente;
                inicio = actual;
                inicio.siguiente=auxiliar1;
            } else {
                auxiliar1=inicio;
                while(auxiliar1.siguiente!=null){
                    if(auxiliar1.siguiente.nombre.equals(actual.nombre)){
                        auxiliar2=auxiliar1.siguiente;
                        aux3=auxiliar2.siguiente;
                        actual.siguiente=aux3;
                        auxiliar1.siguiente=actual;
                    } 
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, this, "No se puede remplazar el nodo", JOptionPane.WARNING_MESSAGE);
        }
    }
}
