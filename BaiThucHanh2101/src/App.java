import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a (a # 0): ");
        a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        c = scanner.nextDouble();
        System.out.println("Phuong trinh bac hai vua nhap co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phuong trinh co 1 nghiem la x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
