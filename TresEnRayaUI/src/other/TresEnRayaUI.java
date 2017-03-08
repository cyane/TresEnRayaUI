package other;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TresEnRayaUI extends JFrame {

	protected JPanel contentPane;
	protected JTextField textJugadorActual;
	protected JTextField textTurno;
	protected JTextField textMensajes;
	protected JButton btn00;
	protected JButton btn01;
	protected JButton btn02;
	protected JButton btn10;
	protected JButton btn11;
	protected JButton btn12;
	protected JButton btn20;
	protected JButton btn21;
	protected JButton btn22;

	
	public TresEnRayaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setBounds(100, 100, 317, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 301, 216);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btn00 = new JButton("00");
		panel.add(btn00);
		
		btn01 = new JButton("01");
		panel.add(btn01);
		
		btn02 = new JButton("02");
		panel.add(btn02);
		
		btn10 = new JButton("10");
		panel.add(btn10);
	
		btn11 = new JButton("11");
		panel.add(btn11);
		
		btn12 = new JButton("12");
		panel.add(btn12);
		
		btn20 = new JButton("20");
		panel.add(btn20);
		
		btn21 = new JButton("21");
		panel.add(btn21);
		
		btn22 = new JButton("22");
		panel.add(btn22);
		
		JLabel lblJugadorActual = new JLabel("Jugador Actual");
		lblJugadorActual.setBounds(10, 227, 93, 20);
		contentPane.add(lblJugadorActual);
		
		textJugadorActual = new JTextField();
		textJugadorActual.setEditable(false);
		textJugadorActual.setBounds(102, 227, 52, 20);
		contentPane.add(textJugadorActual);
		textJugadorActual.setColumns(10);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setBounds(152, 227, 78, 20);
		contentPane.add(lblTurno);
		
		textTurno = new JTextField();
		textTurno.setEditable(false);
		textTurno.setBounds(217, 227, 52, 20);
		contentPane.add(textTurno);
		textTurno.setColumns(10);
		
		textMensajes = new JTextField();
		textMensajes.setName("Mensajes");
		textMensajes.setEditable(false);
		textMensajes.setBounds(2, 254, 299, 42);
		contentPane.add(textMensajes);
		textMensajes.setColumns(10);
	}

}