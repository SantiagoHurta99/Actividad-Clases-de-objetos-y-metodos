package Punto_7_8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suitNumber = 0;
		int faceNumber = 0;
		int totalPuntos = 0;
		int contadorCartas = 0;
		for (int i = 0; i < 2; i++) {
			suitNumber = (int)(Math.random()*4.0+1);
			faceNumber = (int)(Math.random()*13.0+1);
			Card newCard = new Card(suitNumber,faceNumber);
			System.out.println(newCard);
			totalPuntos += newCard.points;
			contadorCartas++;
		}
		System.out.println("La cantidad total de puntos es: " + totalPuntos);
		while (totalPuntos < 21 && contadorCartas < 5) {
			System.out.print("Quiere otra carta? 1.Si 2.No: ");
			int op = sc.nextInt();
			if (op == 1) {
				suitNumber = (int)(Math.random()*4.0+1);
				faceNumber = (int)(Math.random()*13.0+1);
				Card newCard = new Card(suitNumber,faceNumber);
				System.out.println(newCard);
				totalPuntos += newCard.points;
				System.out.println("La cantidad total de puntos es: " + totalPuntos);
				contadorCartas++;
			} else {
				break;
			}
		}
	}

}
