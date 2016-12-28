// Demostración de los menús
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipalAdmin extends JFrame {

	public Basedatos bd = new Basedatos();

	private final JPanelFondo contenedor = new JPanelFondo("/imagenes/libreria.jpg");

	// configurar GUI
	public MenuPrincipalAdmin() {
		
		super("Libreria FV-Menu Administrador");
		 setContentPane(contenedor);

		// establecer menú Archivo y sus elementos de menú
		JMenu menuEditoriales = new JMenu("Editoriales");
		menuEditoriales.setMnemonic('E');

		// establecer elemento de menú Acerca de...
		JMenuItem elementoAcerca = new JMenuItem("Agregar editorial");
		elementoAcerca.setMnemonic('A');
		menuEditoriales.add(elementoAcerca);
		elementoAcerca.addActionListener(

		new ActionListener() { // clase interna anónima

					// mostrar cuadro de diálogo de mensaje cuando el usuario
					// seleccione Acerca de...
					public void actionPerformed(ActionEvent evento) {
						//setVisible(false);
						AgregarEditorial agregarEditorial = new AgregarEditorial();
						agregarEditorial.setVisible(true);

					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// establecer elemento de menú Salir
		JMenuItem leereditoriales = new JMenuItem("Leer Editoriales");
		leereditoriales.setMnemonic('L');
		menuEditoriales.add(leereditoriales);
		leereditoriales.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						// System.exit( 0 );
						JOptionPane.showMessageDialog(null,
								bd.LeerAllEditoriales());

					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener
		// establecer elemento de menú Salir
		JMenuItem leerEditorialespecifica = new JMenuItem(
				"Leer Editorial Especifica");
		leerEditorialespecifica.setMnemonic('d');
		menuEditoriales.add(leerEditorialespecifica);
		leerEditorialespecifica.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						String datos = JOptionPane.showInputDialog(null,
								"Ingrese el codigo editorial:",
								"Administrador-editoriales",
								JOptionPane.INFORMATION_MESSAGE);

						// JOptionPane.showMessageDialog(null,
						// bd.LeerUnaEditorial(Integer.parseInt(datos)));
						JOptionPane.showMessageDialog(null,
								bd.BuscarEditorial(Integer.parseInt(datos)));
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// *****************menu editoriales**********************
		// establecer menú Archivo y sus elementos de menú
		JMenu menuClientes = new JMenu("Clientes");
		menuClientes.setMnemonic('C');
		// establecer elemento de menú Salir
		JMenuItem agregarCliente = new JMenuItem("Agregar Cliente");
		agregarCliente.setMnemonic('A');
		menuClientes.add(agregarCliente);
		agregarCliente.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elemento Agregar CLiente
					public void actionPerformed(ActionEvent evento) {
						//setVisible(false);
						AgregarCliente agregarCliente = new AgregarCliente();
						agregarCliente.setVisible(true);
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// establecer elemento de menú Salir
		JMenuItem leerClientes = new JMenuItem("Leer Cliente Almacenados");
		leerClientes.setMnemonic('e');
		menuClientes.add(leerClientes);
		leerClientes.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						JOptionPane.showMessageDialog(null,
								bd.LeerAllClientes());
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// establecer elemento de menú Salir
		JMenuItem leerClienteespecifico = new JMenuItem(
				"Leer CLiente Especifico");
		leerClienteespecifico.setMnemonic('s');
		menuClientes.add(leerClienteespecifico);
		leerClienteespecifico.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						String datos = JOptionPane.showInputDialog(null,
								"Ingrese el codigo cliente:",
								"Administrador-cliente",
								JOptionPane.INFORMATION_MESSAGE);

						// JOptionPane.showMessageDialog(null,
						// bd.LeerUnaEditorial(Integer.parseInt(datos)));
						JOptionPane.showMessageDialog(null,
								bd.BuscarClientes(Integer.parseInt(datos)));
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener
		// ***********************fin menu clientes***************************

		// ************menu pedido**********************************
		// establecer menú Archivo y sus elementos de menú
		JMenu menuPedidos = new JMenu("Pedido");

		JMenuItem actualizarPedido = new JMenuItem("Actualizar Pedido");
		actualizarPedido.setMnemonic('t');
		menuPedidos.add(actualizarPedido);
		actualizarPedido.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						//setVisible(false);
						ActualizarPedido actualizarPedido = new ActualizarPedido();
						actualizarPedido.setVisible(true);
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// *************0fin menu pedidos******************
		// *******INICIO MENU LIBROS***************************
		JMenu menuLibros = new JMenu("Libros");
		// establecer elemento de menú Salir
		JMenuItem agregarLibros = new JMenuItem("Agregar Libros");
		agregarLibros.setMnemonic('L');
		menuLibros.add(agregarLibros);
		agregarLibros.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						setVisible(false);
						AgregarLibro agregarLibro = new AgregarLibro();
						agregarLibro.setVisible(true);
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// establecer elemento de menú Salir
		JMenuItem leerLibros = new JMenuItem("Leer Libros");
		leerLibros.setMnemonic('b');
		menuLibros.add(leerLibros);
		leerLibros.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						JOptionPane.showMessageDialog(null, bd.LeerAllLibros());
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener

		// **************menu roles********************

		JMenu menuRoles = new JMenu("Roles");
		// establecer elemento de menú Cambiar de Rol
		JMenuItem rolCLiente = new JMenuItem("Rol Cliente");
		rolCLiente.setMnemonic('R');
		menuRoles.add(rolCLiente);
		rolCLiente.addActionListener(

		new ActionListener() { // clase interna anónima

					// terminar la aplicación cuando el usuario haga clic en
					// elementoSalir
					public void actionPerformed(ActionEvent evento) {
						String codigocl = JOptionPane
						.showInputDialog(
								null,
								"Bienvenido al area de clientes por favor ingrese su codigo:",
								"BIENVENIDO",
								JOptionPane.INFORMATION_MESSAGE);
				if (codigocl.equals("")) {
					JOptionPane
							.showMessageDialog(null,
									"Debe ingresar su codigo asignado al momento de registro!");
					return;
				}
				//String res =bd.BuscarClientes(Integer.parseInt(codigocl));
				if(bd.consultarCliente(codigocl)==false){
				//System.out.println(res);
				//if (res.indexOf("encontro") > 0) {
					JOptionPane
							.showMessageDialog(null,
									"EL codigo ingresado no corresponde a ningun cliente registrado!");
					return;

				}

				MenuPrincipalCliente menuprincipalCliente = new MenuPrincipalCliente(
						Integer.parseInt(codigocl));
				menuprincipalCliente.setVisible(true);
				setVisible(false);
					}

				} // fin de la clase interna anónima

				); // fin de la llamada a addActionListener
		// **************menu roles********************

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
		barra.add(menuClientes);
		barra.add(menuLibros);
		barra.add(menuPedidos);
		barra.add(menuRoles);
		barra.add(menuSalir);

		setSize(400, 300);
		//setVisible(true);

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
