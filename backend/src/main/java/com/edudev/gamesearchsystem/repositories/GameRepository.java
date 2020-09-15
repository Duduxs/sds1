package com.edudev.gamesearchsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edudev.gamesearchsystem.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
