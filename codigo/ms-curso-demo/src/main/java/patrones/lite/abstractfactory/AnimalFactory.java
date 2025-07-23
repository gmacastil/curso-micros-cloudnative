package patrones.lite.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Perro".equalsIgnoreCase(animalType)) {
            return new Perro();
        } else if ("Pato".equalsIgnoreCase(animalType)) {
            return new Pato();
        }

        return null;
    }

}
