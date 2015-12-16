package demo1;

/**
 * Created by Wang on 15/12/4.
 */

public class Motor {

    private int rpm;
    private String motorName;

    public Motor() {
        this.rpm = 1;
    }

    public Motor(String motor) {
        this.rpm = 66;
        this.motorName = motor;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 20;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "rpm=" + rpm +
                ", motorName='" + motorName + '\'' +
                '}';
    }
}