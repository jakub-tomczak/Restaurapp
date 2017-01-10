package Client;

import Map.Localizable;

/**
 * Created by Jakub on 04.12.2016.
 */
public class PotentialClient extends IndividualClient implements Localizable {
    //ask a potential Client whether is not eager for registration
    public boolean ProposeLoyaltyCard() {
        return false;
    }

    public RegularClient TransformToRegularClient() {
        return null;
    }

    @Override
    public void DrawOnMap() {

    }

    @Override
    public void AddMapDescription() {

    }
}
