package com.example.springramadhan.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springramadhan.model.Skripsi;
import com.example.springramadhan.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository{
	
	JdbcTemplate jdbcTemplate;

	@Override
	public Skripsi getBelowYear(int tahun) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM t_skripsi WHERE tahun < ?";		
		
		jdbcTemplate.queryForObject(query, new Object[]{tahun}, String.class);
		
		
		return null;
	}

	@Override
	public Skripsi getByWord(String kata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skripsi getByTahunAndNilai(int tahun, int nilai) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skripsi getAllExceptYear(int tahun) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skripsi getAllAscending() {
		// TODO Auto-generated method stub
		return null;
	}

}
