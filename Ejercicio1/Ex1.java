package UD21.Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	public Ex1() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 1");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		final JLabel etiqueta = new JLabel ("Etiqueta");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(10, 0, 344, 35);
		contentPane.add(etiqueta);
		
		final JLabel altura = new JLabel ("Altura");
		altura.setHorizontalAlignment(SwingConstants.CENTER);
		altura.setBounds(0, 136, 116, 35);
		contentPane.add(altura);
		
		final JTextField TF1 = new JTextField();
		TF1.setBounds(10, 181, 92, 29);
		contentPane.add(TF1);
		
		final JLabel ancho = new JLabel ("Ancho");
		ancho.setHorizontalAlignment(SwingConstants.CENTER);
		ancho.setBounds(206, 136, 148, 35);
		contentPane.add(ancho);
		
		final JTextField TF2 = new JTextField();
		TF2.setBounds(241, 181, 92, 29);
		contentPane.add(TF2);
		
		JButton BS1 = new JButton ();
		BS1.setText("Canviar Tamaño");
		BS1.setBounds(112, 221, 155, 29);
		contentPane.add(BS1);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TF1V = TF1.getText();
				String TF2V = TF2.getText();
				int width = Integer.parseInt(TF1V);
				int height = Integer.parseInt(TF2V);
				etiqueta.setBounds(10,0,width,height);
			}
		};
		
		BS1.addActionListener(al);
		
	}

}
