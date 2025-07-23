package patrones.lite.builder;

public class Engine {
	private Integer engineCapacity;

	public Integer getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Integer engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Engine(Integer engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
}
