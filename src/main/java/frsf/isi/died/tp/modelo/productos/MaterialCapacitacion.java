/** @author 
  	Guido D'Antoni  
  	Ever Godoy
  	Axel Bellmann
  	
  	URL proyecto clonado: https://github.com/ever077/taller01.git
  
*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frsf.isi.died.tp.modelo.productos;

import java.util.ArrayList;

import frsf.isi.died.tp.util.Ordenable;

/**
 * Representa de manera abstracta los materiales de capacitación
 * 
 * @author mdominguez
 */
public abstract class MaterialCapacitacion implements Ordenable, Comparable<MaterialCapacitacion>{
	protected Integer id;
	/**
	 * Titulo del material
	 */
	protected String titulo;

	/**
	 * Costo básico que debe sumarse al precio por el mero hecho de publicarlo en el
	 * portal
	 */
	protected Double costo;
	

	/**
	 * Constructor por defecto
	 */
	public MaterialCapacitacion() {
		this(0,"en desarrollo",0.0);
	}

	/**
	 * Constructor que recibe como argumento un ID y un Titulo
	 * 
	 * @param id
	 * @param titulo
	 */
	public MaterialCapacitacion(Integer id, String titulo) {
		this(id,titulo,0.0);
	}

	/**
	 * Constructor que recibe como argumento un ID y un costo
	 * 
	 * @param id
	 * @param titulo
	 */
	public MaterialCapacitacion(Integer id,String titulo, Double costo) {
		this.id =id;
		this.titulo = titulo;
		this.costo = costo;
	}


	//TODO 01 implementar los metodos getters y setters y escribir el javadoc
	// AYUDA: para implementar estos metodos usar un atajo del IDE 
	// elegir el menu "Source" --> "Generate getters y setters" y elegir alli que metodos generar.
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	/**
	 * El precio de un material se define según el tipo del material y toma como
	 * base el costo del mismo
	 * 
	 * @return
	 */
	public abstract Double precio();
	
	/**
	 * Retorna verdadero si es una instancia de libro, falso en caso contrario
	 * @return
	 */
	public abstract Boolean esLibro();

	/**
	 * Retorna verdadero si es una instancia de video, falso en caso contrario
	 * @return
	 */
	public abstract Boolean esVideo();
	
	//TODO 02: sobrescribir el metodo toString de la clase "Object"
	//	el método toString retorna un string que representa el material actual
	//  retornando el titulo, y el precio 	 * usando el formato : 
	// [Titulo: <titulo> ; Precio: <precio> ]
	
	public String toString() {
		
		return "titulo : " + this.titulo + " Precio : " + this.precio();
				
	}
	
	// TODO 10: implementar Ordenable
	
	public final int valor() {
		double aux = precio();
		return (int)aux; 
	}
	// RESPUESTA: como Libro y Video son una especializacion de materialCapacitacion, simpre se crean instancias de
	//Libro y Video, entonces el metodo precio() es siempre ejecutado por una de estas 2 instancias
	
	public boolean equals(Object m) {
		if(m instanceof MaterialCapacitacion && this.titulo.equalsIgnoreCase(((MaterialCapacitacion) m).getTitulo())) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(MaterialCapacitacion arg0) {
		// TODO Auto-generated method stub
		int aux = this.titulo.compareTo(arg0.getTitulo());
		if(aux == 0){
			return this.precio().compareTo(arg0.precio());
			
		}else{
			return aux;
		}
	}
	
}
