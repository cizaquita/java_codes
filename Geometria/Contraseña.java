import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Contrase�a extends JDialog implements ActionListener{
	
	private JLabel titulo;
	private JLabel opcion;
	private JPasswordField contrase�a;
	private JButton entrar;
	
	public Contrase�a(){
		setSize(200, 200);
		setTitle("Mi Proyecto");
		setLayout(null);
		
		titulo = new JLabel();
		titulo.setText("Bienvenido");
		titulo.setBounds(60, 0,100, 80);
		
		opcion = new JLabel();
		opcion.setText("Digite Su Contrase�a");
		opcion.setBounds(30, 30, 130, 80);
		
		contrase�a = new JPasswordField();
		contrase�a.setBounds(10, 100, 160, 20 );
		
		entrar = new JButton();
		entrar.setText("ENTRAR");
		entrar.addActionListener(this);
		entrar.setActionCommand("entrar");
		entrar.setBounds(10, 130, 100, 20);
		
		add(titulo);
		add(opcion);
		add(contrase�a);
		add(entrar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("entrar")){
			Runner run = new Runner();
			if(contrase�a.getText().equalsIgnoreCase(run.getContrase�a())){
				setVisible(false);
				run.opciones();
			}else{
				JOptionPane.showMessageDialog(null, "La Contrase�a Es Incorrecta");
				contrase�a.setText("");
			}
		}
	}
	
	public static void main(String[] args) {
		Contrase�a principal = new Contrase�a();
		principal.setVisible(true);
	}

	
}
