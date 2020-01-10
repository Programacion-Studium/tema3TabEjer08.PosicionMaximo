package es.Studium.TabEjer8Tema3;

import java.util.Scanner;

public class PosicionMaximo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[10];
		int i, valorMax=0;
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<tabla.length;i++)
		{
			System.out.println("Ingrese el " +(i+1)+" Valor:");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		for (i=0;i<tabla.length;i++)
		{
			if(valorMax<=tabla[i])
			{
				valorMax=tabla[i];
			}
		}
		System.out.println("El valor maximo es "+ valorMax);
		for (i=0;i<tabla.length;i++)
		{
			if(tabla[i]==valorMax)
			{
				System.out.println("El valor maximo "+valorMax+" aparece en la posicion "+i);
			}
		}
	}

}
