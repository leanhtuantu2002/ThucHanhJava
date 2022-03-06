import java.util.Scanner;
public class AppBai5 {
    public static void main(String[] args) {
        float sum = 0, number;
        Scanner scanner = new Scanner(System.in);
             
        do {
            System.out.println("Nhap vào so nguyen:");
            number = scanner.nextFloat();
            sum += number;
                 
            // nếu tổng lớn hơn 100 thì kết thúc vòng lặp
            if (sum > 100)
                break;
        } while (number > 0);
             
        System.out.println("Tong = " + sum);
    }
}
