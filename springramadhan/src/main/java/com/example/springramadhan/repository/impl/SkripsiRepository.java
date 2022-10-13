package com.example.springramadhan.repository.impl;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springramadhan.dto.TahunAndNilai;
import com.example.springramadhan.model.Skripsi;
import com.example.springramadhan.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Skripsi insert(Skripsi skripsi) {
		// TODO Auto-generated method stub
		
		String query = "insert into tb_skripsi (judul, nilai, tahun) values (?,?,?)";

		// DML - jdbc method = update
		jdbcTemplate.update(query, new Object[] { skripsi.getJudul(), skripsi.getNilai(), skripsi.getTahun() });

		return skripsi;
	}

	@Override
	public List<Skripsi> getBelowYear(int tahun) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_skripsi WHERE tahun < ?";
		
		var result = jdbcTemplate.query(query, new Object[]{tahun}, new int[] {Types.INTEGER}, new BeanPropertyRowMapper(Skripsi.class));
		
		return result;
	}

	@Override
	public List<Skripsi> getByWord(String kata) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_skripsi WHERE judul LIKE ?";
		
		var result = jdbcTemplate.query(query, new Object[]{"%"+kata+"%"}, new int[] {Types.VARCHAR}, new BeanPropertyRowMapper(Skripsi.class));
		
		return result;
	}

	@Override
	public  List<Skripsi> getByTahunAndNilai(TahunAndNilai obj) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_skripsi WHERE tahun = "+obj.getTahun()+" AND nilai = "+obj.getNilai();
				
		var result  =  jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Skripsi.class));
		
		return result;
	}

	@Override
	public List<Skripsi> getAllExceptYear(int tahun) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_skripsi WHERE tahun != "+tahun;
		
		var result  =  jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Skripsi.class));
		
		return result;
	}

	@Override
	public List<Skripsi> getAllAscending(char karakter) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM db_kampus.tb_skripsi WHERE judul NOT LIKE '"+karakter+"%' ORDER BY tahun ASC";
		
		var result  =  jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Skripsi.class));
		
		return result;
	}

	@Override
	public void updateSkripsi(Skripsi skripsi) {
		// TODO Auto-generated method stub
		String query = "UPDATE tb_skripsi SET judul = '"+skripsi.getJudul()+"', nilai = "+skripsi.getNilai()+", tahun = "+skripsi.getTahun()+" WHERE id ="+skripsi.getId();
		jdbcTemplate.update(query);
	}

	

}
