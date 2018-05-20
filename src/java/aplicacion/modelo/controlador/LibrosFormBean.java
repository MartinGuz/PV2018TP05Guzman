/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.controlador;

import aplicacion.modelo.datos.ListadoLibros;
import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elena
 */
@ManagedBean
@RequestScoped
public class LibrosFormBean implements Serializable {

    private ListadoLibros listadoLibro;
    private ListadoLibros listadoaux;
    private Libro libroIngresado;
    private String autor;
    private String nombre;

    public LibrosFormBean(ListadoLibros listadoLibros, Libro libroIngresado, String autor, String nombre) {
        this.listadoLibro = listadoLibros;
        this.libroIngresado = libroIngresado;
        this.autor = autor;
        this.nombre = nombre;
    }

    /**
     * Creates a new instance of LibrosFormBean
     */
    public LibrosFormBean() {
        listadoLibro = new ListadoLibros();
        listadoaux = new ListadoLibros();
    }

    
    /**
     * @return the listadoLibros
     */
    public ListadoLibros getListadoLibros() {
        return getListadoLibro();
    }

    /**
     * @param listadoLibros the listadoLibros to set
     */
    public void setListadoLibros(ListadoLibros listadoLibros) {
        this.setListadoLibro(listadoLibros);
    }

    /**
     * @return the libroIngresado
     */
    public Libro getLibroIngresado() {
        return libroIngresado;
    }

    /**
     * @param libroIngresado the libroIngresado to set
     */
    public void setLibroIngresado(Libro libroIngresado) {
        this.libroIngresado = libroIngresado;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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
   
    public void agregarLibro() {
          libroIngresado.setAutor(autor);
          libroIngresado.setNombre(nombre);
          getListadoLibros().getListadoLibros().add(libroIngresado);
    }

    public void reiniciar(){
        setListadoLibro(new ListadoLibros());
    }

    /**
     * @return the listadoLibro
     */
    public ListadoLibros getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ListadoLibros listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    /**
     * @return the listadoaux
     */
    public ListadoLibros getListadoaux() {
        return listadoaux;
    }

    /**
     * @param listadoaux the listadoaux to set
     */
    public void setListadoaux(ListadoLibros listadoaux) {
        this.listadoaux = listadoaux;
    }
}

