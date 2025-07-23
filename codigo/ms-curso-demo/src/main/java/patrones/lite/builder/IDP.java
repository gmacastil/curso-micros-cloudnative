package patrones.lite.builder;

public class IDP {
	public void createLuxuryCar(Builder builder) {
		builder.setCarType(PersonType.LUXURY);
		Engine engine = new Engine(2700);
		builder.setSeats(4);
		builder.setElectricCar(Boolean.TRUE);
		builder.setBatteries(2);
		builder.setConvertible(Boolean.TRUE);
		builder.setLeatherSeats(Boolean.TRUE);
		builder.setEngine(engine);
	}

	public void createSmallCar(Builder builder) {
		builder.setCarType(PersonType.SMALL);
		Engine engine = new Engine(1200);
		builder.setBatteries(1);
		builder.setEngine(engine);
		builder.setSeats(4);
	}

	public void createBerlinaCar(Builder builder) {
		builder.setCarType(PersonType.BERLINA);
		Engine engine = new Engine(1900);
		builder.setSeats(5);
		builder.setElectricCar(Boolean.TRUE);
		builder.setBatteries(2);
		builder.setEngine(engine);
	}

	public void createSportCar(Builder builder) {
		builder.setCarType(PersonType.SPORT);
		Engine engine = new Engine(5400);
		builder.setSeats(2);
		builder.setElectricCar(Boolean.TRUE);
		builder.setBatteries(2);
		builder.setConvertible(Boolean.TRUE);
		builder.setEngine(engine);
	}
}
