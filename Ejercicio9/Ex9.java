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
	
	//Array en el que guardaremos los botones pulsados
	protected static JToggleButton[] cartas_giradas = new JToggleButton[2];
	
	//Booleano que nos ayudara a controlar que no se puedan clicar mas de dos botones
	protected static boolean tirar = true;
	
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
        
        //Action listener asignado a cada boton
        ActionListener al1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Recoge que boton se ha clicado
				JToggleButton source = (JToggleButton)e.getSource();
					
					//Si cumple esta condicion quiere decir que no hay dos botones clicados y podra clicar otro
					if(tirar) {
						//Dependiendo del boton le assignamos un color
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
					
						//Guardamos los botones clicados
						if(cartas_giradas[0]==null) {
							cartas_giradas[0]=source;
						}else {
							cartas_giradas[1]=source;
							tirar=false;
						}
							
						//Este if nos comprueba que ya haya 2 botones clicados
						if(cartas_giradas[1]!=null) {
							//Comprovamos que no se el mismo boton dos veces
							if(cartas_giradas[0] != cartas_giradas[1]) {
								comprovarColores();
							}else {
								//Si es el mismo boton giramos los botones, vaciamos el array y seteamos el booleano a true para poder seguir jugando
								System.out.println("No puedes seleccionar la misma carta");
								girarCartas();
								resetearArray();
								tirar=true;
							}
						}
						
					//Si el primer if no entrara entraria en este else
					}else {
						/*
						 * Giramos "el tercer boton" y vaciamos el array con un timeout de 1300
						 * para que le de tiempo a la funcion comprovarColores()
						 */
						source.setSelected(true);
						System.out.println("Ya hay 2 cartas giradas");
						setTimeout(()->resetearArray(), 1300);
					}
					
			}
          };
          
         //Asignamos el Action Listener a todos los botones
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
	
	//Funcion que comprueva el background de los botones
	public static void comprovarColores() {
		
		//Si entre en el if es que los backgrounds son iguales
		if(cartas_giradas[0].getBackground()==cartas_giradas[1].getBackground()) {
			//Descativamos los botones con un timeout para "hacerlo bonito"
			setTimeout(()->desactivarCartas(), 1000);
			System.out.println("Acierto");
			//Vaciamos el array con un timeout mayor que el anterior porque sino podrias llenarlo y los botones aun no estarian desactivados
			setTimeout(()->resetearArray(), 1100);
			//Seteamos el booleano a true con un timeout mayor al anterior porque sino podrias tirar y el array aun estaria lleno
			setTimeout(()->tirar=true, 1200);
		//Si no tienen el mismo background
		}else {
			//Giramos los botones con un timeout para "hacerlo bonito"			
			setTimeout(()->girarCartas(), 1000);
			System.out.println("Fallo");
			//Vaciamos el array con un timeout mayor que el anterior porque sino podrias llenarlo y los botones aun no estarian desactivados
			setTimeout(()->resetearArray(), 1100);
			//Seteamos el booleano a true con un timeout mayor al anterior porque sino podrias tirar y el array aun estaria lleno
			setTimeout(()->tirar=true, 1200);
		}
		
	}
	
	//Funcion que desactiva los botones
	public static void desactivarCartas() {

		cartas_giradas[0].setVisible(false);
		cartas_giradas[1].setVisible(false);
	
	}
	
	//Funcion que gira los botones
	public static void girarCartas() {

		cartas_giradas[0].setSelected(true);
		cartas_giradas[1].setSelected(true);
	
	}
	
	//Funcion que vacia el array
	public static void resetearArray() {

		cartas_giradas[0]=null;
		cartas_giradas[1]=null;
		
	}
	
	/*
	 * FUNCION COPIADA
	 * Se que se puede hacer sin timeout pero para como ya has visto en otros comentarios
	 * la he usado para "hacerlo bonito"
	 */
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
