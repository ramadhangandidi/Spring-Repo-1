package com.example.springramadhan.service;

import java.util.List;

import com.example.springramadhan.dto.TahunAndNilai;
import com.example.springramadhan.model.Skripsi;

public interface ISkripsiService {
	public Skripsi insert(Skripsi skripsi);
	
	public List<Skripsi> getBelowYear(int tahun);
	
	public List<Skripsi> getByWord(String kata);
	
	public List<Skripsi> getByTahunAndNilai(TahunAndNilai obj);
	
	public List<Skripsi> getAllExceptYear(int tahun);
	
	public List<Skripsi> getAllAscending(char karakter);
	
	public void updateSkripsi(Skripsi skripsi);
}
