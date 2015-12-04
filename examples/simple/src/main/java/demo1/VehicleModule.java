package demo1;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Wang on 15/12/4.
 */
@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }
    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }

}
