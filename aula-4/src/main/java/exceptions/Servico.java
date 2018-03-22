package exceptions;

import java.net.SocketException;

public class Servico {
	
	
	public int getCodigo() throws ServiceException{
		
		throw new ServiceException(new SocketException());
		
		//return 0;
	}

}
