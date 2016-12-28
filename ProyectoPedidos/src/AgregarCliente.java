
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AgregarCliente extends JFrame{
	private JLabel lbTitulo,lbNombre,lbCodigo,lbDireccion,lbTelefono,lbCredito;
	
	private JTextField txtNombre,txtCodigo,txtDireccion,txtTelefono,txtCredito;
	private JButton agregar,cancelar;
	MenuPrincipalAdmin mpa =new MenuPrincipalAdmin();
	public AgregarCliente(){
		
       getContentPane().setLayout(new GridLayout(6, 2));
		lbNombre= new JLabel("Nombre:");
		lbCodigo = new JLabel("Codigo:");
		lbDireccion= new JLabel("Direccion:");
		lbTelefono= new JLabel("Telefono:");
		lbCredito= new JLabel("Credito:");
		agregar = new JButton("Agregar");
		cancelar = new JButton("Cancelar");
		agregar.addActionListener(new accionAgregar());
		cancelar.addActionListener(new accionAgregar());
		
		txtNombre = new JTextField();
		txtNombre.setSize(100, 20);
		
		txtCodigo = new JTextField(100);
		txtCodigo.setSize(100, 20);
		
		txtDireccion = new JTextField(100);
		txtDireccion.setSize(100, 20);
	
		txtTelefono = new JTextField(100);
		txtTelefono.setSize(100, 20);
		
		txtCredito = new JTextField(100);
		
		txtCredito.setSize(100, 20);
		setTitle("Agregar Cliente");
		add(lbNombre);
		add(txtNombre);
		add(lbCodigo);
		add(txtCodigo);
		add(lbDireccion);
		add(txtDireccion);
		add(lbTelefono);
		add(txtTelefono);
		add(lbCredito);
		add(txtCredito);
		add(agregar);
		add(cancelar);
		setSize(300, 200);
		setVisible(true);
		
	}
	 private class accionAgregar implements ActionListener {

	        

	        @Override
	        public void actionPerformed(ActionEvent e) {
	          if(e.getActionCommand().equals("Cancelar")){
	        	  setVisible(false);
	        	  
	          }else if(e.getActionCommand().equals("Agregar")){
	       // 	  bd.Agregarcliente1(nombre, direccionc, credito, telefonoc,codigocliente);
	        //Integer.parseInt(txtCodigo.getText())	  
	        mpa.bd.Agregarcliente1(txtNombre.getText(),txtDireccion.getText(),Float.parseFloat(txtCredito.getText()),txtTelefono.getText(),Integer.parseInt(txtCodigo.getText()));
	         JOptionPane.showMessageDialog(null,"Se ha agregado el Nuevo cliente!");
	        // mpa.setVisible(true);
	         
	          }
	        }
	 }

}
