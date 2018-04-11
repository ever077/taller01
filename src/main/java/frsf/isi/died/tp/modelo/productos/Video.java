package frsf.isi.died.tp.modelo.productos;

public class Video extends MaterialCapacitacion {
	
	public int duracion;
	public static Double costo=0.15;
	
	//CONSTRUCTORES 
	
	public Video() {
		super();
	}


	public Video(Integer id, String titulo) {
		super(id, titulo);
	}
	
	
	public Video(Integer id, String titulo, Double costo) {
		super(id, titulo, costo);
	}
	
	public Video(Integer id, String titulo, Double costo, int duracion) {
		super(id, titulo, costo);
		this.duracion = duracion;
	}
	
	//METODOS 
	
	public Boolean esLibro() {
		return false;
	}
	
	public Boolean esVideo() {
		return true;
	}
	

	
	public Double precio() {
		
		return (super.costo + (costo * duracion));
		
	}
	
	

	
	
}
