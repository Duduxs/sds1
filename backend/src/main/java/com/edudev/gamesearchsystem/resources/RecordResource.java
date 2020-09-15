package com.edudev.gamesearchsystem.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edudev.gamesearchsystem.dto.RecordDTO;
import com.edudev.gamesearchsystem.dto.RecordInsertDTO;
import com.edudev.gamesearchsystem.services.RecordService;

@RestController
@RequestMapping(value="/records")
public class RecordResource {

	@Autowired
	private RecordService recordService; 
	
	@PostMapping	
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO entity){
		return ResponseEntity.ok().body(recordService.insert(entity));
	}
}
