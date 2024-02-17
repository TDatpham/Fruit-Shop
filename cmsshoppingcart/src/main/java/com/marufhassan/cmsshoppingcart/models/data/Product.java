package com.marufhassan.cmsshoppingcart.models.data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    @SuppressWarnings("unused")
	private String slug;

    @Size(min = 5, message = "Description must be at least 5 characters long")
    private String description;

    private String image;

    @Pattern(regexp = "^[0-9]+([.][0-9]{1,2})?", message = "Expected format: 5, 5.99, 15, 15.99")
    private String price;

    @Pattern(regexp = "^[1-9][0-9]*", message = "Please choose a category")
    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setSlug(String slug2) {
		// TODO Auto-generated method stub
		this.slug=slug2;
		}

	public void setImage(String filename) {
		// TODO Auto-generated method stub
		this.image=filename;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		this.description=description;
	}

	public @Size(min = 5, message = "Description must be at least 5 characters long") String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	public void setCategoryId(String categoryId) {
		// TODO Auto-generated method stub
		this.categoryId=categoryId;
	}

	public @Pattern(regexp = "^[1-9][0-9]*", message = "Please choose a category") String getCategoryId() {
		// TODO Auto-generated method stub
		return categoryId;
	}
	
	public void setCreatedAt(LocalDateTime createdAt) {
		// TODO Auto-generated method stub
		this.createdAt=createdAt;
	}

	public LocalDateTime getCreatedAt() {
		// TODO Auto-generated method stub
		return createdAt;
	}
	
	public void setUpdatedAt(LocalDateTime updatedAt) {
		// TODO Auto-generated method stub
		this.updatedAt=updatedAt;
	}

	public LocalDateTime getUpdatedAt() {
		// TODO Auto-generated method stub
		return updatedAt;
	}
}
