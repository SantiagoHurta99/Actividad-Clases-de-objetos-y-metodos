package Punto_3;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		int weight = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del animal:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del animal:"));
		int speed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del animal:"));
		Animal a2 = new Animal(weight, height, speed);
		
		JOptionPane.showMessageDialog(null, "El animal 1 tiene una velocidad de " + a1.getSpeed() + " miles per hour");
		JOptionPane.showMessageDialog(null, "El animal 2 tiene una velocidad de " + a2.getSpeed() + " miles per hour");
	}
}
