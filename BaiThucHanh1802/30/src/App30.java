import java.util.Scanner;
 
public class App30 {
 
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào 1 số nguyên dương: ");
        number = scanner.nextInt();
         
        while (number <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Vui lòng mời bạn nhập lại: ");
            number = scanner.nextInt();
        }
         
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
         
        System.out.println("Tổng các chữ số = " + sum);
    }
 
}