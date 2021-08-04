package UD21.Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ex4 extends JFrame {

	private JPanel contentPane;
	public Ex4() {
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 4");
		
		setBounds(400,20,370,300);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel ("Eventos");
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setBounds(0, 0, 354, 35);
		contentPane.add(etiqueta);
		
		JTextArea TA = new JTextArea();
		TA.setBounds(10, 50, 334, 200);
		TA.setWrapStyleWord(true);
		TA.setLineWrap(true);
		contentPane.add(TA);
		
		FocusListener fl = new FocusListener() {

			public void focusGained(FocusEvent e) {
				TA.setText("Text Field seleccionado");
			}
			public void focusLost(FocusEvent e) {
				TA.setText("Text Field no seleccionado");
			}

		};

		KeyListener kl = new KeyListener() {

			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void keyTyped(KeyEvent arg0) {
				TA.setText("Tecla Pulsada");
			}
			
		};
		
		MouseListener ml = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				TA.setText("Raton encima del Text Area");
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				TA.setText("Raton fuera del Text Area");
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		TA.addFocusListener(fl);
		TA.addKeyListener(kl);
		TA.addMouseListener(ml);
		
		
	}

}
