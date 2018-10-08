package eu.burmov.crudrestnotes.rest;

public class NoteErrorResponse {
	
	private int status;
	private String[] messages;
	private long timestamp;
	
	// Constructors
	public NoteErrorResponse() {}
	public NoteErrorResponse(int status, String[] message, long timestamp) {
		this.status = status;
		this.messages = message;
		this.timestamp = timestamp;
	}
	
	// Getters and setters
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String[] getMessages() {
		return messages;
	}
	public void setMessages(String[] messages) {
		this.messages = messages;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
