package frsf.isi.died.app.vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import frsf.isi.died.app.controller.TiposAcciones;
import frsf.isi.died.app.controller.MenuController;

public class Principal {
	private static JMenuItem menuItem_1;
	public static void main(String[] args) {
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          createAndShowGUI();
	        }
	    });
	}

	 private static void createAndShowGUI() {
		 JFrame f = new JFrame();
		 MenuController controller = new MenuController(f);
				    
	        JMenuBar menuBar;
	        JMenu menu;
	        JMenuItem menuItem;

	        menuBar = new JMenuBar();

	        menu = new JMenu("Sistema");
	        menuBar.add(menu);
	        
	        JMenu MenuLibro = new JMenu("Libro");
	        menu.add(MenuLibro);
	        
	        menuItem = new JMenuItem("Nuevo Libro");
	        MenuLibro.add(menuItem);
	        menuItem.addActionListener(e -> controller.showView(TiposAcciones.ABM_LIBROS));
	        
	        JMenu MenuVideo = new JMenu("Video");
	        menu.add(MenuVideo);

	        menuItem_1 = new JMenuItem("Nuevo Video");
	        MenuVideo.add(menuItem_1);
	        menu.addSeparator();
	        menuItem = new JMenuItem("Salir");
	        menuItem.addActionListener(e->System.exit(99));
	        menu.add(menuItem);

	        menuBar.add(menu);
	        
	        menu = new JMenu("Opciones");
	        menuBar.add(menu);
	        
	        menuItem = new JMenuItem("Buscar Camino");
	        menuItem.addActionListener(e -> controller.showView(TiposAcciones.VER_GRAFO));
	        menu.add(menuItem);
	        menuBar.add(menu);
	        
	        f.setJMenuBar(menuBar);
	        
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
	        f.pack();
	        f.setVisible(true);
	    }

}
