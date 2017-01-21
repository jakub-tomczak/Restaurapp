package Client;

import Map.Localizable;

/**
 * Created by Jakub on 04.12.2016.
 */
public class PotentialClient extends IndividualClient implements Localizable {
    //ask a potential Client whether is not eager for registration
    public PotentialClient(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public PotentialClient() {
        super();
    }

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

    @Override
    public String getClientType() {
        return "Potencjalny klient";
    }

    @Override
    public void run() {
//        while (true) {
//            System.out.println("Potential client wykonuje prace");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
