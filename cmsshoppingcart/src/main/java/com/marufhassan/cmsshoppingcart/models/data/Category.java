package com.marufhassan.cmsshoppingcart.models.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;
    
	private String slug;
	private int sorting;
    
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}


	public int getSorting() {
		return sorting;
	}


	public void setSorting(int sorting) {
		this.sorting = sorting;
	}
}
