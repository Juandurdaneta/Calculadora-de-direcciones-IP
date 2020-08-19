import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class calculadora {
//Atributos
	private JFrame frmCalculad;
	private static  JTextField octeto1;
	private JTextField octeto2;
	private JTextField octeto3;
	private JLabel lblNewLabel_1;
	private JTextField octeto4;
	private JLabel lblNewLabel_2;
	private JTextField cidr;
	private JTextField ClaseDirecciontxtfield;
	private JButton btnResetear;
	private JLabel lblNewLabel;
	private JTextField DireccionDeRedtxtField;
	private JLabel lbsubred;
	private JLabel lblNewLabel_4;
	private JTextField Subredtxtfield;
	private JTextField Broadcasttxtfield;
	private JLabel subredeslabel;
	private JLabel lblNewLabel_5;
	private JTextField HostSubredtxtfield;
	private JTextField NumSubredtxtfield;
	private JButton btnGuardar;
	private JButton btnVerGuardados;
	private JLabel Tipodirecc;
	private JLabel Tipodirecc2;
	private JTextField RangoHosttxtfield;
	//Metodo main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					window.frmCalculad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public calculadora() {
		initialize();
		
	}

	//Metodo que inicia la calculadora
	private void initialize() {
		frmCalculad = new JFrame();
		
		
		
		
		//frmCalculad.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jdurd\\eclipse-workspace\\Calculadora de Direcciones IP\\Logo_uru2.png"));
		frmCalculad.setTitle("Calculadora de Direcciones IP");
		frmCalculad.setResizable(false);
		frmCalculad.getContentPane().setBackground(SystemColor.control);
		frmCalculad.setBounds(100, 100, 643, 356);
		frmCalculad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculad.setLocationRelativeTo(null);
		frmCalculad.getContentPane().setLayout(null);
		
		JLabel Titulo = new JLabel("Calculadora de Direcciones IP");
		Titulo.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 19));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(183, 11, 247, 31);
		frmCalculad.getContentPane().add(Titulo);
		
		JLabel DirecIPtxt = new JLabel("Dirección IP:");
		DirecIPtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		DirecIPtxt.setBounds(51, 54, 73, 14);
		frmCalculad.getContentPane().add(DirecIPtxt);
		
		octeto1 = new JTextField();
		octeto1.setBounds(134, 49, 37, 20);
		frmCalculad.getContentPane().add(octeto1);
		octeto1.setColumns(10);
		
		octeto2 = new JTextField();
		octeto2.setBounds(179, 49, 37, 20);
		frmCalculad.getContentPane().add(octeto2);
		octeto2.setColumns(10);
		
		octeto3 = new JTextField();
		octeto3.setBounds(226, 49, 37, 20);
		frmCalculad.getContentPane().add(octeto3);
		octeto3.setColumns(10);
		
		JLabel label = new JLabel(" .");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(150, 53, 46, 14);
		frmCalculad.getContentPane().add(label);
		
		lblNewLabel_1 = new JLabel("   .");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(193, 53, 46, 14);
		frmCalculad.getContentPane().add(lblNewLabel_1);
		
		octeto4 = new JTextField();
		octeto4.setColumns(10);
		octeto4.setBounds(274, 49, 37, 20);
		frmCalculad.getContentPane().add(octeto4);
		
		lblNewLabel_2 = new JLabel("   .");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(240, 53, 46, 14);
		frmCalculad.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("/");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(296, 50, 65, 18);
		frmCalculad.getContentPane().add(lblNewLabel_3);
		
		cidr = new JTextField();
		cidr.setColumns(10);
		cidr.setBounds(345, 49, 37, 20);
		frmCalculad.getContentPane().add(cidr);
		
		JLabel label4 = new JLabel("Clase de la dirección:");
		label4.setFont(new Font("Calibri", Font.PLAIN, 14));
		label4.setBounds(307, 96, 154, 17);
		frmCalculad.getContentPane().add(label4);
		
		ClaseDirecciontxtfield = new JTextField();
		ClaseDirecciontxtfield.setColumns(10);
		ClaseDirecciontxtfield.setBounds(436, 92, 37, 20);
		ClaseDirecciontxtfield.setEditable(false);
		frmCalculad.getContentPane().add(ClaseDirecciontxtfield);
		
		//Label a mostrar cuando la direccion es privada
		Tipodirecc = new JLabel("(Privada)");
		Tipodirecc.setBounds(480,95,50,20);
		Tipodirecc.setFont(new Font("Calibri", Font.PLAIN, 14));
		Tipodirecc.setVisible(false);
		frmCalculad.getContentPane().add(Tipodirecc);
		
		//Label a mostrar cuando la direccion es publica
		Tipodirecc2 = new JLabel("(Publica)");
		Tipodirecc2.setBounds(480,95,50,20);
		Tipodirecc2.setFont(new Font("Calibri", Font.PLAIN, 14));
		Tipodirecc2.setVisible(false);
		frmCalculad.getContentPane().add(Tipodirecc2);
		
		//Boton para calcular
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnCalcular.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnCalcular.setBounds(410, 49, 89, 23);
		frmCalculad.getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				btnCalcularActionPerformed(e);
			}
			
		});
		
		
		//Boton que resetea los valores
		btnResetear = new JButton("Resetear");
		btnResetear.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnResetear.setBounds(507, 48, 89, 24);
		frmCalculad.getContentPane().add(btnResetear);
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResetearActionPerformed(e);
			}
		});
		lblNewLabel = new JLabel("Dirección de red:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setBounds(39, 97, 120, 14);
		frmCalculad.getContentPane().add(lblNewLabel);
		
		DireccionDeRedtxtField = new JTextField();
		DireccionDeRedtxtField.setColumns(10);
		DireccionDeRedtxtField.setBounds(169, 92, 127, 20);
		DireccionDeRedtxtField.setEditable(false);
		frmCalculad.getContentPane().add(DireccionDeRedtxtField);
		
		lbsubred = new JLabel("Mascara de subred:");
		lbsubred.setFont(new Font("Calibri", Font.PLAIN, 14));
		lbsubred.setBounds(310, 141, 120, 14);
		frmCalculad.getContentPane().add(lbsubred);
		
		lblNewLabel_4 = new JLabel("Dirección broadcast: ");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(39, 138, 123, 20);
		frmCalculad.getContentPane().add(lblNewLabel_4);
		
		Subredtxtfield = new JTextField();
		Subredtxtfield.setBounds(436, 136, 127, 20);
		Subredtxtfield.setEditable(false);
		frmCalculad.getContentPane().add(Subredtxtfield);
		Subredtxtfield.setColumns(10);
		
		
		Broadcasttxtfield = new JTextField();
		Broadcasttxtfield.setColumns(10);
		Broadcasttxtfield.setBounds(170, 136, 127, 20);
		Broadcasttxtfield.setEditable(false);
		frmCalculad.getContentPane().add(Broadcasttxtfield);
		
		subredeslabel = new JLabel("Numero de subredes:");
		subredeslabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		subredeslabel.setBounds(307, 188, 120, 14);
		frmCalculad.getContentPane().add(subredeslabel);
		
		lblNewLabel_5 = new JLabel("Cantidad de host por subred:");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 188, 161, 14);
		frmCalculad.getContentPane().add(lblNewLabel_5);
		
		HostSubredtxtfield = new JTextField();
		HostSubredtxtfield.setBounds(176, 183, 120, 20);
		frmCalculad.getContentPane().add(HostSubredtxtfield);
		HostSubredtxtfield.setEditable(false);
		HostSubredtxtfield.setColumns(10);
		
		NumSubredtxtfield = new JTextField();
		NumSubredtxtfield.setColumns(10);
		NumSubredtxtfield.setBounds(436, 183, 127, 20);
		NumSubredtxtfield.setEditable(false);
		frmCalculad.getContentPane().add(NumSubredtxtfield);
		
		
		//Boton para guardar
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnGuardar.setBounds(179, 263, 89, 23);
		frmCalculad.getContentPane().add(btnGuardar);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				btnGuardarActionPerformed (e);
			}
			
		});
		
		
		btnVerGuardados = new JButton("Ver guardados");
		btnVerGuardados.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnVerGuardados.setBounds(341, 263, 120, 23);
		frmCalculad.getContentPane().add(btnVerGuardados);
		btnVerGuardados.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				verGuardados (e);
			}
			
		});
		
		JLabel lblNewLabel_6 = new JLabel("Rango de dirección del host:");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(59, 228, 169, 14);
		frmCalculad.getContentPane().add(lblNewLabel_6);
		
		RangoHosttxtfield = new JTextField();
		RangoHosttxtfield.setHorizontalAlignment(SwingConstants.CENTER);
		RangoHosttxtfield.setEditable(false);
		RangoHosttxtfield.setBounds(240, 223, 233, 20);
		frmCalculad.getContentPane().add(RangoHosttxtfield);
		RangoHosttxtfield.setColumns(10);
		
	}
	
	//Accion del boton calcular
	private void btnCalcularActionPerformed(ActionEvent e) {
		if (octeto1.getText().equals("")&&octeto2.getText().equals("")&&octeto3.getText().equals("")&&octeto4.getText().equals("")&&cidr.getText().equals("")||octeto1.getText().length()>3||octeto2.getText().length()>3||octeto3.getText().length()>3||octeto4.getText().length()>3) {
			JOptionPane.showMessageDialog(null,"Introduzca una dirección de IP válida");
			
		}
		else {
			//Pasando los valores de cada octeto a numeros enteros
			int octeto1d  = Integer.parseInt(octeto1.getText().toString());
			int octeto2d = Integer.parseInt(octeto2.getText().toString());
			int octeto3d = Integer.parseInt(octeto3.getText().toString());
			int octeto4d = Integer.parseInt(octeto4.getText().toString());
			int cidrP = Integer.parseInt(cidr.getText().toString());
			
			int bits = 32-cidrP;
			
			//Cantidad de host por subnet
			
			
			int hostsSubnet = (int) Math.pow(2, bits);
			
			HostSubredtxtfield.setText(""+hostsSubnet);
			
			//Numero de subredes
			
			NumSubredtxtfield.setText(""+hostsSubnet/cidrP);
			
			
			//Determinando la Clase de la direccion
			
			if (octeto1d>=0 && octeto1d<=127) {
				ClaseDirecciontxtfield.setText("A");
				DireccionDeRedtxtField.setText(octeto1.getText()+".0.0.0");
				RangoHosttxtfield.setText(octeto1.getText()+".0.0.1 - "+octeto1.getText()+".255.255.254");
				
				//Determinando si es publica o privada
				
				if (octeto1d == 10 && octeto2d >= 0 && octeto2d <= 255 && octeto3d >= 0 && octeto3d <= 255 && octeto4d >= 0 && octeto4d <= 255) {
					Tipodirecc.setVisible(true);
					Tipodirecc2.setVisible(false);
				}
					else {
						Tipodirecc.setVisible(false);
						Tipodirecc2.setVisible(true);
					}
			
				
				
			}
			
			if (octeto1d>=128 && octeto1d<=191) {
				ClaseDirecciontxtfield.setText("B");
				DireccionDeRedtxtField.setText(octeto1.getText()+"."+octeto2.getText()+".0.0");
				RangoHosttxtfield.setText(octeto1.getText()+"."+octeto2.getText()+".0.1 - "+octeto1.getText()+"."+octeto2.getText()+".255.254");
				
				//Determinando si es publica o privada
				
				if ( octeto1d == 172 && octeto2d >= 16 && octeto2d <= 31  && octeto3d >= 0 && octeto3d <= 255 && octeto4d  >= 0 && octeto4d <= 255  ) {
					Tipodirecc.setVisible(true);
					Tipodirecc2.setVisible(false);
				}
					else {
						Tipodirecc.setVisible(false);
						Tipodirecc2.setVisible(true);
					}
			}
			
			
			if (octeto1d>=192 && octeto1d<=223) {
				ClaseDirecciontxtfield.setText("C");
				DireccionDeRedtxtField.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".0");
				RangoHosttxtfield.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".1 - "+octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".254");
				
				//Determinando si es publica o privada
				
				if ( octeto1d == 192 && octeto2d == 168 && octeto3d >= 0 && octeto3d <= 255 && octeto4d >= 0 && octeto4d <= 255) {
					Tipodirecc.setVisible(true);
					Tipodirecc2.setVisible(false);
				}
					else {
						Tipodirecc.setVisible(false);
						Tipodirecc2.setVisible(true);
					}
			}
			
			
			if (octeto1d>=224 && octeto1d<=239) {
				ClaseDirecciontxtfield.setText("D");
				DireccionDeRedtxtField.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".0");
				RangoHosttxtfield.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".1 - "+octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".254");
				Tipodirecc2.setVisible(true);
				Tipodirecc.setVisible(false);
			}
			
			
			
			if (octeto1d>=240 && octeto1d<=255) {
				ClaseDirecciontxtfield.setText("E");
				DireccionDeRedtxtField.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".0");
				RangoHosttxtfield.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".1 - "+octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".254");
				Tipodirecc2.setVisible(true);
				Tipodirecc.setVisible(false);
			}
			
			//Direccion Broadcast
			
			Broadcasttxtfield.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".255");
			
			
			//Mascara de subred
			
			
			switch (cidrP) {
			case 0 : Subredtxtfield.setText("0.0.0.0");
			break;
			case 1 : Subredtxtfield.setText("128.0.0.0");
			break;
			case 2 : Subredtxtfield.setText("192.0.0.0");
			break;
			case 3 :Subredtxtfield.setText("224.0.0.0");
			break;
			case 4 : Subredtxtfield.setText("240.0.0.0");
			break;
			case 5 : Subredtxtfield.setText("248.0.0.0");
			break;
			case 6 : Subredtxtfield.setText("252.0.0.0");
			break;
			case 7 : Subredtxtfield.setText("254.0.0.0");
			break;
			case 8 : Subredtxtfield.setText("255.0.0.0");
			break;
			case 9: Subredtxtfield.setText("255.128.0.0");
			break;
			case 10 : Subredtxtfield.setText("255.192.0.0");
			break;
			case 11 : Subredtxtfield.setText("255.224.0.0");
			break;
			case 12 : Subredtxtfield.setText("255.240.0.0");
			break;
			case 13 : Subredtxtfield.setText("255.248.0.0");
			break;
			case 14 : Subredtxtfield.setText("255.252.0.0");
			break;
			case 15 : Subredtxtfield.setText("255.254.0.0");
			break;
			case 16 : Subredtxtfield.setText("255.255.0.0");
			break;
			case 17 : Subredtxtfield.setText("255.255.128.0");
			break;
			case 18 : Subredtxtfield.setText("255.255.192.0");
			break;
			case 19 : Subredtxtfield.setText("255.255.224.0");
			break;
			case 20 : Subredtxtfield.setText("255.255.240.0");
			break;
			case 21 : Subredtxtfield.setText("255.255.248.0");
			break;
			case 22 : Subredtxtfield.setText("255.255.252.0");
			break;
			case 23 : Subredtxtfield.setText("255.255.254.0");
			break;
			case 24 : Subredtxtfield.setText("255.255.255.0");
			break;
			case 25 : Subredtxtfield.setText("255.255.255.128");
			break;
			case 26 : Subredtxtfield.setText("255.255.255.192");
			break;
			case 27 : Subredtxtfield.setText("255.255.255.224");
			break;
			case 28 : Subredtxtfield.setText("255.255.255.240");
			break;
			case 29 : Subredtxtfield.setText("255.255.255.248");
			break;
			case 30 : Subredtxtfield.setText("255.255.255.252");
			break;
			case 31 : Subredtxtfield.setText("255.255.255.254");
			break;
			case 32 : Subredtxtfield.setText("255.255.255.255");
			break;
			default : JOptionPane.showMessageDialog(null,"el CIDR ingresado es invalido");
					  Subredtxtfield.setText("CIDR invalido");
			}
			Broadcasttxtfield.setText(octeto1.getText()+"."+octeto2.getText()+"."+octeto3.getText()+".255");
		}
		
		
	}

	//Resetea los valores de la calculadora
	
	
	private void btnResetearActionPerformed( ActionEvent e ) {
		octeto1.setText("");
		octeto2.setText("");
		octeto3.setText("");
		octeto4.setText("");
		cidr.setText("");
		Subredtxtfield.setText("");
		ClaseDirecciontxtfield.setText("");
		DireccionDeRedtxtField.setText("");
		Subredtxtfield.setText("");
		Broadcasttxtfield.setText("");
		HostSubredtxtfield.setText("");
		NumSubredtxtfield.setText("");
		RangoHosttxtfield.setText("");
		Tipodirecc.setVisible(false);
		Tipodirecc2.setVisible(false);
	}
	
	private void btnGuardarActionPerformed ( ActionEvent e) {
		try {
			String [] string  = { DireccionDeRedtxtField.getText(), Broadcasttxtfield.getText(), ClaseDirecciontxtfield.getText(), Subredtxtfield.getText(), RangoHosttxtfield.getText()};
			int [] integer = {Integer.parseInt(octeto1.getText()), Integer.parseInt(octeto2.getText()), Integer.parseInt(octeto3.getText()),Integer.parseInt(octeto4.getText()), Integer.parseInt(cidr.getText()), Integer.parseInt(NumSubredtxtfield.getText()), Integer.parseInt(HostSubredtxtfield.getText()) };
			DB database = DB.getInstances();
			database.dbPrepareStatementInt(integer, "INSERT INTO ip (octeto1,octeto2,octeto3,octeto4,cidr,subredes,hostporsubred)");
			database.dbPrepareStatement(string,"INSERT INTO ip (direcciondered,direccionbroadcast,clasedireccion,MascaraSubred,rangohost) " );
			
			
			
		}finally {
			JOptionPane.showMessageDialog(null, "Guardado exitosamente");
		}
	}
	private void verGuardados ( ActionEvent e ) {
		DB database = DB.getInstances();
		String query = "SELECT *FROM ip";
		ResultSet rs = database.dbStatementImprimir(query);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				String imprimir = new String();
				try {
					while (rs.next()) {
						imprimir += " IP Ingresada : "+rs.getInt(1)+"."+rs.getInt(2)+"."+rs.getInt(3)+"."+rs.getInt(4)+" / "+rs.getInt(5)+"\nDireccion de red: "+rs.getString(6)+"\nDireccion Broadcast: "+rs.getString(7)+"\nClase de la direccion: "+rs.getString(8)+"\nNumero de host por subred: "+rs.getInt(9)+"\nNumero de Subredes: "+rs.getInt(10)+"\nRango del host: "+rs.getString(11)+"\nMascara de Subred: "+rs.getString(12);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				finally {
					try {
						rs.close();
						
					}catch (SQLException a) {
						a.printStackTrace();
					}
				}
				VerGuardados v = new VerGuardados(imprimir);
			}
		});
		
	}
}



