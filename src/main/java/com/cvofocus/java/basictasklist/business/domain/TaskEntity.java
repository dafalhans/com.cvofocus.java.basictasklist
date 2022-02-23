package com.cvofocus.java.basictasklist.business.domain;

import lombok.Data;
import java.util.Date;

@Data
public class TaskEntity {

    private PersonEntity executor;
    private String description;
    private Date dueDate;


}
