package DominioProyecto;
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * Universidad Pedagogica y tecnologica de Colombia (Sogamoso - Colombia) 
 * Escuela Ingeniería de Sistemas y Computación 
 * Free License version 1.0 
 * Proyecto Final de Programacion I
 * Ejercicio:Plataforma Web
 * Autor:Miguel Serrano Euscategui -  julio, 5 ,2012
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CrearUsuario extends JPanel {

	//-----------------------------------------------
	//Atributos
	//-----------------------------------------------

	private JLabel lbNombreUsuario,lbCodigo,lbCorreo;	
	private JTextField txtNombre,txtCodigo,txtCorreo;
	private JButton btCrearUsuario;

	//-----------------------------------------------
	//Constructor
	//-----------------------------------------------

	public CrearUsuario(){								

		setBorder(new TitledBorder("Crear Usuario"));	/**Titulo del panel*/
		setSize(200,200);								/**Se da dimension al panel*/
		setLayout(new GridLayout(4,2));					/**Se inicializan filas y columnas*/

		/**
		 * Se inicializan los componentes del panel
		 */

		lbNombreUsuario=new JLabel("nombre usuario");	
		lbCodigo=new JLabel("Numero de Codigo");
		lbCorreo=new JLabel("Correo electronico");

		txtNombre=new JTextField();
		txtCodigo=new JTextField();
		txtCorreo=new JTextField();

		btCrearUsuario=new JButton("Crear Usuario");
		btCrearUsuario.addActionListener(new crearUsuario());

		/**
		 * Se adicionan los componentes del panel
		 */

		add(lbNombreUsuario);							
		add(txtNombre);

		add(lbCodigo);
		add(txtCodigo);

		add(lbCorreo);
		add(txtCorreo);

		add(btCrearUsuario);

		setBackground(Color.lightGray);					/**se agrega un color al panel*/



	}
	public class crearUsuario implements ActionListener{

		/**para que cuando opriman el boton crear usuario nos muestre los datos en un mensaje*/

		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Nombre:\n"+txtNombre.getText()+"\n"+"Codigo:\n"+txtCodigo.getText()+"\n"+"Correo electronico:\n"+txtCorreo.getText()+"\n");
			JOptionPane.showMessageDialog(null, "El usuario ha sido creado con exito");
		}

	}

}















































