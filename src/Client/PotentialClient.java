package Client;

/**
 * Created by Jakub on 04.12.2016.
 */
public class PotentialClient extends IndividualClient {
    //ask a potential client whether is not eager for registration
    public boolean ProposeLoyaltyCard() {
        return false;
    }

    public RegularClient TransformToRegularClient() {
        return null;
    }
}
