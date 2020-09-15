package com.edudev.gamesearchsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edudev.gamesearchsystem.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
