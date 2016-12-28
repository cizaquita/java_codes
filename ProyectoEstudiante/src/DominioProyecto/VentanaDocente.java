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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VentanaDocente extends JPanel {

	//-----------------------------------------------
	//Atributos
	//-----------------------------------------------

	private JMenuBar menuBar;							
	private JMenu menuDos,menuTres,menuCuatro;
	private JMenuItem modificar,actividad,notas;



	//-----------------------------------------------
	//Constructor
	//-----------------------------------------------

	public VentanaDocente(){							

		setBorder(new TitledBorder("Opciones docente"));/**Nombre del panel*/
		setPreferredSize(new Dimension(100,100));		/**Dimension del panel*/


		/**
		 * Se inicializan los componentes de la ventana
		 */

		menuBar=new JMenuBar();							
		modificar=new JMenuItem();
		actividad=new JMenuItem();
		notas=new JMenuItem();

		menuDos=new JMenu();
		menuTres=new JMenu();
		menuCuatro=new JMenu();

		/**
		 * Se agregan los menus al panel
		 */

		menuDos.setText("Crear Actividad");				
		menuBar.add(menuDos);

		menuTres.setText("Modificar");
		menuBar.add(menuTres);	

		menuCuatro.setText("Ingresar Notas");
		menuBar.add(menuCuatro);

		/**
		 * Se crea la accion de cada menu y el boton
		 */

		actividad.setText("Crear Actividad");			
		menuDos.add(actividad);
		actividad.addActionListener(new accionDos());	


		modificar.setText("Modificar Usuario");
		menuTres.add(modificar);
		modificar.addActionListener(new accion());

		notas.setText("Digitar Notas");
		menuCuatro.add(notas);
		notas.addActionListener(new accionTres());


		/**
		 * Se adicionan los componentes de la ventana
		 */

		add(menuBar);

		setBackground(Color.lightGray);					/**Se asigna un color al panel*/
	}

	private class accion implements ActionListener{		/**Accion del menu uno */


		public void actionPerformed(ActionEvent arg0) {



		}
	}
	private class accionDos implements ActionListener{	

		public void actionPerformed(ActionEvent arg0) {/**Si le damos en el menu crear actividad nos lo muestra en un mensaje*/

			String nombre;								/**Se crean variables*/
			String materia;
			String codigo;

			materia=JOptionPane.showInputDialog(null,"Asigantura de la Actividad");

			nombre=JOptionPane.showInputDialog(null, "Nombre de la Actividad");
			codigo=JOptionPane.showInputDialog(null,"Codigo del curso");

			/**Muestra lo que se digito en el menu y no lo muestra en un mensaje*/

			JOptionPane.showMessageDialog(null, "Nombre:\n"+nombre+"\n"+"Materia:\n"+materia+
					"\n"+"Codigo asignatura:\n"+codigo);

		}
	}

	private class accionTres implements ActionListener{	/**Si le damos en el menu ingresar notas nos lo muestra en un mensaje*/

		public void actionPerformed(ActionEvent arg0) {

			String nombre;								/**Se crean valiables*/
			String materia;
			int nota;
			int notaDos;
			int  notaTres;
			String mens;
			String mensDos;
			String mensTres;
			String mensCuatro;
			int promedio;

			nombre=JOptionPane.showInputDialog(null, "nombre del estudiante");
			materia=JOptionPane.showInputDialog(null, "materia que cursa el estudiante");

			mens=JOptionPane.showInputDialog(null,"Nota uno del estudiante");
			nota=Integer.parseInt(mens);

			mensDos=JOptionPane.showInputDialog(null,"Notas dos del estudiante");
			notaDos=Integer.parseInt(mensDos);

			mensTres=JOptionPane.showInputDialog(null,"Notas tres del estudiante");
			notaTres=Integer.parseInt(mensTres);
			promedio=(nota+notaDos+notaTres)/3;
			JOptionPane.showMessageDialog(null,"el promedio es "+promedio);

			/**Muestra lo que se digito en el menu y no lo muestra en un mensaje*/

			JOptionPane.showMessageDialog(null,"Nombre:\n"+nombre+"\n"+"Materia Cursada:\n"+materia+"\n"+
					"Nota uno estudiante:\n"+nota+"\n"+"Nota dos estudiante:\n"+notaDos+"\n"+"Nota tres del estudiante:\n"+notaTres+
					"\n"+"Promedio durante el periodo:\n"+promedio);



		}
	}
}
