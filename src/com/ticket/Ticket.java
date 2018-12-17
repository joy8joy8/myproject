package com.ticket;

public class Ticket {
	//, , price, quantity
	String origin;
	String destination;
	int price;
	int quantity;
	public Ticket(String origin,String destination,	int price,int quantity) {
		this.destination=destination;
		this.origin=origin;
		this.price=price;
		this.quantity=quantity;
	}	
	public String get() {
		int spend=price*quantity;
		String g=(origin+"\t"+destination+"\t"+price+"\t"+quantity+"\t"+spend);
		return g;
	}
	
	
}
