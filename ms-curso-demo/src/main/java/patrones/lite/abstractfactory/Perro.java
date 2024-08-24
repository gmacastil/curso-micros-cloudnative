package patrones.lite.abstractfactory;

public class Perro implements Animal {

    @Override
    public String getAnimal() {
        return "Perro";
    }

    @Override
    public String makeSound() {
        return "Ladra";
    }
}
