package com.example.springramadhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springramadhan.dto.TahunAndNilai;
import com.example.springramadhan.model.Skripsi;
import com.example.springramadhan.repository.ISkripsiRepository;
import com.example.springramadhan.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService{
	
	@Autowired
	ISkripsiRepository skripsiRepository;

	@Override
	public Skripsi insert(Skripsi skripsi) {
		// TODO Auto-generated method stub
		return skripsiRepository.insert(skripsi);
	}

	@Override
	public List<Skripsi> getBelowYear(int tahun) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.getBelowYear(tahun); 
		return result;
	}

	@Override
	public List<Skripsi> getByWord(String kata) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.getByWord(kata);
		return result;
	}

	@Override
	public List<Skripsi> getByTahunAndNilai(TahunAndNilai obj) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.getByTahunAndNilai(obj);
		return result;
	}

	@Override
	public List<Skripsi> getAllExceptYear(int tahun) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.getAllExceptYear(tahun);
		
		return result;
	}

	@Override
	public List<Skripsi> getAllAscending(char karakter) {
		// TODO Auto-generated method stub
		var result = skripsiRepository.getAllAscending(karakter);
		return result;
	}

	@Override
	public void updateSkripsi(Skripsi skripsi) {
		// TODO Auto-generated method stub
		skripsiRepository.updateSkripsi(skripsi);
		
	}

}
