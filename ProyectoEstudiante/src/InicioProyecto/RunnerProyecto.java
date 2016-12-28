package InicioProyecto;

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

import javax.swing.JFrame;

import DominioProyecto.Estudiante;
import DominioProyecto.ValidarUsuario;

public class RunnerProyecto {
	
	//-------------------------------------------------------------------------------------
	//Metodo Principal
	//-------------------------------------------------------------------------------------
	
	public static void main(String[] args) {					

		JFrame Ventana=new JFrame("Validar Usuario");				/** Crea la ventana y se nombra*/
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/** Se utiliza para salir de la ventana*/
		
		ValidarUsuario validarUsuarioUno=new ValidarUsuario();		/** Crea un objeto de la clase ValidarUsuario*/
			
		Ventana.getContentPane().add(validarUsuarioUno);
		Ventana.pack();
		Ventana.setVisible(true);									/** Hace que la ventana sea visible*/


	}

}
