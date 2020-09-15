package com.edudev.gamesearchsystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edudev.gamesearchsystem.dto.GameDTO;
import com.edudev.gamesearchsystem.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameResource {

	@Autowired
	GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		return ResponseEntity.ok().body(gameService.findAll());
	}
	
	
}
