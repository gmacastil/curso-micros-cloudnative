package patrones.lite.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
