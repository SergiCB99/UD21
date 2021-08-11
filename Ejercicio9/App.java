package UD21.Ejercicio9;

import java.awt.Color;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    
	/*
	 * Declaramos el arraylist que contendra todos los colores
	 * Es arraylist para poder mezclarlo facilmente 
	*/
    ArrayList<Color> colores = new ArrayList<>();
	
    //Añadimos 16 colores
	colores.add(Color.red);
	colores.add(Color.green);
	colores.add(Color.blue);
	colores.add(Color.yellow);
	colores.add(Color.pink);
	colores.add(Color.white);
	colores.add(Color.black);
	colores.add(Color.orange);
	colores.add(Color.red);
	colores.add(Color.green);
	colores.add(Color.blue);
	colores.add(Color.yellow);
	colores.add(Color.pink);
	colores.add(Color.white);
	colores.add(Color.black);
	colores.add(Color.orange);
	
	//System.out.println(colores.toString());
	
	Ex9 app = new Ex9(colores);
	
  }
}
