package com.github.tiagogomes187.citiesapi.countries.repositories;

import com.github.tiagogomes187.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
