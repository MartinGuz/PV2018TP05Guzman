/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import java.io.Serializable;

/**
 *
 * @author Elena
 */
public class ListadoPalabras implements Serializable {

    private String[] listaPalabras;

    public ListadoPalabras(String[] listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    public ListadoPalabras() {
        listaPalabras = new String[20];
    }

    /**
     * @return the listaPalabras
     */
    public String[] getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(String[] listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

}
