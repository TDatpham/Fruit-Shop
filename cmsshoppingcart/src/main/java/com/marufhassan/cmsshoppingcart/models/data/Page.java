package com.marufhassan.cmsshoppingcart.models.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "pages")
@Data
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2, message = "Title must be 2 characters long")
    private String title;

    private String slug;

    @Size(min = 5, message = "Content must be 5 characters long")
    private String content;

	private int sorting;

	public String getSlug() {
		// TODO Auto-generated method stub
		return slug;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public void setSlug(String slug2) {
		// TODO Auto-generated method stub
		this.slug=slug2;
	}



	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public int getSorting() {
		return sorting;
	}

	public void setSorting(int sorting) {
		this.sorting = sorting;
	}
	public @Size(min = 5, message = "Content must be 5 characters long") String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}