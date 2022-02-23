package com.cvofocus.java.basictasklist.service.mapper;

import com.cvofocus.java.basictasklist.business.domain.AddressEntity;
import com.cvofocus.java.basictasklist.business.domain.PersonEntity;
import com.cvofocus.java.basictasklist.service.dto.Address;
import com.cvofocus.java.basictasklist.service.dto.Person;
import com.neovisionaries.i18n.CountryCode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.core.Constants;

@Mapper(componentModel = "spring")
public interface AddressMapper extends IMapper<AddressEntity, Address>{

    //@Override
    AddressEntity toEntity(Address address);

    //@Override
    @Mappings({
            @Mapping(source = "addressEntity.street", target = "street"),
            @Mapping(source = "addressEntity.houseNumber", target="houseNumber"),
            @Mapping(source = "addressEntity.postalCode", target="postalCode"),
            @Mapping(source = "addressEntity.cc",target="cc", qualifiedByName = "countryCodeEnumToString")
    })
    Address toDTO(AddressEntity addressEntity);


    @Named("countryCodeEnumToString")
    default String countryCodeEnumToString(CountryCode cc) {
        String value = null;
        value = cc.getName();
        //value = cc.getAlpha3();
        return value;
    }
 


}
