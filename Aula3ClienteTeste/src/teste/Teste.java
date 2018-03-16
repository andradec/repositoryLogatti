package teste;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JOptionPane;

import util.IChatAula;
import util.Message;


public class Teste {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Bem vindo ao chat, qual o seu Nome ?");
		String msgp = "";
	
		try {
			while(msgp != "0") {
				msgp = JOptionPane.showInputDialog("Chat  - "+ nome + " Entre com a menssagem. (Entre com o 0 para sair)");
				IChatAula objChat = (IChatAula) Naming.lookup("rmi://localhost:8282/chat");
				Message msg = new Message(nome, msgp);
				objChat.sendMessage(msg);
				System.out.println(returnMessage(objChat.retrieveMessage()));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		
	}
	
	private static String returnMessage(List<Message> lst) {
		
		String valor = "";
		for (Message message : lst) {
			valor += message.getUsuario() + " : " +message.getMessage() + "\n";
		}
		return valor;
	}
	
	
	

}
