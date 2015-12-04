package demo1;

/**
 * Created by Wang on 15/12/4.
 */
public class Mian {
    public static void main(String[] args) {
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        Vehicle vehicle = component.provideVehicle();
        System.out.println(vehicle.getSpeed());
    }
}
