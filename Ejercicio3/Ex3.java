package UD21.Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex3 extends JFrame {

	private JPanel contentPane;

	public int contador1 = 0;
	public int contador2 = 0;
	
	public Ex3() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 3");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		final JLabel etiqueta = new JLabel ("Boton 1:");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(10, 0, 155, 35);
		contentPane.add(etiqueta);
		
		final JLabel etiqueta2 = new JLabel ("Boton 2:");
		etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta2.setBounds(175, 0, 155, 35);
		contentPane.add(etiqueta2);
		
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
				contador1++;
				etiqueta.setText("Boton 1: "+contador1+" veces");
			}
		};
		
		ActionListener al2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2++;
				etiqueta2.setText("Boton 2: "+contador2+" veces");
			}
		};
		
		BS1.addActionListener(al1);
		BS2.addActionListener(al2);
		
	}

}
