package midtermexam;
import java.util.Random;
import java.util.Scanner;
public class Exam3 {
	/*
	 * �ĤT�D �q�Ʀr�{�� 20��
	 *  1. �����ͤ@�Ӥ���1��10���üơA�����K�Ʀr (���]�O7) 
	 *  2. ���ϥΪ̲q�o�ӼƦr�A�p�U: Your guess:	 * 5(�ϥΪ̲q5) 
	 *  3. ���ܨϥΪ̭n���@�I�ΧC�@�I�A�A�ХL�q�U�@���A�p�U: 
	 *  higher 
	 *  Your guess: 9(�ϥΪ̲q9) 
	 *  lower
	 * 4. ��ϥΪ̲q�����K�Ʀr�ɡA�L�X: Great! The secret number is 7
	 * 
	 * ����: �bwhile�j�餤�i�ϥ�break���O���X�j��~�C �� �Y���Q�����O�]�p�������D�A�[�������C
	 * 
	 * �ĥ|�D �p��q�X�� 10�� �ӲĤT�D�A�p�G�ϥΪ̲q�G���H��(�]�A�G��)�q��ɡA�����: Excellent! The secret number
	 * is 7
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int correct = random.nextInt(10) + 1;
		System.out.println(correct);
		System.out.printf("please choose a number from 1 to 10.\nYour guess:\n");
		int count = 0;
		while (true) {
			count++;
			int g = scanner.nextInt();
			scanner.nextLine();
			Exam3Random ramdon = new Exam3Random(correct, g);
			if (g != correct) {
				ramdon.number();
			} else {
				if (count <=2) {
					System.out.printf("Excellent!! The secret number is %d!", correct);
					break;
				} else {
					System.out.printf("Great!! The secret number is %d!", correct);
					break;
				}

			}
		}
	}

}
