package com.ezeu.firstrestapi;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
	private int id;
	private String itemname;
	private float price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", price=" + price + "]";
	}
	
	
}
