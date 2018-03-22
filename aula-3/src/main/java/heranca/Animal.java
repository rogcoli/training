package heranca;

public abstract class Animal {

	String nome;
	String idade;
	
	// depois de modificada para abstract foi comentado
//	public void emitesom() {
//		System.out.println("som!");
//	}
	
	public abstract void emitesom();

	public void corre() {
		System.out.println("corre!");
	}

}
