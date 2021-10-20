package es.studium.Longitud;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		//Declaramos la variable necesaria de tipo Cadena
		String frase;

		//Iniciamos la herramienta para el tecaldo
		Scanner teclado = new Scanner(System.in);

		//Solicitamos se escriba una frase
		System.out.println("Escriba una frase");

		//Leemos por teclado y lo ponemos en la variable frase1
		frase = teclado.nextLine();

		//Cerramos el teclado
		teclado.close();
		
		//Mostramos por pantalla los dos resultados

		System.out.println("La frase tiene" + " " + conCaracteres(frase)
		+ " caracteres contando los espacios en blanco");

		System.out.println("La frase tiene" + " " + sinCaracteres(frase)
		+ " caracteres sin contar los espacios en blanco");
	}
	// Funci�n para contar todos los caracteres
	public static int conCaracteres(String frase)
	{
		return (frase.length());
	}
	
	// Funci�n para contar sin los caracteres
	public static int sinCaracteres(String frase)
	{
		//Declaraci�n de variables e iniciado de espacios a cero
		int espacios;
		int i;
		espacios = 0;
		//Para recorrer la frase
		for(i = 0; i < frase.length(); i++)
		{
			//Si localiza un espacio en blanco (que es un caracter)
			if(frase.charAt(i) == ' ')
			{
				//A�ade al contador "espacios" un valor m�s
				espacios++;
			}
		}
		// Devuelve la longitud de la frase (con espacios y todo) 
		// Menos los espacios localizados
		return (frase.length() - espacios);
	}
}