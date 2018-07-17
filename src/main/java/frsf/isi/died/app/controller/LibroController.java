package frsf.isi.died.app.controller;

import java.util.ArrayList;

import frsf.isi.died.app.dao.MaterialCapacitacionDao;
import frsf.isi.died.app.dao.MaterialCapacitacionDaoDefault;
import frsf.isi.died.app.vista.material.LPanel;
import frsf.isi.died.app.vista.material.LibroPanel;
import frsf.isi.died.app.vista.material.LibroPanelModificacion;
import frsf.isi.died.tp.modelo.productos.Libro;

public class LibroController {

	private LPanel panelLibro;
	private MaterialCapacitacionDao materialDAO;
	
	public LibroController(LPanel panel) {
		this.panelLibro = panel;
		this.panelLibro.setController(this);
		materialDAO = new MaterialCapacitacionDaoDefault();
	}

	
	public void agregarLibro(String titulo,Double costo,Double precio,Integer paginas) {	
		Libro l = new Libro(0,titulo, costo, precio, paginas) ;
		materialDAO .agregarLibro(l);
		this.panelLibro.setListaLibros(materialDAO.listaLibros(),true);
	}
	
	public void crearPanel() {		
		this.panelLibro.setListaLibros(materialDAO.listaLibros(),false);
		this.panelLibro.construir();
	}
	
	

	public LPanel getPanelLibro() {
		return panelLibro;
	}

	public void setPanelLibro(LibroPanel panelLibro) {
		this.panelLibro = panelLibro;
	}
	
	public ArrayList getFilaSeleccionada() {
		return (panelLibro.getFilaSeleccionada());
	}
	 public void cargarCampos(ArrayList lista) {
		 panelLibro.cargarCampos(lista);
	 }
}
