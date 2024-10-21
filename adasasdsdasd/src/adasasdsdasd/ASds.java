package adasasdsdasd;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ASds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		public class MenuEjemplo {

		    public static void main(String[] args) {
		    	JFrame menuFrame = new JFrame("Menú Principal");
		        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        menuFrame.setSize(300, 200);
		        
		        // Crear el menú
		        JMenuBar menuBar = new JMenuBar();
		        JMenu menu = new JMenu("Opciones");
		        
		        // Crear el ítem de menú "Play"
		        JMenuItem playItem = new JMenuItem("Play");
		        playItem.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Abrir nueva ventana al presionar "Play"
		                abrirVentanaJuego();
		            }
		        });
		        
		        menu.add(playItem);
		        menuBar.add(menu);
		        menuFrame.setJMenuBar(menuBar);
		        
		        // Mostrar el menú
		        menuFrame.setVisible(true);
		    }
		    
		    // Método para abrir una nueva ventana
		    private static void abrirVentanaJuego() {
		        JFrame juegoFrame = new JFrame("Ventana del Juego");
		        juegoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        juegoFrame.setSize(400, 300);
		        
		        // Aquí puedes agregar componentes para tu juego
		        JLabel label = new JLabel("¡Bienvenido al juego!", SwingConstants.CENTER);
		        juegoFrame.add(label);
		        
		        // Mostrar la ventana del juego
		        juegoFrame.setVisible(true);
		    }
		}