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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import DominioProyecto.CrearUsuario.crearUsuario;

public class Reporte extends JPanel  {
	
	//-----------------------------------------------
	//Atributos
	//-----------------------------------------------

	private JButton btgenerarReporte;
	
	//-----------------------------------------------
	//Constructor
	//-----------------------------------------------
		
	public Reporte(){
		
		setBorder(new TitledBorder("Opcion generar"));/**Nombre del panel*/
		setSize(100,100);							/**Dimension del panel*/
		
		/**
		 * Se inicializan los componentes del panel
		 */
		
		btgenerarReporte=new JButton("Generar Reporte");
		btgenerarReporte.addActionListener(new boton());
		
		/**
		 * Se adicionan los componentes del panel
		 */
		
		add(btgenerarReporte);

	}
	
	public class boton implements ActionListener{		/**Metodo del boton generar reporte*/

		public void actionPerformed(ActionEvent e) {
			
					
		}
		
	}
}

