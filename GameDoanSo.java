package lab1;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String tiepTuc;

		do {
			int soCuaMay = random.nextInt(101);
			int soLanDoan = 0;
			int toiDa = 7;
			boolean daThang = false;

			System.out.println("=== CHÀO MỪNG BẠN ĐẾN VỚI GAME ĐOÁN SỐ ===");
			System.out.println("Máy đã chọn một số trong khoảng [0..100].");
			System.out.println("Bạn có tối đa " + toiDa + " lần để đoán!");
			while (soLanDoan < toiDa) {
				soLanDoan++;
				System.out.print("\nLần đoán thứ " + soLanDoan + ": ");
				int soNguoiChoi = scanner.nextInt();

				if (soNguoiChoi == soCuaMay) {
					System.out.println("Chúc mừng! Bạn đã đoán ĐÚNG số " + soCuaMay);
					daThang = true;
					break;
				} else if (soNguoiChoi < soCuaMay) {
					System.out.println("Số bạn đoán NHỎ HƠN số của máy.");
				} else {
					System.out.println("Số bạn đoán LỚN HƠN số của máy.");
				}
				if (soLanDoan < toiDa) {
					System.out.println("Bạn còn " + (toiDa - soLanDoan) + " lượt đoán.");
				}
			}
			if (!daThang) {
				System.out.println("\nGAME OVER nha thím! Bạn đã hết 7 lần đoán.");
				System.out.println("Số đúng là: " + soCuaMay);
			}
			System.out.print("\nBạn có muốn chơi tiếp không? (c/k): ");
			tiepTuc = scanner.next();

		} while (tiepTuc.equalsIgnoreCase("c"));

		System.out.println("Cảm ơn bạn đã chơi game. Tạm biệt!");
		scanner.close();
	}
}