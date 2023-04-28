package edu.cscc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {
	public Store() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public int storeNumber;
	
	public String phoneNumber;
	
	public String streetAddress;
	
	public String city;
	
	public String state;
	
	public int zipCode;
	
	public boolean hasSpa;
	
	public boolean hasHotel;
	
	public int foundingYear;
}
