import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IPv6Frame {
	private JRadioButton BtnIPv4 = new JRadioButton("IPv4");
	private JRadioButton BtnIPv6 = new JRadioButton("IPv6");
	JFrame frmCalculadoraDeDirecciones;
	private JTextField Hexteto1;
	private JTextField Hexteto2;
	private JTextField Hexteto3;
	private JTextField Hexteto4;
	private JTextField Hexteto5;
	private JTextField Hexteto6;
	private JTextField Hexteto7;
	private JTextField Hexteto8;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField LongitudPrefijo;
	private JLabel NotacionLBL;
	private JTextField Notaciontxtfield;
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnResetear = new JButton("Resetear");
	private JTextField TipoDireccion;
	private JTextField LongPrefix;
	
	public IPv6Frame() {
		initialize();
	}

	
	private void initialize() {
		frmCalculadoraDeDirecciones = new JFrame();
		frmCalculadoraDeDirecciones.setResizable(false);
		frmCalculadoraDeDirecciones.setTitle("Calculadora de Direcciones IP");
		frmCalculadoraDeDirecciones.setBounds(100, 100, 643, 356);
		frmCalculadoraDeDirecciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDeDirecciones.setLocationRelativeTo(null);
		frmCalculadoraDeDirecciones.getContentPane().setLayout(null);
		BtnIPv6.setSelected(true);
		BtnIPv6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnIPv4.setSelected(false);
			}
		});
		BtnIPv6.setFont(new Font("Calibri", Font.PLAIN, 14));
		BtnIPv6.setBounds(480, 293, 57, 23);
		frmCalculadoraDeDirecciones.getContentPane().add(BtnIPv6);
		
		BtnIPv4.setHorizontalAlignment(SwingConstants.LEFT);
		BtnIPv4.setFont(new Font("Calibri", Font.PLAIN, 14));
		BtnIPv4.setSelected(false);
		BtnIPv4.setBounds(421, 293, 57, 23);
		BtnIPv4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnIPv6.setSelected(false);
				BtnIPv4Mostrar(e);
			}

			private void BtnIPv4Mostrar(ActionEvent e) {
				frmCalculadoraDeDirecciones.dispose();
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
		});
		frmCalculadoraDeDirecciones.getContentPane().add(BtnIPv4);
		
		JLabel Titulo = new JLabel("Calculadora de Direcciones IP");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 19));
		Titulo.setBounds(183, 11, 247, 31);
		frmCalculadoraDeDirecciones.getContentPane().add(Titulo);
		
		JLabel DirecIPtxt = new JLabel("Dirección IP:");
		DirecIPtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		DirecIPtxt.setBounds(20, 51, 73, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(DirecIPtxt);
		
		Hexteto1 = new JTextField();
		Hexteto1.setBounds(93, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto1);
		Hexteto1.setColumns(10);
		
		Hexteto2 = new JTextField();
		Hexteto2.setColumns(10);
		Hexteto2.setBounds(147, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto2);
		
		Hexteto3 = new JTextField();
		Hexteto3.setColumns(10);
		Hexteto3.setBounds(201, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto3);
		
		Hexteto4 = new JTextField();
		Hexteto4.setColumns(10);
		Hexteto4.setBounds(255, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto4);
		
		Hexteto5 = new JTextField();
		Hexteto5.setColumns(10);
		Hexteto5.setBounds(309, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto5);
		
		Hexteto6 = new JTextField();
		Hexteto6.setColumns(10);
		Hexteto6.setBounds(363, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto6);
		
		Hexteto7 = new JTextField();
		Hexteto7.setColumns(10);
		Hexteto7.setBounds(421, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto7);
		
		Hexteto8 = new JTextField();
		Hexteto8.setColumns(10);
		Hexteto8.setBounds(480, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Hexteto8);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(118, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(174, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(230, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(280, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel(":");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(336, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel(":");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(392, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel(":");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(451, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("/");
		lblNewLabel_7.setBounds(534, 49, 46, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_7);
		
		LongitudPrefijo = new JTextField();
		LongitudPrefijo.setColumns(10);
		LongitudPrefijo.setBounds(544, 46, 44, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(LongitudPrefijo);
		
		NotacionLBL = new JLabel("Notación condensada:");
		NotacionLBL.setFont(new Font("Calibri", Font.PLAIN, 14));
		NotacionLBL.setBounds(33, 126, 133, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(NotacionLBL);
		
		Notaciontxtfield = new JTextField();
		Notaciontxtfield.setEditable(false);
		Notaciontxtfield.setBounds(167, 121, 240, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(Notaciontxtfield);
		Notaciontxtfield.setColumns(10);
		
		
		btnCalcular.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnCalcular.setBounds(211, 77, 89, 23);
		frmCalculadoraDeDirecciones.getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcularActionPerformed(e);
			}});
		btnResetear.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnResetear.setBounds(346, 77, 89, 24);
		frmCalculadoraDeDirecciones.getContentPane().add(btnResetear);
		
		JLabel lblNewLabel_8 = new JLabel("Tipo de Direccción:");
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(33, 163, 131, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(lblNewLabel_8);
		
		TipoDireccion = new JTextField();
		TipoDireccion.setEditable(false);
		TipoDireccion.setBounds(167, 158, 240, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(TipoDireccion);
		TipoDireccion.setColumns(10);
		
		JLabel Longitud = new JLabel("Longitud del prefijo:");
		Longitud.setFont(new Font("Calibri", Font.PLAIN, 14));
		Longitud.setBounds(425, 126, 112, 14);
		frmCalculadoraDeDirecciones.getContentPane().add(Longitud);
		
		LongPrefix = new JTextField();
		LongPrefix.setEditable(false);
		LongPrefix.setBounds(541, 121, 57, 20);
		frmCalculadoraDeDirecciones.getContentPane().add(LongPrefix);
		LongPrefix.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnGuardar.setBounds(131, 272, 89, 23);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				btnGuardarActionPerformed (e);
			}

		});
		frmCalculadoraDeDirecciones.getContentPane().add(btnGuardar);
		
		JButton btnVerGuardados = new JButton("Ver guardados");
		btnVerGuardados.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnVerGuardados.setBounds(255, 272, 120, 23);
		btnVerGuardados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVerGuardadosActionPerformed (e);
			}

			private void btnVerGuardadosActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		frmCalculadoraDeDirecciones.getContentPane().add(btnVerGuardados);
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResetearActionPerformed (e);
			}

			
		});


		
	}
	private void btnCalcularActionPerformed(ActionEvent e) {
	if (LongitudPrefijo.getText().equals("") ||Hexteto1.getText().equals("") || Hexteto2.getText().equals("") || Hexteto3.getText().equals("") || Hexteto4.getText().equals("") || Hexteto5.getText().equals("") || Hexteto6.getText().equals("") || Hexteto7.getText().equals("") || Hexteto8.getText().equals("") ||Hexteto1.getText().length()>4 ||Hexteto2.getText().length()>4 ||Hexteto3.getText().length()>4 ||Hexteto4.getText().length()>4 ||Hexteto5.getText().length()>4 ||Hexteto6.getText().length()>4 ||Hexteto7.getText().length()>4 ||Hexteto8.getText().length()>4) {
		JOptionPane.showMessageDialog(null,"Introduzca una dirección de IP válida");
	}
	else {
		

		// Simplificando la direccion IPv6
		
		String oct1 = Hexteto1.getText();
		
		oct1 = oct1.startsWith("0") ? oct1.substring(1) : oct1;
		oct1 = oct1.startsWith("00") ? oct1.substring(2) : oct1;
		oct1 = oct1.startsWith("000") ? oct1.substring(3) : oct1;
		oct1 = oct1.startsWith("0000") ? oct1.substring(4) : oct1;
		
		String oct2 = Hexteto2.getText();
		
		oct2 = oct2.startsWith("0") ? oct2.substring(1) : oct2;
		oct2 = oct2.startsWith("00") ? oct2.substring(2) : oct2;
		oct2 = oct2.startsWith("000") ? oct2.substring(3) : oct2;
		oct2 = oct2.startsWith("0000") ? oct2.substring(4) : oct2;
		
		String oct3 = Hexteto3.getText();
		
		oct3 = oct3.startsWith("0") ? oct3.substring(1) : oct3;
		oct3 = oct3.startsWith("00") ? oct3.substring(2) : oct3;
		oct3 = oct3.startsWith("000") ? oct3.substring(3) : oct3;
		oct3 = oct3.startsWith("0000") ? oct3.substring(4) : oct3;
		
		String oct4 = Hexteto4.getText();
		
		oct4 = oct4.startsWith("0") ? oct4.substring(1) : oct4;
		oct4 = oct4.startsWith("00") ? oct4.substring(2) : oct4;
		oct4 = oct4.startsWith("000") ? oct4.substring(3) : oct4;
		oct4 = oct4.startsWith("0000") ? oct4.substring(4) : oct4;
		
		String oct5 = Hexteto5.getText();
		
		oct5 = oct5.startsWith("0") ? oct5.substring(1) : oct5;
		oct5 = oct5.startsWith("00") ? oct5.substring(2) : oct5;
		oct5 = oct5.startsWith("000") ? oct5.substring(3) : oct5;
		oct5 = oct5.startsWith("0000") ? oct5.substring(4) : oct5;
		
		String oct6 = Hexteto6.getText();
		
		oct6 = oct6.startsWith("0") ? oct6.substring(1) : oct6;
		oct6 = oct6.startsWith("00") ? oct6.substring(2) : oct6;
		oct6 = oct6.startsWith("000") ? oct6.substring(3) : oct6;
		oct6 = oct6.startsWith("0000") ? oct6.substring(4) : oct6;
		
		String oct7 = Hexteto7.getText();
		
		oct7 = oct7.startsWith("0") ? oct7.substring(1) : oct7;
		oct7 = oct7.startsWith("00") ? oct7.substring(2) : oct7;
		oct7 = oct7.startsWith("000") ? oct7.substring(3) : oct7;
		oct7 = oct7.startsWith("0000") ? oct7.substring(4) : oct7;
		
		String oct8 = Hexteto8.getText();
		
		oct8 = oct8.startsWith("0") ? oct8.substring(1) : oct8;
		oct8 = oct8.startsWith("00") ? oct8.substring(2) : oct8;
		oct8 = oct8.startsWith("000") ? oct8.substring(3) : oct8;
		oct8 = oct8.startsWith("0000") ? oct8.substring(4) : oct8;
		
		Notaciontxtfield.setText(oct1+":"+oct2+":"+oct3+":"+oct4+":"+oct5+":"+oct6+":"+oct7+":"+oct8);
		//Pasando de hexadecimal a decimal
		
		int hex1 = Integer.parseInt(oct1, 16);
		int hex2 = Integer.parseInt(oct2, 16);
		int hex3 = Integer.parseInt(oct3, 16);
		int hex4 = Integer.parseInt(oct4, 16);
		int hex5 = Integer.parseInt(oct5, 16);
		int hex6 = Integer.parseInt(oct6, 16);
		int hex7 = Integer.parseInt(oct7, 16);
		int hex8 = Integer.parseInt(oct8, 16);
		
		if (hex1 >= 0 && hex1 <= 255 ) {
			TipoDireccion.setText("Direccion Bucle invertido");
		}
		if (hex1 >= 8192 && hex1 <= 16383) {
			TipoDireccion.setText("Dirección de unidifusión global");
		}
		if (hex1 >= 65152 && hex1 <= 65215) {
			TipoDireccion.setText("Link-Local");
		}
		if (hex1 >= 64512 && hex1 <= 64767) {
			TipoDireccion.setText("Local Unica");
		}
		if (hex1 >= 65280 && hex1 <= 65535) {
			TipoDireccion.setText("Dirección de Multidifusion");
		}
		
		
		LongPrefix.setText("/ "+LongitudPrefijo.getText());
		
		
		
		if (Hexteto1.getText().contentEquals("FE80")) {
			TipoDireccion.setText("Link-Local");
		}
	}
		
	}
	private void btnResetearActionPerformed(ActionEvent e) {
		
		Hexteto1.setText("");
		Hexteto2.setText("");
		Hexteto3.setText("");
		Hexteto4.setText("");
		Hexteto5.setText("");
		Hexteto6.setText("");
		Hexteto7.setText("");
		Hexteto8.setText("");
		Notaciontxtfield.setText("");
		LongitudPrefijo.setText("");
		TipoDireccion.setText("");
		
		
	}

	private void btnGuardarActionPerformed(ActionEvent e) {
		try {
			ArrayList string = new ArrayList();
			string.add(Hexteto1);
			string.add(Hexteto2);
			string.add(Hexteto3);
			string.add(Hexteto4);
			string.add(Hexteto5);
			string.add(Hexteto6);
			string.add(Hexteto7);
			string.add(Hexteto8);
			string.add(Notaciontxtfield);
			string.add(TipoDireccion);
			DB database = DB.getInstances();
			database.dbPrepareStatementString(string, "INSERT INTO ipv6 (hexteto1,hexteto2,hexteto3,hexteto4,hexteto5,hexteto6,hexteto7,hexteto8,DireccionCondensada,TipoDireccion"+"VALUES (?,?,?,?,?,?,?,?,?,?)");
		}finally {
			JOptionPane.showMessageDialog(null,"Guardado exitosamente!");
			
		}
		
	}
	private void verGuardados ( ActionEvent e ) {
		DB database = DB.getInstances();
		String query = "SELECT *FROM ipV6";
		ResultSet rs = database.dbStatementImprimir(query);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				String imprimir = new String();
				try {
					while (rs.next()) {
						imprimir += " IP Ingresada : "+rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8)+":"+"\nDireccion Condensada: "+rs.getString(9)+"\nTipo de Direccion: "+rs.getString(10)+"\n------------------------------";
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
