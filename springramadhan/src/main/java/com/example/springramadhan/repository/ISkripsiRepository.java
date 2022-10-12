package com.example.springramadhan.repository;

import com.example.springramadhan.model.Skripsi;

public interface ISkripsiRepository {
	public Skripsi getBelowYear(int tahun);
	
	public Skripsi getByWord(String kata);
	
	public Skripsi getByTahunAndNilai(int tahun, int nilai);
	
	public Skripsi getAllExceptYear(int tahun);
	
	public Skripsi getAllAscending();
}
