

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


public class AgregarLibro extends JFrame{
	private JLabel lbTitulo1,lbTitulo,lbCodigo,lbEditorial,lbTelefono,lbPrecio;
	
	private JTextField txtTitulo,txtCodigo,txtEditorial,txtTelefono,txtPrecio;
	private JButton agregar,cancelar;
	MenuPrincipalAdmin mpa =new MenuPrincipalAdmin();
	public AgregarLibro(){
		
       getContentPane().setLayout(new GridLayout(5, 2));
      
		
		lbTitulo1= new JLabel("Agregar Libros");
		lbTitulo= new JLabel("Titulo:");
		lbCodigo = new JLabel("Codigo:");
		lbEditorial= new JLabel("Editorial:");
		lbPrecio= new JLabel("Precio:");
		agregar = new JButton("Agregar");
		cancelar = new JButton("Cancelar");
		agregar.addActionListener(new accionAgregar());
		cancelar.addActionListener(new accionAgregar());
		
		txtTitulo = new JTextField();
		txtTitulo.setSize(100, 20);
		
		txtCodigo = new JTextField(100);
		txtCodigo.setSize(100, 20);
		
		txtEditorial = new JTextField(100);
		txtEditorial.setSize(100, 20);
	
			
		txtPrecio = new JTextField(100);
		txtPrecio.setSize(100, 20);
		
		setTitle("Agregar Libros");
		//add(lbTitulo);
		add(lbTitulo);
		add(txtTitulo);
		add(lbCodigo);
		add(txtCodigo);
		add(lbEditorial);
		add(txtEditorial);
		add(lbPrecio);
		add(txtPrecio);
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
	       // 	  bd.Agregarcliente1(Titulo, Editorialc, Precio, telefonoc,codigocliente);
	        //Integer.parseInt(txtCodigo.getText())	  
	        mpa.bd.AgregarLibros1(txtTitulo.getText(),Integer.parseInt(txtCodigo.getText()),txtEditorial.getText(),Float.parseFloat(txtPrecio.getText()));
	         JOptionPane.showMessageDialog(null,"Se ha agregado el libro!");
	        // mpa.setVisible(true);
	         
	          }
	        }
	 }

}

