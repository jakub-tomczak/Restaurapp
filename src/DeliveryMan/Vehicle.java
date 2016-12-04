package DeliveryMan;

import Map.Position;

import java.util.Calendar;

/**
 * Created by Jakub on 04.12.2016.
 */
public class Vehicle {
    private String name;
    private String licensePlateNumber;
    private int fuelingTime; //in seconds
    private boolean readyToUse;
    private Calendar fuelingEnd;
    private float fuelingCoefficient;
    private float tankVolume;
    private float velocity;

    //set readyToUse when fueling finished
    public void PrepareToGo() {

    }

    //sleep for fuelingTime
    public void Fuel() {

    }

    public Position dPosition(Position oldPosition) {
        return null;
    }

    public enum DriversLicenseCategory {
        A,
        A1,
        B,
        none
    }

}
