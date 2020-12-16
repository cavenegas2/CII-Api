package com.venegas.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Students")
public class Student extends Person implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_student")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idStudent;
	@Column(name="address")
	private String address;
	@Column(name="start_form")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar starForm;
	
	//** Cardinalidad uno a varios**//
	
	@OneToMany(mappedBy="student", fetch=FetchType.LAZY) //student apunta al atributo en la clase subscription
	private List<Subscription> subscriptions;
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}


	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}


	public Student() {
		super();
	}


	public Student(Long idStudent) {
		super();
		this.idStudent = idStudent;
	}


	public Long getIdStudent() {
		return idStudent;
	}


	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Calendar getStarForm() {
		return starForm;
	}


	public void setStarForm(Calendar starForm) {
		this.starForm = starForm;
	}
	
	
	
}
