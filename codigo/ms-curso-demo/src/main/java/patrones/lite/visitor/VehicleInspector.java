package patrones.lite.visitor;

public interface VehicleInspector {

    int visit(Car car);
    int visit(Van van);
    int visit(Motorbike motorbike);

}
