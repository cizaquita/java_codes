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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Docente extends JPanel {
	
	//-----------------------------------------------
	//Atributos
	//-----------------------------------------------
	
	private JLabel lbNombre,LbCodigo;					
	private JTextField txtNombre,txtCodigo;
	
	//-----------------------------------------------
	//Constructor
	//-----------------------------------------------
	
	public Docente(){//constructor
		
		setBorder(new TitledBorder("Datos Docente"));	/**Nombre del panel*/
		setLayout(new GridLayout(0,2));					/**Filas y columnas de la ventana*/
		setSize(100,200);								/**Dimension del panel*/
		
		/**
		 * Se inicializan los componentes del panel
		 */
		
		lbNombre=new JLabel("Nombre docente");			
		LbCodigo=new JLabel("codigo");

		txtNombre=new JTextField("Luis Bonilla");
		txtCodigo=new JTextField("345671");
		
		/**
		 * Se adicionan los componentes del panel
		 */
		
		
		add(lbNombre);									
		add(txtNombre);

		add(LbCodigo);
		add(txtCodigo);

		setBackground(Color.lightGray);					/**Se asigna un color al panel*/
	}

}
