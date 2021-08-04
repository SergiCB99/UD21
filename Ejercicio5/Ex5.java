package UD21.Ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Ex5 extends JFrame {

	private JPanel contentPane;
	public Ex5() {

		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 5");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JButton BS1 = new JButton ();
		BS1.setText("Limpiar");
		BS1.setBounds(0, 0, 354, 35);
		contentPane.add(BS1);
		
		JTextArea TA = new JTextArea();
		TA.setBounds(10, 50, 334, 200);
		TA.setWrapStyleWord(true);
		TA.setLineWrap(true);
		contentPane.add(TA);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TA.setText(" ");
			}
		};
		
		MouseListener ml = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				TA.append("Raton clicked en el Text Area ");
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				TA.append("Raton encima del Text Area ");
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				TA.append("Raton fuera del Text Area ");
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				TA.append("Raton pressed en el Text Area ");
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				TA.append("Raton soltado en el Text Area ");
				
			}
			
		};
		
		TA.addMouseListener(ml);
		BS1.addActionListener(al);
		
		
	}

}
