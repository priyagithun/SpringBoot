package com.Capg.RestController;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Capg.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminRestController 
{
   @Autowired
   AdminService adminService;
   @PutMapping("/{id}")
   public ResponseEntity<?> update(@RequestBody Admin admin, @PathVariable Integer id)
   {
	   try 
	   {
           adminService.getAdmin(id);
           return new ResponseEntity<>(HttpStatus.OK);
       } 
	   catch (NoSuchElementException e)
	   {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }
   @DeleteMapping("/{id}")
   public void delete(@PathVariable Integer id)
   {
	   adminService.deleteAdmin(id);
   }
}
