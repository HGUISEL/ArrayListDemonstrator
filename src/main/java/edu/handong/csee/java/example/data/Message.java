package edu.handong.csee.java.example.data;

public class Message {
	
	private String writer;
	private String message;
	
	
	public Message(String originalMessage) {
		
		String[] splitMessage = originalMessage.split(",");
		
		writer = splitMessage[0].trim();
		message = splitMessage[1].trim();
		
	}
	
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
