package org.springframework.example;

import java.io.Serializable;

public class Item implements Serializable{

	private static final long serialVersionUID = -3955179670343181021L;

	private String sku;
	
	private String area;
	
	private Integer stock;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("ITEM(");
		str.append("sku:");
		str.append(sku);
		str.append(",area:");
		str.append(area);
		str.append(",stock:");
		str.append(stock);
		str.append(")");
		return str.toString();
	}
}