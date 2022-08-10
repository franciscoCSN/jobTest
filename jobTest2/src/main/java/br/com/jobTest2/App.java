package br.com.jobTest2;

import java.util.Scanner;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Questão 2
    	System.out.println("Informe um numero inteiro.");
    	
    	try (Scanner scanner = new Scanner(System.in)) {
			int limite = scanner.nextInt();
			int elemento = 0;
			Stack<Integer> sequencia = new Stack<Integer>();
			
			sequencia.push(0);
			sequencia.push(1);
			
			int i = 1;
			while(elemento < limite) {
				elemento  = sequencia.elementAt(i-1) + sequencia.elementAt(i);
				sequencia.push(elemento);
				
				i++;
			}
			System.out.println(sequencia);
			System.out.println("");
			if(sequencia.contains(limite)) {
				System.out.println("O numero "+limite+" pertence a sequencia Fibonacci.");
			}else {
				System.out.println("O numero "+limite+" nâo pertence a sequencia Fibonacci.");
			}
		}catch(Exception e) {
			System.out.println("Informe um numero inteiro.");
			System.out.println("Erro: " + e.getMessage());
		}
    }
}
