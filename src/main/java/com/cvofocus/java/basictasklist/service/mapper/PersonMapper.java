package com.cvofocus.java.basictasklist.service.mapper;

import com.cvofocus.java.basictasklist.business.domain.PersonEntity;
import com.cvofocus.java.basictasklist.service.dto.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses= {AddressMapper.class})
public interface PersonMapper extends IMapper<PersonEntity, Person>{

    //@Override
    PersonEntity toEntity(Person person);

    //@Override
    Person toDTO(PersonEntity personEntity);
}