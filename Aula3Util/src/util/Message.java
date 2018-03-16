package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String user;
	private String message;
	
	private static List<Message> LstMessage = new ArrayList<Message>();
	
	public Message(String user, String message) {
		this.user = user;
		this.message = message;
	}

	public String getUsuario() {
		return user;
	}

	public void setUsuario(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static List<Message> getLstMessage(){
		return LstMessage;
	}
	
	public static void setLstMessage(Message msg) {
		LstMessage.add(msg);
	}

}
