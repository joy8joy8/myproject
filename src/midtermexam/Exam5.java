package midtermexam;

import java.util.Scanner;

public class Exam5 {
	/*
	 * 第五題 郵局便利箱 40分 假設郵局有兩種便利箱: Box5: 長23，寬14，高13 (cm) Box3: 長39.5，寬27.5，高23
	 * (cm) 1. 請利用物件導向的類別設計這兩個類別，並在這兩個類別中設計方法: public boolean validate(float
	 * length, float width, int height) {
	 * 
	 * } 並在這方法中設計會回傳(boolean)該箱子是否能容納傳入的長、寬、高的物體。
	 * 
	 * 2. 在本程式的main方法中設計讓使用者輸入他想寄送物件的長寬高，並 利用Box5與Box3兩個類別完成以下的設計: Please enter
	 * object's length: 15 Please enter object's width: 18 Please enter object's
	 * height: 10 Box5 或 Please enter object's length: 20 Please enter object's
	 * width: 11 Please enter object's height: 9 Box3 ● 判斷時未使用Box3與Box5類別 無分數
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Please enter object's length:");
		float a = scanner.nextFloat();
		scanner.nextLine();
		System.out.print(" Please enter object's width:");
		float b = scanner.nextFloat();
		scanner.nextLine();
		System.out.print(" Please enter object's height:");
		int c = scanner.nextInt();
		scanner.nextLine();
		Box3 one = new Box3(a, b, c);
		Box5 two = new Box5(a, b, c);

		if (two.validate()) {
			System.out.println("Box5");
		} else if (one.validate()) {
			System.out.println("Box3");
		} else {
			System.out.println("No box.");
		}
	}
}
