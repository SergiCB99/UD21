package UD21.Ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex6 extends JFrame {

	private JPanel contentPane;
	public Ex6() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 6");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel altura = new JLabel ("Altura (Metros)");
		altura.setHorizontalAlignment(SwingConstants.CENTER);
		altura.setBounds(10, 0, 120, 35);
		contentPane.add(altura);
		
		JLabel peso = new JLabel ("Peso (KG)");
		peso.setHorizontalAlignment(SwingConstants.CENTER);
		peso.setBounds(130, 0, 120, 35);
		contentPane.add(peso);
		
		JLabel imc = new JLabel ("IMC");
		imc.setHorizontalAlignment(SwingConstants.CENTER);
		imc.setBounds(239, 0, 115, 35);
		contentPane.add(imc);
		
		
		JTextField TF1 = new JTextField();
		TF1.setBounds(20, 36, 92, 29);
		contentPane.add(TF1);
		
		JTextField TF2 = new JTextField();
		TF2.setBounds(140, 36, 92, 29);
		contentPane.add(TF2);
		
		JTextField TF3 = new JTextField();
		TF3.setBounds(249, 36, 92, 29);
		contentPane.add(TF3);
		
		JButton BS1 = new JButton ();
		BS1.setText("Calcular IMC");
		BS1.setBounds(130, 161, 92, 29);
		contentPane.add(BS1);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TF1V = TF1.getText();
				String TF2V = TF2.getText();
				double V1 = Double.parseDouble(TF1V);
				V1= Math.pow(V1,2);
				double V2 = Double.parseDouble(TF2V);
				double imc = V2/V1;		
				TF3.setText(Double.toString(imc));
			}
		};
		
		BS1.addActionListener(al);
		
	}

}
