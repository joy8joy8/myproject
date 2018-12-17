package com.ticket;

public class TicketRunner {

		/*  Result:
		 *  Taipei    Keelung  37   2  74
		 *  TaiChung  Taipei   285  1  285
		 * 
		 */
		public static void main(String[] args) {
			Order order = new Order();
			//origin, destination, price, quantity
			Ticket ticket = new Ticket("Taipei", "Keelung", 37, 2);
			order.add(ticket);
			ticket = new Ticket("TaiChung", "Taipei", 285, 1);
			order.add(ticket);
			order.print();
		}
	
}
