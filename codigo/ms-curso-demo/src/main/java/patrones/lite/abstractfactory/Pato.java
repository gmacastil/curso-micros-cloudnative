package patrones.lite.abstractfactory;

public class Pato implements Animal {

    @Override
    public String getAnimal() {
        return "Pato";
    }

    @Override
    public String makeSound() {
        return "Grazna";
    }
}
