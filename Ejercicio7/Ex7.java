package UD21.Ejercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex7 extends JFrame {

	private JPanel contentPane;
	public Ex7() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 7");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel CaC = new JLabel ("Cantidad a Convertir");
		CaC.setHorizontalAlignment(SwingConstants.CENTER);
		CaC.setBounds(10, 0, 120, 35);
		contentPane.add(CaC);
		
		JLabel r = new JLabel ("Resultado");
		r.setHorizontalAlignment(SwingConstants.CENTER);
		r.setBounds(239, 0, 115, 35);
		contentPane.add(r);
	
		JTextField TF1 = new JTextField();
		TF1.setBounds(20, 36, 92, 29);
		contentPane.add(TF1);
		
		JTextField TF2 = new JTextField();
		TF2.setBounds(249, 36, 92, 29);
		contentPane.add(TF2);
		
		JButton BS1 = new JButton ("Euros a Pesetas");
		BS1.setBounds(10, 99, 142, 29);
		contentPane.add(BS1);
		
		JButton BS2 = new JButton ("Cambiar Conversion");
		BS2.setBounds(199, 99, 142, 29);
		contentPane.add(BS2);
		
		ActionListener al1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String BS1V = BS1.getText();
				
				if(BS1V.equals("Euros a Pesetas")) {
					String TF1V = TF1.getText();
					double V1 = Double.parseDouble(TF1V);
					double cambio = V1*166.386;
					TF2.setText(Double.toString(cambio));
				}else if(BS1V.equals("Pesetas a Euros")) {
					String TF1V = TF1.getText();
					double V1 = Double.parseDouble(TF1V);
					double cambio = V1/166.386;
					TF2.setText(Double.toString(cambio));
				}
					
			}
		};
		
		ActionListener CC = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String BS1V = BS1.getText();
				
				if(BS1V.equals("Euros a Pesetas")) {
					BS1.setText("Pesetas a Euros");
				}else if(BS1V.equals("Pesetas a Euros")) {
					BS1.setText("Euros a Pesetas");
				}
					
			}
		};
		
		
		BS1.addActionListener(al1);
		BS2.addActionListener(CC);
		
	}

}
