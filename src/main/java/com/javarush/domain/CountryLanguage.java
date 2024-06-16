package com.javarush.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryLanguage {

    @Id
    @Column(name = "id")
    //Integer
    private Integer languageId;

    @Column(name = "language")
    private String language;

    @Column(name = "is_official")
    private Boolean isOfficial;

    @Column(name = "percentage")
    private BigDecimal percentage;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
