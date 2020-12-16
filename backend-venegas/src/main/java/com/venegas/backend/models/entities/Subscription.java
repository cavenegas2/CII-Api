package com.venegas.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Subscriptions")
public class Subscription implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_subscription")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idSubscription;
	@Column(name="from_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fromDate;
	@Column(name="to_Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar toDate;
	@Column(name="grade", length=1)
	private String grade;
	
	@JoinColumn(name="fk_student",referencedColumnName="id_student")
	@ManyToOne
	private Student student;
	
	@JoinColumn(name="fk_club",referencedColumnName="id_club")
	@ManyToOne
	private Club club;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subscription() {
		super();
	}
	public Subscription(Long idSubscription) {
		super();
		this.idSubscription = idSubscription;
	}
	public Long getIdSubscription() {
		return idSubscription;
	}
	public void setIdSubscription(Long idSubscription) {
		this.idSubscription = idSubscription;
	}
	public Calendar getFrom() {
		return fromDate;
	}
	public void setFrom(Calendar from) {
		this.fromDate = from;
	}
	public Calendar getTo() {
		return toDate;
	}
	public void setTo(Calendar to) {
		this.toDate = to;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
