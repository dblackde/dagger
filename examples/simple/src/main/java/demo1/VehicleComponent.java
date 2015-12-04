package demo1;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by Wang on 15/12/4.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
