package Client;

import Map.Localizable;

/**
 * Created by Jakub on 04.12.2016.
 */
public class CorporateClient extends Client implements Localizable {
    private Address letterAddress;
    private String bankAccountNumber;
    private String REGON;

    public CorporateClient() {
        letterAddress = null;
        bankAccountNumber = null;
        REGON = null;
    }

    public CorporateClient(String bankAccountNumber, String REGON) {
        this.bankAccountNumber = bankAccountNumber;
        this.REGON = REGON;
        this.letterAddress = address;
    }

    public CorporateClient(Address letterAddress, String bankAccountNumber, String REGON) {
        this(bankAccountNumber, REGON);
        this.letterAddress = letterAddress;
    }

    @Override
    public void DrawOnMap() {

    }

    @Override
    public void AddMapDescription() {

    }
}
