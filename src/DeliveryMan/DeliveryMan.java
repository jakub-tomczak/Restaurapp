package DeliveryMan;

import Map.Localizable;
import Map.Position;

import java.util.List;

/**
 * Created by Jakub on 04.12.2016.
 */
public class DeliveryMan implements Runnable, Localizable {
    private String firstName;
    private String lastName;
    private List<AvailabilityPeriod> availabilityPeriods;
    private boolean isCurrentlyAvailable;
    private Vehicle.DriversLicenseCategory driversLicenseCategory;
    private Vehicle currentVehicleInUse;
    private Position position;


    public DeliveryMan() {
        driversLicenseCategory = Vehicle.DriversLicenseCategory.none;
        currentVehicleInUse = null;

    }

    public void EmergencyReturnToRestaurant() {

    }

    public void DriveToClient() {
        ;
    }

    public void RegisterNewAvailabilityPeriod() {

    }

    public void DeleteAvailabilityPeriod() {
        //list all availabilityPeriods and select one that will be deleted

    }

    public void UpdateAvailabilityPeriod() {

    }

    public void ChooseVehicle() {

    }


    //getters,setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isCurrentlyAvailable() {
        return isCurrentlyAvailable;
    }

    public void setCurrentlyAvailable(boolean currentlyAvailable) {
        isCurrentlyAvailable = currentlyAvailable;
    }

    @Override
    public void run() {

    }

    @Override
    public void DrawOnMap() {

    }

    @Override
    public void AddMapDescription() {

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
