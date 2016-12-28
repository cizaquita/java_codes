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

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class VentanaPrincipalDocente extends JPanel{

	//-----------------------------------------------
	//Atributos
	//-----------------------------------------------

	private VentanaDocente ventana;					
	private CrearUsuario Usuario;
	private Docente docente;
	private Reporte boton;

	private JButton btImprimir;
	
	//-----------------------------------------------
	//Constructor
	//-----------------------------------------------


	public VentanaPrincipalDocente(){			

		setLayout(new GridLayout(0,2));				/**Inicializa filas y columnas de la ventana*/
		setPreferredSize(new Dimension(600,300));	/**Dimensiones de la ventana*/
		
		/**
		 * Se inicializan los componentes de la ventana
		 */

		btImprimir=new JButton("Imprimir");			

		ventana=new VentanaDocente(); 
		Usuario=new CrearUsuario();
		docente=new Docente();
		boton=new Reporte();
		
		/**
		 * Se adicionan los componentes de la ventana
		 */

		add(docente);								
		add(ventana);
		add(Usuario);
		add(boton);


	}
}
