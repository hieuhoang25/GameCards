package GenericCards;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards cards = new Cards();
		Scanner sc= new Scanner(System.in);
		
		int cn=0;
		do {
			System.out.println(">>>>> Game Bài Tả Lả <<<<<<<");
			System.out.println("1. Xào bài");
			System.out.println("2. Chia bài cho 2 người");
			System.out.println("3. Chia bài cho 3 người");
			System.out.println("4. Chia bài cho 4 người");
			System.out.println("0. Thoát game");
			System.out.println("Chọn chức năng:");
			cn=sc.nextInt();
			switch (cn) {
			case 1:
				cards.shuffleCardPack();
				System.out.println("Xòa bài thành công!");
				break;
			case 2:
				cards.dealingCards("HiếuIT", "Kelvin Cường");
				break;
			case 3:
				cards.dealingCards("Hiếu IT", "Kelvin Cường", "Kiên Bo");
				break;
			case 4:
				cards.dealingCards("Hiếu IT", "Kelvin Cường", "Kiên Bo", "Cún");
				break;
			default:
				break;
			}
			
		} while (cn!=0);
	}

}
