package com.github.tiagogomes187.citiesapi.staties.repositories;

import com.github.tiagogomes187.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
