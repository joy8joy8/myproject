package midtermexam;
import java.util.Scanner;
public class Exam1Ticket {

int all;
int round;
int price;
Scanner scanner = new Scanner(System.in);

public Exam1Ticket(int all, int round,int price) {
	this.all = all;
	this.round = round;
	this.price=price;
	}

public void price() {
	int a = (all - round) * price;
	int b = round * (int)(2*price*0.9f);
	int c = a + b;
	System.out.printf("Total tickets: %d\nRound-trip: %d\nTotal:%d\n\n", all, round, c);
	System.out.println("Please press enter to start next booking.");
	scanner.nextLine();

}
}