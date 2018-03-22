package heranca;

public class Preguica extends Animal {
	
	public void algo() {
		System.out.println("X");
	}
	
	public void algo(String arg) {
		
		algo();
		
		
		System.out.println("Y");
	}
	
	
	
	@Override
	public void corre() {
		
		//this.algo();
		
		
		//super.corre();
		
		System.out.println("Ops, eu nao corro!");
	}

	@Override
	public void emitesom() {
		System.out.println("Brzzz!");
	}


}
