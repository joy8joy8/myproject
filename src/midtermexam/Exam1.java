package midtermexam;
import java.util.Scanner;
public class Exam1 {
	/*
	 * �Ĥ@�D �q���{�� 20�� ���]�u���x�_�찪�������A��{����1000���A�Ӧ^����2000���A���E�� �г]�p���{���A���L�����H�U�W�d
	 * (���糧�D�~������) 1. �߰ݨϥΪ̭n�ʶR�i�ơA�p�U: Please enter number of tickets: 2.
	 * ���o�ϥΪ̿�J���i�ƫ�A�A�߰ݴX�i�Ӧ^���A�p�U: How many round-trip tickets: 3.
	 * �̫�L�X�������i�ơB�Ӧ^���ƻP�`���B�A�p�U: Total tickets: 5 Round-trip: 3 Total: 7400 4.
	 * �����ᵲ���{���Y�i �� �Y���Q�����O�]�p�������D�A�[�������C
	 * 
	 * �ĤG�D �s��q���\�� 10�� �ӲĤ@�D�A�Х[�J���n���]�p�A���{������s��q�� (�q���@����A�~��U�@���q��)
	 * ���ϥΪ̷Q�����q���ɡA�u�n�ʶR�i�ƿ�J -1 �A�Y�����{���C �� �C���q�������G���n���T�~�����C
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Please enter number of tickets: ");
			int a = scanner.nextInt();
			if (a == -1){ 
				System.out.println("Thanks for your booking.");
				break;
			}
			System.out.print("How many round-trip tickets: ");
			int b = scanner.nextInt();
			int price=1000;
			Exam1Ticket one = new Exam1Ticket(a, b,price);
			one.price();
	}

}
}