import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();

        if (a == 0 || b == 0)
            System.out.println("Error");

        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }

        System.out.println("Ước chung lớn nhất là : " + a);

    }

}
