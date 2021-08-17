package com.github.rednand.cities.api.countries.repository;

import com.github.rednand.cities.api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {

}
