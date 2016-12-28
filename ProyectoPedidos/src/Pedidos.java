

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * 
 * @author fabian vargas
 */
public class Pedidos {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public Pedidos(){
		String codigotemporal = "";
		// TODO code application logic here
		Editorial edit = new Editorial();
		Ventas ven = new Ventas();
		Cliente clie = new Cliente();
		Basedatos bd = new Basedatos();
		Pedido pd = new Pedido();
		Libros libro = new Libros();
		bd.InicializarEditoriales();
		bd.InicializarClientes();
		bd.InicializarLibros();
		bd.InicializarPedidos();
		bd.InicializarVentas();
		String datos = "";
		String datos1 = "";
		int codigoeditorial;
		String nombreeditorial;
		String direccion;
		String telefono;
		String descripcionPedidos = "";
		int ventanas;

		float descuentosvolumen;
		String nombre;
		String direccionc;
		float credito;
		String telefonoc;
		int codigocliente;

		// variables para libros
		String titulolib;
		int codigolib;
		String editoriallib;
		float preciolib;

		boolean activo = true;
		ventanas = 0;
		//Date hoy = new Date();
		while (activo == true) {
			if (ventanas == 0) {
				datos1 = JOptionPane.showInputDialog(null,
						"0. administrador\r\n1.cliente\r\n2.salir ::",
						"bienvenido a la biblioteca",
						JOptionPane.INFORMATION_MESSAGE);

			}

			if (datos1.equals("0")) {

				datos = JOptionPane
						.showInputDialog(
								null,
								"0 para Agregar editorial\r\n1.Para leer editoriales\r\n2.Para leer una editorial\r\n3.agergarcliente\r\n4.leer clientes\r\n.5.leer un cliente\r\n.6.Actualizar estado de pedido\r\n7.ageregar libros\r\n8.leer libros\r\n9.actualizar pedido\r\n.10retornar::",
								"Administrador",
								JOptionPane.INFORMATION_MESSAGE);

				if (datos.equals("0")) {
					
					datos = JOptionPane.showInputDialog(null,
							"Ingrese Nombre:", "Administrador-editoriales",
							JOptionPane.INFORMATION_MESSAGE);
					nombreeditorial = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese codigoeditoria:",
							"Administrador-editoriales",
							JOptionPane.INFORMATION_MESSAGE);
					codigoeditorial = Integer.parseInt(datos);
					datos = JOptionPane.showInputDialog(null,
							"Ingrese direccion:", "Administrador-editoriales",
							JOptionPane.INFORMATION_MESSAGE);
					direccion = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese telefono:", "Administrador-editoriales",
							JOptionPane.INFORMATION_MESSAGE);
					telefono = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese descuentos:", "Administrador-editoriales",
							JOptionPane.INFORMATION_MESSAGE);
					descuentosvolumen = Float.parseFloat(datos);
					// edit.setCodigoeditorial(codigoeditorial);
					// edit.setDescuentosvolumen(descuentosvolumen);
					// edit.setNombreeditorial(nombreeditorial);
					// edit.setDireccion(direccion);
					// edit.setTelefono(telefono);
					// bd.AgregarEditorial(edit);
					bd.AgregarEditorial1(codigoeditorial, nombreeditorial,
							direccion, telefono, descuentosvolumen);
				} else if (datos.equals("1")) {
                 //Ventanas cargarvent = new Ventanas();
                 
                 
                // aplicacion.ssetDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                
					JOptionPane.showMessageDialog(null, bd.LeerAllEditoriales());

				} else if (datos.equals("2")) {
					datos = JOptionPane.showInputDialog(null,
							"Ingrese el codigo editorial:",
							"Administrador-editoriales",
							JOptionPane.INFORMATION_MESSAGE);

					// JOptionPane.showMessageDialog(null,
					// bd.LeerUnaEditorial(Integer.parseInt(datos)));
					JOptionPane.showMessageDialog(null,
							bd.BuscarEditorial(Integer.parseInt(datos)));

				} else if (datos.equals("3")) {

					datos = JOptionPane.showInputDialog(null,
							"Ingrese Nombre cliente:",
							"Administrador clientes",
							JOptionPane.INFORMATION_MESSAGE);
					nombre = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese codigo de el cliente:",
							"Administrador-clientes",
							JOptionPane.INFORMATION_MESSAGE);
					codigocliente = Integer.parseInt(datos);
					datos = JOptionPane.showInputDialog(null,
							"Ingrese direccion de el cliente:",
							"Administrador-clientes",
							JOptionPane.INFORMATION_MESSAGE);
					direccionc = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese telefono de el cliente:",
							"Administrador-clientes",
							JOptionPane.INFORMATION_MESSAGE);
					telefonoc = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese el credito de el cliente:",
							"Administrador-clientes",
							JOptionPane.INFORMATION_MESSAGE);
					credito = Float.parseFloat(datos);
					// edit.setCodigoeditorial(codigoeditorial);
					// edit.setDescuentosvolumen(descuentosvolumen);
					// edit.setNombreeditorial(nombreeditorial);
					// edit.setDireccion(direccion);
					// edit.setTelefono(telefono);
					// bd.AgregarEditorial(edit);
					bd.Agregarcliente1(nombre, direccionc, credito, telefonoc,
							codigocliente);
					// datos1="0";

				} else if (datos.equals("4")) {
					JOptionPane.showMessageDialog(null, bd.LeerAllClientes());
					// datos1="0";

				} else if (datos.equals("5")) {
					datos = JOptionPane.showInputDialog(null,
							"Ingrese el codigo cliente:",
							"Administrador-cliente",
							JOptionPane.INFORMATION_MESSAGE);

					// JOptionPane.showMessageDialog(null,
					// bd.LeerUnaEditorial(Integer.parseInt(datos)));
					JOptionPane.showMessageDialog(null,
							bd.BuscarClientes(Integer.parseInt(datos)));

					// datos1="0";

				} else if (datos.equals("6")) {
					// datos1="0";
					ventanas = 1;

				} else if (datos.equals("7")) {

					datos = JOptionPane.showInputDialog(null,
							"Ingrese codigo de el libro:",
							"Administrador-libros",
							JOptionPane.INFORMATION_MESSAGE);
					codigolib = Integer.parseInt(datos);
					datos = JOptionPane.showInputDialog(null,
							"Ingrese titulo de el libro:",
							"Administrador-libros",
							JOptionPane.INFORMATION_MESSAGE);
					titulolib = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese la editorial de el libro:",
							"Administrador-libros",
							JOptionPane.INFORMATION_MESSAGE);
					editoriallib = datos;
					datos = JOptionPane.showInputDialog(null,
							"Ingrese precio de el libro:",
							"Administrador-libros",
							JOptionPane.INFORMATION_MESSAGE);
					preciolib = Float.parseFloat(datos);
					bd.AgregarLibros1(titulolib, codigolib, editoriallib,
							preciolib);

					// datos1="0";

				} else if (datos.equals("8")) {
					// datos1="0";
					JOptionPane.showMessageDialog(null, bd.LeerAllLibros());

				} else if (datos.equals("9")) {
					String codigos = JOptionPane.showInputDialog(null,
							"Ingrese el codigo del pedido :",
							"Administrador-estado pedido",
							JOptionPane.INFORMATION_MESSAGE);
					String estados = JOptionPane.showInputDialog(null,
							"Ingrese el estado:",
							"Administrador-estado de pedido",
							JOptionPane.INFORMATION_MESSAGE);
					bd.actualizarPedidos(Integer.parseInt(codigos), estados);
					if (estados.equals("enviado")) {

						bd.AgregarVentas1(Integer.parseInt(codigos),
								Integer.parseInt(codigotemporal), "21_12_04",
								descripcionPedidos);

					}

					// datos1="0";

				} else if (datos.equals("10")) {
					datos1 = "0";
					// ventanas = 3;

				}
			} else if (datos1.equals("1")) {

				datos = JOptionPane
						.showInputDialog(
								null,
								"bienvenido al area de clientes por favor ingrese su codigo:",
								"bienvenido señor cliente",
								JOptionPane.INFORMATION_MESSAGE);

				codigotemporal = datos;
				if (bd.consultarCliente(codigotemporal) == true) {

					datos = JOptionPane
							.showInputDialog(
									null,
									"0 para  solicitar pedido\r\n1.solicitar estado de pedido\r\n2.retornar:",
									"Cliente", JOptionPane.INFORMATION_MESSAGE);
					if (datos.equals("0")) {

						datos = JOptionPane
								.showInputDialog(
										null,
										" libros habilitados:\r\n"
												+ bd.LeerAllLibros()
												+ "\r\n\r\nPor favor ingrese los codigos separados por comas:",
										"solicitar pedido",
										JOptionPane.INFORMATION_MESSAGE);
						descripcionPedidos = datos;

						String[] arrayGuardalibros = datos.split(",");
						float total = 0;
						for (int i = 0; i < arrayGuardalibros.length; i++) {
							System.out.println(arrayGuardalibros[i]);

							total += bd.PrecioLibro(arrayGuardalibros[i]);
						}

						System.out.println(total);
						if (clie.getCreditoHabilitado() >= total) {
							bd.AgregarPedido1(bd.generarCodigoPedido(), datos,
									"12-12-12", total, clie.getDireccion(),
									"enviado a ventas");
							System.out
									.println("su pedido a sido enviado al area de ventas");
						}
					} else {
					}
				}

			} else if (datos1.equals("2")) {
				System.out.println("jksagGDHDFK");
				JOptionPane.showMessageDialog(null,
						"gracias por utilizar la plataforma de leo vargas ");
				System.exit(0);
			} else if (datos1.equals("3")) {
				MenuPrincipalAdmin menuprincipal = new MenuPrincipalAdmin();
			    menuprincipal.setVisible(true);
		
			
			}

		}
		
		
	}
	

}
