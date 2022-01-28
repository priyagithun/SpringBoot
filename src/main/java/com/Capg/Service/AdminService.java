package com.Capg.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.Capg.Repositary.AdminRepositary;

@Service
@Transactional
public class AdminService
{
	@Autowired
	private AdminRepositary adminRepositary;
	public List<Admin> listAllAdmin()
	{
		return adminRepositary.findAll();
	}
	public Admin getAdmin(int id)
	{
		return adminRepositary.findById(id).get();
	}
	public void updateAdmin(Integer id,Admin admin)
	{
		adminRepositary.save(admin);
	}
	public void deleteAdmin(Integer id)
	{
		adminRepositary.deleteById(id);
	}
  
}
