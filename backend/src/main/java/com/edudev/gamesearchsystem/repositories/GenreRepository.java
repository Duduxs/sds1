package com.edudev.gamesearchsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edudev.gamesearchsystem.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
