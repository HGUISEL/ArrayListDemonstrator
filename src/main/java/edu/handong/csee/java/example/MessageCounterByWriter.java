package edu.handong.csee.java.example;

import java.util.ArrayList;
import java.util.HashMap;

import edu.handong.csee.java.example.data.Message;

public class MessageCounterByWriter {
	
	String[] messages = {"JC, Test", "YH, Good","JC, Test 2", "JH, Message2"};

	public static void main(String[] args) {
		MessageCounterByWriter counter = new MessageCounterByWriter();
		
		counter.run();

	}

	private void run() {
		
		HashMap<String,ArrayList<String>> myMap = new HashMap<String,ArrayList<String>>();
		// you may define the value part just using Message class. What a convenient!!
		// HashMap<String,ArrayList<Message>> myMap = new HashMap<String,ArrayList<Message>>();
		
		for(String message:messages) {
			
			Message newMessage = new Message(message);
			
			if(myMap.containsKey(newMessage.getWriter())) {
				
				ArrayList<String> currentList = myMap.get(newMessage.getWriter());
				
				currentList.add(newMessage.getMessage());
				
			} else {
				
				myMap.put(newMessage.getWriter(), new ArrayList<String>());
				
				myMap.get(newMessage.getWriter()).add(newMessage.getMessage());
					
			}
			
		}
		
		for(String key: myMap.keySet()) {
			
			System.out.println(key + "'s messages:");
			
			ArrayList<String> currentList = myMap.get(key);
			
			System.out.println(currentList.size() + " message(s)!");
			
			for(String message:myMap.get(key))
				System.out.println(message);
			
			System.out.println();
		}
	}
}
