package com.cvofocus.java.basictasklist.business.domain;

import com.neovisionaries.i18n.CountryCode;
import lombok.Data;



@Data
public class AddressEntity {

    //private String country; // ENUM?
    private CountryCode cc;
    private String street;
    private int houseNumber;
    private int postalCode;

}
