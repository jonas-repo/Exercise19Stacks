package com.exercise19stacks.app;

import java.util.Stack;

import java.util.Iterator;

public class StacksAndHeaps {

	public static void main(String[] args) {
		
		//variables declaration
		String cadena =  "Lorem ipsum dolor sit amet, consectetur Adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
				+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit Anim id est laborum";
		
		//objects
		Stack<Character> letters =  new Stack<Character>();
		char[] lettersArray =  cadena.toCharArray();
		
		
		//process
		for(Character character : lettersArray)
		{
			if(character.toUpperCase(character) == 'A' || character == 'a')
			{
				letters.push(character);
			}
		}
		
		//show results and emptying the stack by pop method
		while(!letters.isEmpty())
		{
			System.out.println("Whiile pop: "+letters.pop());
		}
		
		
			
	}

}
