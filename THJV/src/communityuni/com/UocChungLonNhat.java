package communityuni.com;

import java.util.Scanner;
public class UocChungLonNhat {

    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean laSoHoanThien(int n) {
        if (n <= 0) return false;
        int tong = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static boolean laChuSoToanChan(int n) {
        n = Math.abs(n);
        if (n == 0) return true;
        while (n > 0) {
            if ((n % 10) % 2 != 0) return false;
            n /= 10;
        }
        return true;
    }

    public static double tinhS(double x, int n) {
        double tong = 0;
        for (int i = 0; i <= n; i++) {
            int soMu = 2 * i + 1;
            tong += Math.pow(x, soMu) / tinhGiaiThua(soMu);
        }
        return tong;
    }

    private static double tinhGiaiThua(int k) {
        double giaithua = 1;
        for (int i = 1; i <= k; i++) {
            giaithua *= i;
        }
        return giaithua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Bài tập thực hành ");

        System.out.print("Nhập a và b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("UCLN: " + timUCLN(a, b));

        System.out.print("\nNhập n kiểm tra số hoàn thiện: ");
        int nHT = sc.nextInt();
        System.out.println(nHT + (laSoHoanThien(nHT) ? " là số hoàn thiện." : " không là số hoàn thiện."));

        System.out.print("\nNhập n kiểm tra chữ số chẵn: ");
        int nC = sc.nextInt();
        System.out.println("Kết quả: " + (laChuSoToanChan(nC) ? "Toàn chữ số chẵn" : "Có chữ số lẻ"));

        System.out.print("\nNhập x và n cho biểu thức S(x, n): ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.printf("S(%.2f, %d) = %.6f\n", x, n, tinhS(x, n));

        sc.close();
    }
}