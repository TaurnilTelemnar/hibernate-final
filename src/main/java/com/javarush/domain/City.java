package com.javarush.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(schema = "world", name = "city")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {

    @Id
    @Column(name = "id")
    //Integer
    private Integer cityId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "district")
    private String district;

    @Column(name = "population")
    //Integer
    private Integer population;
}
