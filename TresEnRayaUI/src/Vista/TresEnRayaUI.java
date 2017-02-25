package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TresEnRayaUI extends JFrame {

	private JPanel contentPane;
	private JTextField textJugadorActual;
	private JTextField textTurno;
	private JTextField textMensajes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRayaUI frame = new TresEnRayaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TresEnRayaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 301, 216);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btn00 = new JButton("");
		btn00.setName("Boton1");
		panel.add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.setName("Boton2");
		panel.add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.setName("Boton3");
		panel.add(btn02);
		
		JButton btn10 = new JButton("");
		btn10.setName("Boton4");
		panel.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.setName("Boton5");
		panel.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setName("Boton6");
		panel.add(btn12);
		
		JButton btn20 = new JButton("");
		btn20.setName("Boton7");
		panel.add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.setName("Boton8");
		panel.add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.setName("boton9");
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
