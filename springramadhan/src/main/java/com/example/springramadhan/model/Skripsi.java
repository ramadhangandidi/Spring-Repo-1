package com.example.springramadhan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_skripsi")
@Data
public class Skripsi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String judul;
	private int nilai;
	private int tahun;
	
}
