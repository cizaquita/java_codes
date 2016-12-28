import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

public class Inicio extends JFrame {

	/**
	 * @param args
	 */

	private static ButtonGroup grupoOpciones;
	private static JRadioButton admin, cliente, salir;
	String op1 = "Menu de Opciones";
	private JLabel lbtitulo;
	private JButton ingresar;
	private static Inicio inicio;
	MenuPrincipalAdmin mpa = new MenuPrincipalAdmin();

	public Inicio() {
		// TODO Auto-generated method stub

		getContentPane().setLayout(new GridLayout(5, 1));

		lbtitulo = new JLabel(op1);
		lbtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		grupoOpciones = new ButtonGroup();

		admin = new JRadioButton("Administrador");
		admin.setBounds(250, 110, 120, 20);
		admin.setSelected(true);
		admin.setHorizontalAlignment(SwingConstants.LEFT);
		cliente = new JRadioButton("Cliente");
		cliente.setBounds(370, 110, 120, 20);
		cliente.setHorizontalAlignment(SwingConstants.LEFT);
		salir = new JRadioButton("Salir");
		salir.setBounds(250, 110, 120, 20);
		salir.setHorizontalAlignment(SwingConstants.LEFT);
		grupoOpciones.add(admin);
		grupoOpciones.add(cliente);
		grupoOpciones.add(salir);

		ingresar = new JButton("Ingresar");
		ingresar.addActionListener(new accionIngresar());
		add(lbtitulo);
		add(admin);
		add(cliente);
		add(salir);
		add(ingresar);
		setTitle("Menu Principal");
		setSize(200, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		inicio = new Inicio();
	}

	// Verificar cual boton esta seelccionado,dependiendo del GrupodeBotones que
	// se envie

	public static JRadioButton getSelection(ButtonGroup group) {
		for (Enumeration e = group.getElements(); e.hasMoreElements();) {
			JRadioButton b = (JRadioButton) e.nextElement();
			if (b.getModel() == group.getSelection()) {
				return b;
			}
		}

		return null;
	}

	private class accionIngresar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int puntaje = 0;
			// r1a
			// r2a
			// r3c
			// r4d
			// r5a

			// obtener opcion seleccionada del grupo de opciones
			JRadioButton opcionSeleccionada = getSelection(grupoOpciones);
			if (opcionSeleccionada == null) {
				JOptionPane.showMessageDialog(null,
						"Debe seleccionar una opcion para ingresar al Sistema");
				return;
			} else {
				String opcion = opcionSeleccionada.getText();
				if (opcion.equals("Administrador")) {
					MenuPrincipalAdmin menuprincipalAdmin = new MenuPrincipalAdmin();
					menuprincipalAdmin.setVisible(true);
					inicio.setVisible(false);

				} else if (opcion.equals("Cliente")) {
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
					String res =mpa.bd.BuscarClientes(Integer.parseInt(codigocl));
					if (res.indexOf("encontro") > 0) {
						JOptionPane
								.showMessageDialog(null,
										"EL codigo ingresado no corresponde a ningun cliente registrado!");
						return;

					}

					MenuPrincipalCliente menuprincipalCliente = new MenuPrincipalCliente(
							Integer.parseInt(codigocl));
					menuprincipalCliente.setVisible(true);
					inicio.setVisible(false);

				} else if (opcion.equals("Salir")) {
					JOptionPane
							.showMessageDialog(null,
									"Gracias por utilizar nuestro servicios!\r\nHasta luego");
					System.exit(0);

				}
			}
			// System.out.println(opcionsexo.getText());
		}

	}

}
