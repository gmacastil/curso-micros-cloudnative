package patrones.lite.visitor;

public class VehicleInspection implements VehicleInspector{


    @Override
    public int visit(Car car) {
        int serviceCharge = 0;
        if(car.getColor()=="Black"){
            serviceCharge += 100;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Service Charge for Car: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visit(Van van) {
        int serviceCharge = 0;
        if(van.getNumberOfDoors()>4){
            serviceCharge += 500;
        }else{
            serviceCharge += 100;
        }
        System.out.println("Service Charge for Van: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visit(Motorbike motorbike) {
        int serviceCharge = 0;
        if(motorbike.getEngineCapacity()>=200){
            serviceCharge += 200;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Service Charge for Motorbike: " + serviceCharge);
        return serviceCharge;
    }
}
