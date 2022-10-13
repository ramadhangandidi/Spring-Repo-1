package com.example.springramadhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springramadhan.dto.TahunAndNilai;
import com.example.springramadhan.model.Skripsi;
import com.example.springramadhan.service.ISkripsiService;

import lombok.Data;

@RestController
@RequestMapping("/api")
public class SkripsiController {
	
	@Autowired
	ISkripsiService skripsiService;
	
	@PostMapping("/post/skripsi")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Skripsi post(@RequestBody Skripsi skripsi) {
		return skripsiService.insert(skripsi);
	}
	
	@GetMapping("/get/belowyear/{tahun}")
	public List<Skripsi> getBelowYear(@PathVariable int tahun){
		var result = skripsiService.getBelowYear(tahun); 
		return result;
	}
	
	@GetMapping("/get/byword/{kata}")
	public List<Skripsi> getByWord(@PathVariable String kata){
		var result = skripsiService.getByWord(kata);
		
		return result;
	}
	
	@GetMapping("/get/bytahunandnilai")
	public List<Skripsi> getByTahunAndNilai(@RequestBody TahunAndNilai obj){
		
		var result = skripsiService.getByTahunAndNilai(obj);		
		return result;
	}
	
	@GetMapping("/get/exceptyear/{tahun}")
	public List<Skripsi> getAllExceptYear(@PathVariable int tahun){
		var result = skripsiService.getAllExceptYear(tahun);
		return result;
	}
	
	@GetMapping("/get/allascending/{karakter}")
	public List<Skripsi> getAllAscending(@PathVariable char karakter){
		var result = skripsiService.getAllAscending(karakter);
		
		return result;
	}
	
	@PutMapping("/put/updateSkripsi")
	public ResponseEntity<String> updateSkripsi(@RequestBody Skripsi skripsi){
		skripsiService.updateSkripsi(skripsi);
		return ResponseEntity.status(HttpStatus.GONE).body("Data Sudah terupdate");
	}
	
}
