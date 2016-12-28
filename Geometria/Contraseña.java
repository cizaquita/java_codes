import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Contraseña extends JDialog implements ActionListener{
	
	private JLabel titulo;
	private JLabel opcion;
	private JPasswordField contraseña;
	private JButton entrar;
	
	public Contraseña(){
		setSize(200, 200);
		setTitle("Mi Proyecto");
		setLayout(null);
		
		titulo = new JLabel();
		titulo.setText("Bienvenido");
		titulo.setBounds(60, 0,100, 80);
		
		opcion = new JLabel();
		opcion.setText("Digite Su Contraseña");
		opcion.setBounds(30, 30, 130, 80);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(10, 100, 160, 20 );
		
		entrar = new JButton();
		entrar.setText("ENTRAR");
		entrar.addActionListener(this);
		entrar.setActionCommand("entrar");
		entrar.setBounds(10, 130, 100, 20);
		
		add(titulo);
		add(opcion);
		add(contraseña);
		add(entrar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("entrar")){
			Runner run = new Runner();
			if(contraseña.getText().equalsIgnoreCase(run.getContraseña())){
				setVisible(false);
				run.opciones();
			}else{
				JOptionPane.showMessageDialog(null, "La Contraseña Es Incorrecta");
				contraseña.setText("");
			}
		}
	}
	
	public static void main(String[] args) {
		Contraseña principal = new Contraseña();
		principal.setVisible(true);
	}

	
}
