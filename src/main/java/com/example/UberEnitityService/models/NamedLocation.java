package com.example.UberEnitityService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NamedLocation extends BaseModel{

    @OneToOne
    private ExactLocation exactLocation;

    private String name;

    private String zipCode;

    private String city;

    private String country;

    private  String state;
}
