package com.venegas.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Categories")
@Entity
public class Category implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_category")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategory;
	@Column(name="description")
	private String description;
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="category", fetch=FetchType.LAZY) //student apunta al atributo en la clase subscription
	private List<Subject> subjects;
	
	
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public Category() {
		super();
	}
	public Category(Long id) {
		super();
		this.idCategory=id;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}