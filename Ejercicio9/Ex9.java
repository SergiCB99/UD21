package UD21.Ejercicio9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.*;

public class Ex9 extends JFrame {
	
	JToggleButton[] girados = new JToggleButton[2];
	
	boolean dos_giradas = false;
	
	Random rand = new Random();
	
	private JPanel contentPane;
	public Ex9(ArrayList colores) {

		//Mezclamos el arraylist colores
		Collections.shuffle(colores);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setTitle("Ex 9");
		
		setBounds(400,20,310,365);
	
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JToggleButton TB1 = new JToggleButton();
        TB1.setBounds(0, 0, 76, 84);
        TB1.setSelected(true);
        contentPane.add(TB1);
        
        JToggleButton TB2 = new JToggleButton();
        TB2.setBounds(75, 0, 76, 84);
        TB2.setSelected(true);
        contentPane.add(TB2);
        
        JToggleButton TB3 = new JToggleButton();
        TB3.setBounds(150, 0, 76, 84);
        TB3.setSelected(true);
        contentPane.add(TB3);
        
        JToggleButton TB4 = new JToggleButton();
        TB4.setBounds(224, 0, 76, 84);
        TB4.setSelected(true);
        contentPane.add(TB4);
        
        JToggleButton TB5 = new JToggleButton();
        TB5.setBounds(0, 83, 76, 84);
        TB5.setSelected(true);
        contentPane.add(TB5);
        
        JToggleButton TB6 = new JToggleButton();
        TB6.setBounds(75, 83, 76, 84);
        TB6.setSelected(true);
        contentPane.add(TB6);
        
        JToggleButton TB7 = new JToggleButton();
        TB7.setBounds(150, 83, 76, 84);
        TB7.setSelected(true);
        contentPane.add(TB7);
        
        JToggleButton TB8 = new JToggleButton();
        TB8.setBounds(224, 83, 76, 84);
        TB8.setSelected(true);
        contentPane.add(TB8);
        
        JToggleButton TB9 = new JToggleButton();
        TB9.setBounds(0, 166, 76, 84);
        TB9.setSelected(true);
        contentPane.add(TB9);
        
        JToggleButton TB10 = new JToggleButton();
        TB10.setBounds(75, 166, 76, 84);
        TB10.setSelected(true);
        contentPane.add(TB10);
        
        JToggleButton TB11 = new JToggleButton();
        TB11.setBounds(150, 166, 76, 84);
        TB11.setSelected(true);
        contentPane.add(TB11);
        
        JToggleButton TB12 = new JToggleButton();
        TB12.setBounds(224, 166, 76, 84);
        TB12.setSelected(true);
        contentPane.add(TB12);
        
        JToggleButton TB13 = new JToggleButton();
        TB13.setBounds(0, 249, 76, 84);
        TB13.setSelected(true);
        contentPane.add(TB13);
        
        JToggleButton TB14 = new JToggleButton();
        TB14.setBounds(75, 249, 76, 84);
        TB14.setSelected(true);
        contentPane.add(TB14);
        
        JToggleButton TB15 = new JToggleButton();
        TB15.setBounds(149, 249, 76, 84);
        TB15.setSelected(true);
        contentPane.add(TB15);
        
        JToggleButton TB16 = new JToggleButton();
        TB16.setBounds(224, 249, 76, 84);
        TB16.setSelected(true);
        contentPane.add(TB16);
        
        ActionListener al1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JToggleButton source = (JToggleButton)e.getSource();
				
				if(girados[1]==null) {
					if(girados[0]==null) {
						girados[0]=source;
					}else {
						girados[1]=source;
						dos_giradas=true;
					}
					
					if(source==TB1) {
						TB1.setBackground((Color) colores.get(0));
					}else if(source==TB2) {
						TB2.setBackground((Color) colores.get(1));
					}else if(source==TB3) {
						TB3.setBackground((Color) colores.get(2));
					}else if(source==TB4) {
						TB4.setBackground((Color) colores.get(3));
					}else if(source==TB5) {
						TB5.setBackground((Color) colores.get(4));
					}else if(source==TB6) {
						TB6.setBackground((Color) colores.get(5));
					}else if(source==TB7) {
						TB7.setBackground((Color) colores.get(6));
					}else if(source==TB8) {
						TB8.setBackground((Color) colores.get(7));
					}else if(source==TB9) {
						TB9.setBackground((Color) colores.get(8));
					}else if(source==TB10) {
						TB10.setBackground((Color) colores.get(9));
					}else if(source==TB11) {
						TB11.setBackground((Color) colores.get(10));
					}else if(source==TB12) {
						TB12.setBackground((Color) colores.get(11));
					}else if(source==TB13) {
						TB13.setBackground((Color) colores.get(12));
					}else if(source==TB14) {
						TB14.setBackground((Color) colores.get(13));
					}else if(source==TB15) {
						TB15.setBackground((Color) colores.get(14));
					}else if(source==TB16) {
						TB16.setBackground((Color) colores.get(15));
					}
					
				}
				
				if(girados[1]!=null) {
					//comprovarColores(girados,dos_giradas);
				}
			}
          };
          
        TB1.addActionListener(al1);
        TB2.addActionListener(al1);
        TB3.addActionListener(al1);
        TB4.addActionListener(al1);
        TB5.addActionListener(al1);
        TB6.addActionListener(al1);
        TB7.addActionListener(al1);
        TB8.addActionListener(al1);
        TB9.addActionListener(al1);
        TB10.addActionListener(al1);
        TB11.addActionListener(al1);
        TB12.addActionListener(al1);
        TB13.addActionListener(al1);
        TB14.addActionListener(al1);
        TB15.addActionListener(al1);
        TB16.addActionListener(al1);
        
	}
	
	public static boolean comprovarColores(JToggleButton[] girados,boolean dos_giradas) {
		boolean acertado = false;
		
		if(girados[0].getBackground() == girados[1].getBackground()) {
			setTimeout(()->girados[0].setEnabled(false), 1000);
			setTimeout(()->girados[1].setEnabled(false), 1000);
			dos_giradas = false;
			girados[0]=null;
			girados[1]=null;
			acertado=true;
			System.out.println("Acertado");
		}else {
			setTimeout(()->girarCartas(girados), 1000);
			dos_giradas = false;
			girados[0]=null;
			girados[1]=null;
			acertado=false;
			System.out.println("Fallado");
		}
		
		return acertado;
		
	}
	
	public static void girarCartas(JToggleButton[] girados) {

		girados[0].setSelected(true);
		girados[1].setSelected(true);
	
	}
	
	//Funcion Copiada
	public static void setTimeout(Runnable runnable, int delay){
	    new Thread(() -> {
	        try {
	            Thread.sleep(delay);
	            runnable.run();
	        }
	        catch (Exception e){
	            System.err.println(e);
	        }
	    }).start();
	}
}
