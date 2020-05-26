package com.hrdata.demo.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Data
@ToString
@Document(collection = "my_log")
public class MyLog {
    @Id
    private String id;
    private Date ts;
    private String level;
    private String msg;
    private String thread;
}
