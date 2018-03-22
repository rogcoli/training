package heranca;

public class TestaHeranca {

	public static void main(String[] args) {

		// depois de modificada para abstract foi comentado
		// Animal a = new Animal();
		// System.out.println("-------------");
		// System.out.println("animal emitindo som: ");
		// a.emitesom();

		Animal b = new Cachorro();
		System.out.println("-------------");
		System.out.println("cachorro(Animal) emitindo som: ");
		// a.emitesom();

		Animal c = new Preguica();
		System.out.println("-------------");
		System.out.println("preguica(animal) emitindo som: ");
		// a.emitesom();

		Preguica d = new Preguica();
		System.out.println("-------------");
		System.out.println("preguica emitindo som: ");
		d.emitesom();

		System.out.println("preguica executando algo: ");
		d.algo();
		d.algo("X");

		System.out.println("-------------");
		System.out.println("-- ZOOLOGICO --");
		System.out.println("-------------");
		Zoologico z = new Zoologico();

		// z.prender(a, 0);
		z.prender(b, 1);
		z.prender(c, 2);
		z.prender(d, 3);

		// fazer os bichos emitirem som e correr
		z.tratar();

		System.out.println("-------------");
		System.out.println("-- ZOOLOGICO AS LIST--");
		System.out.println("-------------");
		ZoologicoList zl = new ZoologicoList();

		zl.prender(b);
		zl.prender(c);
		zl.prender(d);

		// fazer os bichos emitirem som e correr
		zl.tratar();

	}

}
