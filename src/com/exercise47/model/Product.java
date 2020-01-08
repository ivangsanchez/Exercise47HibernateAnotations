package com.exercise47.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="productos")
public class Product {
	@Id
	@Column(name="Id_Producto")
	private int idProduct;
	@Column(name="Nombre_Producto")
	private String nameProduct;
	@Column(name="Precio_Producto")
	private double priceProduct;
	
	public Product() {
		
	}

	public Product(int idProduct, String nameProduct, double priceProduct) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", priceProduct=" + priceProduct
				+ "]";
	}
	
	

}
