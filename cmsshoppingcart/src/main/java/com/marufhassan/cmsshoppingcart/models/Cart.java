package com.marufhassan.cmsshoppingcart.models;

import lombok.Data;

@Data
public class Cart {
    private int id;
    private String name;
    private String price;
    private int quantity;
    private String image;

    public Cart(int id, String name, String price, int quantity, String image) {
        this.setId(id);
        this.setName(name);
        this.price = price;
        this.quantity = quantity;
        this.setImage(image);
    }

	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
