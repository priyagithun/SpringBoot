package com.Capg.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Table 
{
  private int id;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId()

{
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Table [id=" + id + "]";
}
  
}
