package exceptions;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class TestaException {
	
	

	public static void main(String[] args) {
	
			
		try {
			doSomething();
		} catch (Exception e) {
			doOtherStuff();
		} finally {
			System.out.println("Finalmente");
		}
		
		Servico s = new Servico();
		
		
		try {
			s.getCodigo();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	private static void doOtherStuff() {
		
		System.out.println("Voltar estado original do objeto");
		
	}


	public static void doSomething() throws Exception {
		System.out.println("Processando objeto");
		throw new Exception("Deu erro!");
		
		
	}

}
