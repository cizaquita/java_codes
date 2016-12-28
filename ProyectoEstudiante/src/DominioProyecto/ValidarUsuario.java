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
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class ValidarUsuario extends JPanel {

	//-----------------------------------------------
	//Atributos
	//-----------------------------------------------

	private JLabel lbUsuario,lbContaseña;						
	private JTextField txtUsuario;
	private JPasswordField psContasena;
	private JButton btAceptar;

	//-----------------------------------------------
	//Constructor
	//-----------------------------------------------

	public ValidarUsuario(){									

		setBorder(new TitledBorder("Validar Usuario"));			/**Se crea el nombre panel*/
		setLayout(new GridLayout(3,2));							/**Se crea las filas y columnas del panel*/
		
		/**
		 * Se inicializan los componentes del panel
		 */


		lbUsuario=new JLabel("Usuario");
		txtUsuario=new JTextField();

		lbContaseña=new JLabel("contraseña");
		psContasena= new JPasswordField();

		btAceptar=new JButton("Iniciar Sesion");
		btAceptar.addActionListener(new aceptar());
		
		/**
		 * Se adicionan los compoentes del panel
		 */

		add(lbUsuario);											
		add(txtUsuario);

		add(lbContaseña);
		add(psContasena);

		add(btAceptar);

		setBackground(Color.lightGray);							/**Se asigna un color al panel*/



	}
	public class aceptar implements ActionListener{				/**metodo del boton iciar sesion*/ 

		public void actionPerformed(ActionEvent e) {


			String Usuario,Contrasena,contrasenaUno,usuarioUno;/**se crean las variables del usuario y contraseña */

			Contrasena=psContasena.getText();					/**Se toman las variable contaseña y se iguala con el atributo pscontraseña*/
			Usuario=txtUsuario.getText();						/**Se toman las variables usuario y se igualan con el atributo txtUsuario*/

			contrasenaUno=psContasena.getText();
			usuarioUno=txtUsuario.getText();

			if(Usuario.equalsIgnoreCase("alumno")&&Contrasena.equals("123")){/**decision que determina si el usuario y contrasena de alumno son correctos*/

				/**
				 * Si el usuario y la contasena de alumno es correcto nos muestra la ventana estudiante
				 */
				
				JOptionPane.showMessageDialog(null, "Bienvenido al sistema");

				JFrame ventanaTres=new JFrame("Plataforma Estudiante");				/**Se crea la ventana y se le da nombre*/
				ventanaTres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			/**Se utiliza para cerrar la ventana*/

				Estudiante estudianteUno=new Estudiante();							/**Se crea un objeto de la clase estudiante*/
				ventanaTres.getContentPane().add(estudianteUno);
				ventanaTres.pack();
				ventanaTres.setVisible(true);		
				setVisible(false);													/**hace visible el ventana estudiante*/
				
				/**
				 * Si el usuario y la contasena de docente es correcto nos muestra la ventana principal docente
				 */
				
			}else{

				if(usuarioUno.equalsIgnoreCase("docente")&&contrasenaUno.equals("123")){

					JOptionPane.showMessageDialog(null, "Bienvenido al sistema");

					JFrame ventanaDos=new JFrame("Plataforma docente");				/**Se crea la ventana y se le da nombre*/
					ventanaDos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/**Se utiliza para cerrar la ventana*/

					VentanaPrincipalDocente docenteUno=new VentanaPrincipalDocente();/**Se crea un objeto de la clase docente*/
					ventanaDos.getContentPane().add(docenteUno);
					ventanaDos.pack();
					ventanaDos.setVisible(true);									/**Hace que la ventana docente sea visible*/ 



					/**
					 * Si ningun usuario y contasena es correcto nos muestra este mensaje
					 */

				}else{					 
					JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son validos");
				}
			}

		}

	}

}
