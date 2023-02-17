import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input n: ");
        int n = iScanner.nextInt();
        int t = n * (n + 1) / 2;
        iScanner.close();
        System.out.println(t);
    }
}