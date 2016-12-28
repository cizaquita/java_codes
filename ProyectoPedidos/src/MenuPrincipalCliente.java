// Demostración de los menús
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipalCliente extends JFrame {

	public Basedatos bd = new Basedatos();
	private final JPanelFondo contenedor = new JPanelFondo("/imagenes/libreria.jpg");

	// configurar GUI
	public MenuPrincipalCliente(int codigocliente) {
		
		super("Libreria FV-Menu Cliente:"+String.valueOf(codigocliente));
		 setContentPane(contenedor);

		// establecer menú Archivo y sus elementos de menú
		JMenu menuEditoriales = new JMenu("Pedidos");
		menuEditoriales.setMnemonic('E');

		// establecer elemento de menú Acerca de...
		JMenuItem elementoAcerca = new JMenuItem("Realizar pedido");
		elementoAcerca.setMnemonic('A');
		menuEditoriales.add(elementoAcerca);
		elementoAcerca.addActionListener(

		new ActionListener() { // clase interna anónima
					// mostrar cuadro de diálogo de mensaje cuando el usuario
					// seleccione Acerca de...
					public void actionPerformed(ActionEvent evento) {
						
					}
				} // fin de la clase interna anónima
				); // fin de la llamada a addActionListener
		// establecer elemento de menú Salir
		JMenuItem leereditoriales = new JMenuItem("Estado de Pedido");
		leereditoriales.setMnemonic('L');
		menuEditoriales.add(leereditoriales);
		leereditoriales.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						//setVisible(false);
						RealizarPedido realizarPedido = new RealizarPedido();
						realizarPedido.setEnabled(true);
						
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener
		

		JMenu menuSalir = new JMenu("Salir");
		// establecer elemento de menú Cambiar de Rol
		JMenuItem rolSalir = new JMenuItem("Salir");
		rolSalir.setMnemonic('S');
		menuSalir.add(rolSalir);
		rolSalir.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicios.\r\nPara soporte tecnico favor comunicarse con:\r\n\r\nIng Fabian Vargas\r\nfabi@gmail.com");
					System.exit(0);
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// crear barra de menús y adjuntarla a la ventana PruebaMenu
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(menuEditoriales);
		barra.add(menuSalir);

		setSize(400, 300);
		

	} // fin del constructor

	public Basedatos baseDatos() {
		return this.bd;

	}
	
		 
		    
		 
		    public void setImagen(String nombreImagen) {
		        contenedor.setImagen(nombreImagen);
		    }
		 
		    public void setImagen(Image nuevaImagen) {
		        contenedor.setImagen(nuevaImagen);
		    }
		

} // fin de la clase PruebaMenu
