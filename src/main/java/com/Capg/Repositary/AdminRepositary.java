package com.Capg.Repositary;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepositary extends JpaRepository<Admin,Integer>
{
  
}
