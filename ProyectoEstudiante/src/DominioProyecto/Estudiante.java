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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Estudiante extends  JPanel {

	//-------------------------------------------------------------------------------------------------------
	//Atributos
	//-------------------------------------------------------------------------------------------------------

	private JLabel lbNombreCurso,lbActividad,lbNombreEstudiante,lbNumeroDeCodigo,lbCorreo,lbNota,lbPromedio;	
	private JTextField txtActividad,txtNombreEstudiante,txtNumeroDeCodigo,txtCorreo,txtNota,txtPromedio;
	private JComboBox jnombreCurso;
	private JButton btConsulta;

	String cCurso[]={"Fisica","Calculo","Programacion","Algebra Lineal","Economia"};						/**Se crean las variables del vector*/

	//------------------------------------------------------------------------------------------------------
	//Constructor
	//------------------------------------------------------------------------------------------------------

	public Estudiante(){	

		setBorder(new  TitledBorder("plataforma estudiante"));					/**Nombre del panel*/
		setLayout(new GridLayout(0,2));											/**Inicializa filas y columnas de la ventana*/
		setSize(700,700);														/**Dimension de la ventana*/


		/**
		 * Se inicializan los componentes de la ventana
		 */

		lbNombreCurso=new JLabel("curso");
		lbActividad=new JLabel("Nombre actividad");					
		lbNombreEstudiante=new JLabel("Nombre del Estudiante");
		lbNumeroDeCodigo=new JLabel("Numero de Codigo");
		lbCorreo=new JLabel("Correo Electronico");
		lbNota=new JLabel("Nota");
		lbPromedio=new JLabel("Promedio");

		txtActividad=new JTextField();
		txtNombreEstudiante=new JTextField("Miguel Serrano Euscategui");
		txtNumeroDeCodigo=new JTextField("201121293");
		txtCorreo=new JTextField("miguels.173@hotmail.com");
		txtNota=new JTextField("5");
		txtPromedio=new JTextField("3");

		btConsulta=new JButton("Enviar");
		btConsulta.addActionListener(new Enviar());								/**Se crea la accion del boton*/

		jnombreCurso=new JComboBox(cCurso);
		jnombreCurso.addActionListener(new curso());							/**Se crea la accion del boton*/


		/**
		 * Se adicionan los componentes de la ventana
		 */

		add(lbNombreEstudiante);									
		add(txtNombreEstudiante);

		add(lbNumeroDeCodigo);
		add(txtNumeroDeCodigo);

		add(lbCorreo);
		add(txtCorreo);

		add(lbNombreCurso);
		add(jnombreCurso);

		add(lbActividad);
		add(txtActividad);

		add(lbNota);
		add(txtNota);

		add(lbPromedio);
		add(txtPromedio);

		add(btConsulta);

		setBackground(Color.LIGHT_GRAY);										/**Se asigna un color al panel*/


	}
	public class Enviar implements ActionListener{								/**Metodo del boton enviar el cual muestra un mensaje*/

		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "el mensaje se a enviado con exito");

		}

	}
	public class curso implements ActionListener{								/**Metodo del menu dezplegable curso*/

		public void actionPerformed(ActionEvent arg0) {

			String seleccion;													/**Variable*/

			seleccion=cCurso[jnombreCurso.getSelectedIndex()];
			JOptionPane.showMessageDialog(jnombreCurso,"Selecciono: "+seleccion);

			if(jnombreCurso.getSelectedItem()==cCurso[0]){						/**Toma una posicion del vector*/
				txtActividad.setText("Taller movimiento uniforme");				/**Le asigna al txtActividad un valor*/
			}
			if(jnombreCurso.getSelectedItem()==cCurso[1]){						/**Toma una posicion del vector*/
				txtActividad.setText("Taller de integrales");					/**Le asigna al txtActividad un valor*/
			}
			if(jnombreCurso.getSelectedItem()==cCurso[2]){						/**Toma una posicion del vector*/
				txtActividad.setText("Proyecto interfaz grafica");				/**Le asigna al txtActividad un valor*/
			}
			if(jnombreCurso.getSelectedItem()==cCurso[3]){						/**Toma una posicion del vector*/
				txtActividad.setText("Taller transformaciones lineales");		/**Le asigna al txtActividad un valor*/
			}
			if(jnombreCurso.getSelectedItem()==cCurso[4]){						/**Toma una posicion del vector*/
				txtActividad.setText("Taller introduccion a la economia");		/**Le asigna al txtActividad un valor*/
			}
		}

	}
}
