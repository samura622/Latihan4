import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            }

            System.out.print("Masukkan angka: ");
            double num = scanner.nextDouble();
            numbers.add(num);

            switch (choice) {
                case 1:
                    double sqrtResult = Math.sqrt(num);
                    System.out.println("Hasil akar kuadrat dari " + num + " adalah " + sqrtResult);
                    break;
                case 2:
                    System.out.print("Masukkan pangkat: ");
                    double power = scanner.nextDouble();
                    double powResult = Math.pow(num, power);
                    System.out.println(num + " pangkat " + power + " adalah " + powResult);
                    break;
                case 3:
                    double logResult = Math.log(num);
                    System.out.println("Logaritma natural dari " + num + " adalah " + logResult);
                    break;
                case 4:
                    double factResult = factorial(num);
                    System.out.println("Faktorial dari " + (int) num + " adalah " + factResult);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih operasi yang benar.");
            }
        }
    }

    private static double factorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}