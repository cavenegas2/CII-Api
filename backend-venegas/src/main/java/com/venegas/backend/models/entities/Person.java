package com.venegas.backend.models.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class Person {
	@Column(name="first_name")
	private String fristName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="place_of_birth")
	private String placeOfBirth;
	@Column(name="birth")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar birth;
	@Column(name="number_card_id")
	private String numberCardId;
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	public String getNumberCardId() {
		return numberCardId;
	}
	public void setNumberCardId(String numberCardId) {
		this.numberCardId = numberCardId;
	}
	@Override
	public String toString() {
		return "Person [fristName=" + fristName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
