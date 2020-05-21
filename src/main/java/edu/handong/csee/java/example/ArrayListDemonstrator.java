package edu.handong.csee.java.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemonstrator {

	public static void main(String[] args) {
		
		ArrayListDemonstrator demonstrator = new ArrayListDemonstrator();
		
		demonstrator.run();

	}

	private void run() {
		
		ArrayList<String> toDoList = new ArrayList<String>();
        
		System.out.println("Enter items for the list, when prompted.");
        
		boolean done = false;
        
		Scanner keyboard = new Scanner(System.in); 
		while(!done) {
            System.out.println("Type an entry:");
            String entry = keyboard.nextLine();
            toDoList.add(entry);
            System.out.print("More items for the list? ");
            String ans = keyboard.nextLine();
            if(!ans.equalsIgnoreCase("yes"))
                done = true;
        }
       
		System.out.println("The list contains:");
        
		int listSize = toDoList.size();
        for(int position = 0 ; position < listSize ; position++)
            System.out.println(toDoList.get(position));
        
        keyboard.close();
		
	}

}
