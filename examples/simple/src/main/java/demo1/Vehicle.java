package demo1;

/**
 * Created by Wang on 15/12/4.
 */
public class Vehicle {

    private Motor motor;

    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}