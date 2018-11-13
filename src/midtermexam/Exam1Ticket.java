package midtermexam;
import java.util.Scanner;
public class Exam1Ticket {

int all;
int round;
Scanner scanner = new Scanner(System.in);

public Exam1Ticket(int all, int round) {
	this.all = all;
	this.round = round;
}

public void price() {
	int a = (all - round) * 1000;
	double b = round * (2000*0.9);
	double c = a + b;
	System.out.printf("Total tickets: %d\nRound-trip: %d\nTotal:%.0f\n\n", all, round, c);
	System.out.println("Please press enter to start next booking.");
	scanner.nextLine();

}
}