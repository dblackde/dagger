package demo1;

import javax.inject.Inject;

/**
 * Created by Wang on 15/12/4.
 */
public class Mian {

    @Inject
    public Motor motor;

    public void run() {
        VehicleComponent component = DaggerVehicleComponent.builder().build();
        Vehicle vehicle = component.provideVehicle();
        component.inject(this);
        System.out.println(vehicle.getSpeed());
        System.out.println(motor.toString());
    }

    public static void main(String[] args) {
        new Mian().run();
    }
}
