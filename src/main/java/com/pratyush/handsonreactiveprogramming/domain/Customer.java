package com.pratyush.handsonreactiveprogramming.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Document
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Customer {

    @Id
    private String id;
    @NotBlank(message = "FirstName is Required.")
    private String firstName;
    @NotBlank(message = "LastName is Required.")
    private String lastName;
    private String gender;
    @NotBlank(message = "Email is Required.")
    private String email;
    @NotBlank(message = "BirthDate is Required.")
    private String company;
    private Date dob;
    private String imageUrl;
    private String JobTitle;

}

/*
    ObjectId
    String
    Array
    Binary
    Boolean
    Date
    Decimal128
    Double
    Int32
    Int64
 */