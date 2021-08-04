package UD21.Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	public Ex2() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 2");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		final JLabel etiqueta = new JLabel ("Has pulsado:");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(10, 0, 344, 35);
		contentPane.add(etiqueta);
		
		JButton BS1 = new JButton ();
		BS1.setText("Boton 1");
		BS1.setBounds(10, 117, 155, 29);
		contentPane.add(BS1);

		JButton BS2 = new JButton ();
		BS2.setText("Boton 2");
		BS2.setBounds(175, 117, 155, 29);
		contentPane.add(BS2);
		
		ActionListener al1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado el Boton 1");
			}
		};
		
		ActionListener al2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Has pulsado el Boton 2");
			}
		};
		
		BS1.addActionListener(al1);
		BS2.addActionListener(al2);
		
	}

}
