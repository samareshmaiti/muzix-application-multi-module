package com.stackroute.trackservice.domain;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Track {
    //variable Declaration
    @Id
    private int id;
    private String name;
    private String comment;
}
