package midtermexam;

public class Exam3Random {
	int correct;
	int g;

	public Exam3Random(int correct, int g) {
		this.correct = correct;
		this.g = g;
	}

	public void number() {
		if (g > correct) {
			System.out.print("lower " + "\n" + "Your guess: ");
		} else if (g < correct) {
			System.out.print("higher" + "\n" + "Your guess: ");
		}
	}
}
