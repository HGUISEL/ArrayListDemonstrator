package edu.handong.csee.java.example;

import java.util.ArrayList;
import java.util.HashMap;

import edu.handong.csee.java.example.data.Message;

public class ChatMessageCounter {
	
	String[] messages = {"JC, my message1","JC, my message2",
							"JH, Good message1",
							"YH, great message1",
							"JC, Good message5",
										};
	

	public static void main(String[] args) {
		
		ChatMessageCounter myCounter = new ChatMessageCounter();
		
		myCounter.run();
		
	}

	private void run() {
		
		HashMap<String,ArrayList<String>> myMap = new HashMap<String,ArrayList<String>> ();
		
		for(String message: messages) {
			
			Message currentMessage = new Message(message);
			
			if(!myMap.containsKey(currentMessage.getWriter())) {
				
				ArrayList<String> messagesForAWriter = new ArrayList<String>();
				
				messagesForAWriter.add(currentMessage.getMessage());
				
				myMap.put(currentMessage.getWriter(), messagesForAWriter);
				
			} else {
				
				ArrayList<String> existingArrayList = myMap.get(currentMessage.getWriter());
				existingArrayList.add(currentMessage.getMessage());
				
			}
				
		}
		
		
		for(String key:myMap.keySet()) {
			
			System.out.println("Writer:" + key);
			System.out.println(myMap.get(key).size());
			
			
			for(String message: myMap.get(key)) {
				
				System.out.println(message);
				
			}
			
			System.out.println();
			
		}
		
		
	}

}
