import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VerGuardados extends JFrame {
	private JPanel contenido;
	public VerGuardados (String i ) {
		setTitle(" Calculadora de Direcciones IP ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contenido = new JPanel();
		setContentPane(contenido);
		contenido.setLayout(null);
		setBounds (100,100,682,388);
		contenido.setBorder(new EmptyBorder(5,5,5,5));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 55, 600, 250);
		contenido.add(scrollPane);
		
		JTextArea texto = new JTextArea(i);
		texto.setLineWrap(true);
		texto.setEditable(false);
		scrollPane.setViewportView(texto);
		setVisible(true);
		
		
	}
}
