package Client;

import Map.Localizable;

/**
 * Created by Jakub on 04.12.2016.
 */
public class RegularClient extends IndividualClient implements Localizable {
    private int loyaltyPoints;
    private float discount;

    public void ResetLoyaltyPoints() {

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
}
