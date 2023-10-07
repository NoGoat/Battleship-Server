package com.battleship.server.Repository;

import com.battleship.server.Entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultsRepository extends JpaRepository<Results, Integer> {
}
