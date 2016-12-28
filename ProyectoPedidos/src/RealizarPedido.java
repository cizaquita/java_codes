
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RealizarPedido extends JFrame{
	private JLabel lbTitulo,lbNombre,lbCodigo,lbDireccion,lbTelefono,lbDescuentos;
	
	private JTextField txtNombre,txtCodigo,txtDireccion,txtTelefono,txtDescuentos;
	private JButton agregar,cancelar;
	JTextArea areaTexto = new JTextArea(25,80);

	MenuPrincipalAdmin mpa =new MenuPrincipalAdmin();
	public RealizarPedido(){
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
       add(areaTexto);
		getContentPane().setLayout(new GridLayout(6, 2));
   	
	
		lbNombre= new JLabel("Nombre:");
		lbCodigo = new JLabel("Codigo:");
		lbDireccion= new JLabel("Direccion:");
		lbTelefono= new JLabel("Telefono:");
		lbDescuentos= new JLabel("Descuentos:");
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
		
		txtDescuentos = new JTextField(100);
		
		txtDescuentos.setSize(100, 20);
		setTitle("Realizar Pedido");
		//add(lbTitulo);
		add(lbNombre);
		add(txtNombre);
		add(lbCodigo);
		add(txtCodigo);
		add(lbDireccion);
		add(txtDireccion);
		add(lbTelefono);
		add(txtTelefono);
		add(lbDescuentos);
		add(txtDescuentos);
		add(agregar);
		add(cancelar);
		setSize(300, 400);
	//	setVisible(true);
		
	}
	 private class accionAgregar implements ActionListener {

	        

	        @Override
	        public void actionPerformed(ActionEvent e) {
	          if(e.getActionCommand().equals("Cancelar")){
	        	  setVisible(false);
	        	  
	          }else if(e.getActionCommand().equals("Agregar")){
	        	  
	        mpa.bd.AgregarEditorial1(Integer.parseInt(txtCodigo.getText()), txtNombre.getText(),txtDireccion.getText(),txtTelefono.getText(),Float.parseFloat(txtDescuentos.getText()));
	         JOptionPane.showMessageDialog(null,"Se ha agregado la editorial!");
	        // mpa.setVisible(true);
	         
	          }
	        }
	 }

}
