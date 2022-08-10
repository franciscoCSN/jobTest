package br.com.jobTest5;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
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
    	System.out.println("Escreva seu texto aqui.");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Stack<Character> stack = new Stack<Character>();
        
        CharacterIterator chariterator = new StringCharacterIterator(str); 
        while(chariterator.current() != CharacterIterator.DONE) {
        	stack.push(chariterator.current());
        	chariterator.next();
        }
        
        System.out.println(reverseStack(stack,stack.size()));
        
        
    }
    
    public static Stack<Character> reverseStack(Stack<Character> x, int arrayLength) {
	      Stack<Character> y = new Stack<Character>();
	      
	      for(int i=arrayLength - 1; i>=0; i--)
	      {
	    	  y.push(x.elementAt(i));
	          
	      }
	      System.out.println(x);
	      
	      return y;
	   }
}
