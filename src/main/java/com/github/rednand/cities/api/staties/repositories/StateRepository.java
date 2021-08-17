package com.github.rednand.cities.api.staties.repositories;

import com.github.rednand.cities.api.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

