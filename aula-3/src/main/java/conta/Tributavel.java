package conta;

public interface Tributavel {
	
	// termos didaticos
	static final int intParaMim = 3;
	
	double getValorimposto();
	
	double debitarValorImposto(double valor);

}
