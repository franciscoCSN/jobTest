package br.com.jobTest3;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		//Quastão 3 -> a) 
    	int limite = 0;
		int elemento = 0;
		Stack<Integer> sequencia1 = new Stack<Integer>();
		sequencia1.push(1);
		int i = 1;
		while(sequencia1.size() < 10) {
			elemento  = sequencia1.elementAt(i-1) + 2;
			sequencia1.push(elemento);
			i++;
		}
		System.out.println("Questão 3:");
		System.out.println("a) " + sequencia1);
		
		//Quastão 3 -> a) 
    	
		elemento = 0;
		sequencia1 = new Stack<Integer>();
		sequencia1.push(2);
		i = 1;
		while(sequencia1.size() < 10) {
			elemento  = sequencia1.elementAt(i-1) * 2;
			sequencia1.push(elemento);
			i++;
		}
		
		System.out.println("b) " + sequencia1);
		
		
		//Quastão 3 -> c) 
    	
		elemento = 0;
		sequencia1 = new Stack<Integer>();
		
		i = 0;
		while(sequencia1.size() < 10) {
			elemento  = i * i;
			sequencia1.push(elemento);
			i++;
		}
		
		System.out.println("c) " + sequencia1);
		
		
		//Quastão 3 -> d) 
	
		elemento = 0;
		int k = 1;
		int t = 1;
		sequencia1 = new Stack<Integer>();
		sequencia1.push(4);
		
		while(sequencia1.size() < 10) {
			k = k + 2;
			t = t+k;
			elemento  = t*4 ;
			sequencia1.push(elemento);
			
		}
		System.out.println("d) " + sequencia1);
	
				
		sequencia1 = new Stack<Integer>();
		sequencia1.push(1);
		sequencia1.push(1);
		
		i = 1;
		while(sequencia1.size() < 10) {
			elemento  = sequencia1.elementAt(i-1) + sequencia1.elementAt(i);
			sequencia1.push(elemento);
			
			i++;
		}
		System.out.println("e) " + sequencia1);
		
		System.out.println("f) " + "[2,10,12,16,17,18,19, 200]");
				
				
    }
}
