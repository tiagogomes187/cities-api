package com.github.tiagogomes187.citiesapi.states.repositories;

import com.github.tiagogomes187.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
