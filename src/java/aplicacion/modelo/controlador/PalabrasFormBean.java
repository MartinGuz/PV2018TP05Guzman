/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Elena
 */
@ManagedBean
@ViewScoped
public class PalabrasFormBean {
    private ArrayList<String> listadoPalabras;
    private String palabraIngresada;

    public PalabrasFormBean(ArrayList<String> listadoPalabras, String palabraIngresada) {
        this.listadoPalabras = listadoPalabras;
        this.palabraIngresada = palabraIngresada;
    }

   
    public PalabrasFormBean(ArrayList<String> listadoPalabras) {
        this.listadoPalabras = listadoPalabras;
    }
    /**
     * Creates a new instance of PalabrasFormBean
     */
    public PalabrasFormBean() {
        listadoPalabras=new ArrayList();
    }

    /**
     * @return the listadoPalabras
     */
    public ArrayList<String> getListadoPalabras() {
        return listadoPalabras;
    }

    /**
     * @param listadoPalabras the listadoPalabras to set
     */
    public void setListadoPalabras(ArrayList<String> listadoPalabras) {
        this.listadoPalabras = listadoPalabras;
    }
    public void agregarPalabra(){
        getListadoPalabras().add(palabraIngresada);
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }
    public void reiniciar()
    {
        listadoPalabras = new ArrayList();
        
    }
}
