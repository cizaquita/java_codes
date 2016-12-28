import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.List;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActualizarPedido extends JFrame {
	private JLabel lbTitulo, lbCodigo, lbCodigoCliente, lbEstado;

	private JTextField txtNombre, txtCodigo, txtCodigoCliente;
	// private List listaEstado;
	private Choice listaEstado;
	private JButton agregar, cancelar;
	MenuPrincipalAdmin mpa = new MenuPrincipalAdmin();
	Date fechahora = new Date();

	public ActualizarPedido() {

		getContentPane().setLayout(new GridLayout(4, 2));

		lbTitulo = new JLabel("Actualizar Pedido");
		lbCodigo = new JLabel("Codigo Pedido:");
		lbCodigoCliente = new JLabel("Codigo del Cliente:");
		lbEstado = new JLabel("Estado:");
		// armamos la lista de ciudades, que va a ser un List:
		listaEstado = new Choice();

		listaEstado.addItem("Recibido");
		listaEstado.addItem("Revisando");
		listaEstado.addItem("Remitido");
		listaEstado.addItem("Enviado");

		agregar = new JButton("Agregar");
		cancelar = new JButton("Cancelar");
		agregar.addActionListener(new accionAgregar());
		cancelar.addActionListener(new accionAgregar());

		setTitle("Actualizar Pedido");

		txtCodigo = new JTextField(100);
		txtCodigo.setSize(100, 20);

		txtCodigoCliente = new JTextField(100);
		txtCodigoCliente.setSize(100, 20);

		// add(lbTitulo);
		add(lbCodigo);
		add(txtCodigo);
		add(lbCodigoCliente);
		add(txtCodigoCliente);
		add(lbEstado);
		add(listaEstado);

		add(agregar);
		add(cancelar);
		setSize(220, 170);
		setVisible(true);

	}

	private class accionAgregar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Cancelar")) {
				setVisible(false);

			} else if (e.getActionCommand().equals("Agregar")) {
				// bd.Agregarcliente1(nombre, direccionc, credito,
				// telefonoc,codigocliente);
				// Integer.parseInt(txtCodigo.getText())

				if (mpa.bd.consultarCliente(txtCodigoCliente.getText()) == true) {

					if (mpa.bd.BuscarPedido(
							Integer.parseInt(txtCodigo.getText())).indexOf(
							"encontro") == -1) {

						mpa.bd.actualizarPedidos(
								Integer.parseInt(txtCodigo.getText()),
								listaEstado.getSelectedItem());

						if (listaEstado.getSelectedItem().equals("Enviado")) {

							mpa.bd.AgregarVentas1(Integer.parseInt(txtCodigo
									.getText()), Integer
									.parseInt(txtCodigoCliente.getText()),
									String.valueOf(fechahora), mpa.bd
											.BuscarPedido(Integer
													.parseInt(txtCodigo
															.getText())));

						}
						JOptionPane.showMessageDialog(null,
								"Se ha actualizado el pedido!");
						// mpa.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null,
								"No existe ningun pedido almacenado con con Codigo "
										+ txtCodigo.getText());

					}

				} else {
					JOptionPane.showMessageDialog(null,
							"No existe ningun cliente con el Codigo "
									+ txtCodigoCliente.getText());

				}
			}
		}
	}

}
