package com.rtexamples;

public class Product {

	private int pid;
	private String pname;
	private String pcategory;
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, String pcategory, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcategory = pcategory;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid = " + pid + ", pname = " + pname + ", pcategory = " + pcategory + ", price = " + price + "]";
	}

}
