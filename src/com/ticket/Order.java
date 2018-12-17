package com.ticket;

import java.util.ArrayList;

public class Order {
	ArrayList trip= new ArrayList();
	public void add(Ticket ticket) {
		trip.add(ticket);
	}
	public void print() {
		System.out.println("result¡G");
		for(int i=0;i<trip.size();i++) {
		Ticket a=(Ticket)trip.get(i);
		System.out.println(a.get());
	}
		}
	
}
