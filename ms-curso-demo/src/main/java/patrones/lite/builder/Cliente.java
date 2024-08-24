package patrones.lite.builder;

public class Cliente {
	public static void main(String[] args) {
		IDP fabricaPersonas = new IDP();
		// The client wants a simple and small car
		
		PersonBuilderLDAP builderLDAP = new PersonBuilderLDAP();
		PersonBuilderAWS buiderAWS = new PersonBuilderAWS();
		
		
		
		fabricaPersonas.createSmallCar(builderLDAP);
		
		
		Person car = builderLDAP.getPerson();
		System.out.println("My :" + car.getCarType() + " car");
	}
}
