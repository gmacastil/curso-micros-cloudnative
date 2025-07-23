package patrones.lite.builder;

public class Person {

	private PersonType carType;
	private Integer seats;
	private Integer bigWheels;
	private Engine engine;
	private Boolean leatherSeats;
	private Integer batteries;
	private Boolean convertible;
	private Boolean electricCar;

	public Person(PersonType carType, Integer seats, Integer bigWheels, Engine engine, Boolean leatherSeats,
			Integer batteries, Boolean convertible, Boolean electricCar) {
		this.carType = carType;
		this.seats = seats;
		this.bigWheels = bigWheels;
		this.engine = engine;
		this.leatherSeats = leatherSeats;
		this.batteries = batteries;
		this.convertible = convertible;
		this.electricCar = electricCar;
	}

	public PersonType getCarType() {
		return carType;
	}

	public void setCarType(PersonType carType) {
		this.carType = carType;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getBigWheels() {
		return bigWheels;
	}

	public void setBigWheels(Integer bigWheels) {
		this.bigWheels = bigWheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Boolean getLeatherSeats() {
		return leatherSeats;
	}

	public void setLeatherSeats(Boolean leatherSeats) {
		this.leatherSeats = leatherSeats;
	}

	public Integer getBatteries() {
		return batteries;
	}

	public void setBatteries(Integer batteries) {
		this.batteries = batteries;
	}

	public Boolean getConvertible() {
		return convertible;
	}

	public void setConvertible(Boolean convertible) {
		this.convertible = convertible;
	}

	public Boolean getElectricCar() {
		return electricCar;
	}

	public void setElectricCar(Boolean electricCar) {
		this.electricCar = electricCar;
	}

}
