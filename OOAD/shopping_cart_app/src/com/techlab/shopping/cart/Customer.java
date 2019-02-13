package com.techlab.shopping.cart;
import java.util.ArrayList;

import com.techlab.shopping.cart.Order;


public class Customer {
	private String fname;
	private String lname;
	private String address;
	private String mobileNo;
	ArrayList<Order>orderList=new ArrayList<Order>();
	
	public Customer(String fname,String lname,String address,String mobileNo){
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.mobileNo=mobileNo;
		
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getAddress() {
		return address;
	}
	public String getMobileNo(){
		return mobileNo;
		
	}
	
	public void placeOrder(Order order){
		orderList.add(order);
		
	}
	
	public ArrayList<Order> getOrder() {
		return orderList;
	}
	
	

}
