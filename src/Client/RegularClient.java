package Client;

import Map.Localizable;

/**
 * Created by Jakub on 04.12.2016.
 */
public class RegularClient extends IndividualClient implements Localizable {
    private final int loyaltyPointsThreshold = 500;
    private int loyaltyPoints;
    private float discount;

    public RegularClient() {
        super();
    }

    public RegularClient(String firstName, String secondName) {
        super(firstName, secondName);
    }
    public void ResetLoyaltyPoints() {
        if (this.loyaltyPoints >= loyaltyPointsThreshold)
            this.loyaltyPoints -= loyaltyPointsThreshold;
    }

    public void RegisterPurchase() {

    }

    public float GetDiscountValue() {
        return 0f;
    }

    @Override
    public void DrawOnMap() {

    }

    @Override
    public void AddMapDescription() {

    }

    @Override
    public String getClientType() {
        return "Klient regularny";
    }

    @Override
    public void run() {
        ;
    }
}
