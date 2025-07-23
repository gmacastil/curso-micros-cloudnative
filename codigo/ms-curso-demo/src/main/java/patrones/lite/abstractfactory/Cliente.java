package patrones.lite.abstractfactory;

public class Cliente {

	public static void main(String[] args) {
		AnimalFactory af = new AnimalFactory();
		Animal p = af.create("Pato");
		System.out.println(p.getAnimal());
	}

}
