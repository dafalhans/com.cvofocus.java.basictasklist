package com.cvofocus.java.basictasklist.business.repository;

import com.cvofocus.java.basictasklist.business.domain.AddressEntity;
import com.cvofocus.java.basictasklist.business.domain.PersonEntity;
import com.cvofocus.java.basictasklist.business.domain.TaskEntity;
import com.neovisionaries.i18n.CountryCode;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class TaskRepo {

    private List<TaskEntity> taskEntities;

    public TaskRepo() {
        taskEntities = new ArrayList<>();
    }

    @PostConstruct
    protected void init(){

        AddressEntity address1 = new AddressEntity();
        address1.setHouseNumber(27);
        address1.setPostalCode(9270);
        address1.setStreet("Holeindestraat");
        address1.setCc(CountryCode.BE);

        PersonEntity person1 = new PersonEntity();
        person1.setFirstName("Hans");
        person1.setLastName("Vandeweghe");
        person1.setAddress(address1);

        TaskEntity t1 = new TaskEntity();
        t1.setDescription("this is task 1");
        t1.setExecutor(person1);
        t1.setDueDate(Date.from(Instant.now()));

        TaskEntity t2 = new TaskEntity();
        t2.setDescription("this is task 2");
        t2.setExecutor(person1);
        t2.setDueDate(Date.from(Instant.now().plus(10, ChronoUnit.DAYS)));

        taskEntities.add(t1);
        taskEntities.add(t2);

    }
}
