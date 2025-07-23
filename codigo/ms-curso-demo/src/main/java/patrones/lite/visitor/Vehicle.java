package patrones.lite.visitor;

public interface Vehicle {

    int accept(VehicleInspector vehicleInspector);

}
