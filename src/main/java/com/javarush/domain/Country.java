package com.javarush.domain;

import com.javarush.converter.YearToIntegerConverter;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Collection;

@Entity
@Table(schema = "world", name = "country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {

    @Id
    @Column(name = "id")
    //Integer
    private Integer countryId;

    @OneToOne
    @JoinColumn(name = "capital")
    private City city;

    @Column(name = "code")
    private String code;

    @Column(name = "code_2")
    private String alternativeCode;

    @Column(name = "name")
    private String name;

    @Column(name = "continent")
    @Enumerated(value = EnumType.ORDINAL)
    private Continent continent;

    @Column(name = "region")
    private String region;

    @Column(name = "surface_area")
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    @Convert(converter = YearToIntegerConverter.class)
    private Year independenceYear;

    @Column(name = "population")
    //Integer
    private Integer population;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    private BigDecimal gnp;

    @Column(name = "gnpo_id")
    private BigDecimal gnpoId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Collection<CountryLanguage> countryLanguages;

}
